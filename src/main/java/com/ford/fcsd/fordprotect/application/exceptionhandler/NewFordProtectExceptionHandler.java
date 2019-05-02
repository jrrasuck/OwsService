package com.ford.fcsd.fordprotect.application.exceptionhandler;


import java.time.LocalDateTime;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ford.fcsd.fordprotect.api.contract.ConnectionStatus;
import com.ford.fcsd.fordprotect.api.contract.ServiceStatus;
import com.ford.fcsd.fordprotect.api.contract.response.GetContractListResponse;
import com.ford.fcsd.fordprotect.api.contract.response.NoContractsFoundRootResponse;

//@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class NewFordProtectExceptionHandler extends ResponseEntityExceptionHandler {
	
	@Autowired
	private MessageSource messageSource;
	
	@PostConstruct
	public void print() {
		System.out.println("Loading ExceptionHandler");
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<Object> handleMethodArgumentTypeMismatchException(
			MethodArgumentTypeMismatchException exception,
			HttpServletRequest request) {
		
		Locale locale = LocaleContextHolder.getLocale();
		Object[] args = new Object[] {exception.getName(), exception.getRequiredType().getName()};
				
		ExceptionResponse exceptionResponse = ExceptionResponse.builder()
				.timeStamp(LocalDateTime.now())
				.httpStatus(HttpStatus.BAD_REQUEST.value())
				.message(messageSource.getMessage("argument.type.mismatch"
						, args
						, locale))
				.messageError(exception.getMessage())
				.path(request.getRequestURI())
				.build();
		
		log(request, exceptionResponse);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionResponse);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException exception,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		Locale locale = LocaleContextHolder.getLocale();
		
		ExceptionResponse exceptionResponse = ExceptionResponse.builder()
				.timeStamp(LocalDateTime.now())
				.httpStatus(HttpStatus.BAD_REQUEST.value())
				.message(messageSource.getMessage(
						exception.getBindingResult().getFieldErrors().get(0)
						, locale))
				.messageNotTranslated(
						exception.getBindingResult().getFieldErrors().get(0).getField() + "_" + 
						exception.getBindingResult().getFieldErrors().get(0).getCode())
				.messageError(exception.getMessage())
				.path(request.getContextPath())
				.build();
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionResponse);
	}
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(ContractNotFoundException.class)
	public @ResponseBody NoContractsFoundRootResponse handler() {
		
		NoContractsFoundRootResponse response = new NoContractsFoundRootResponse();
		GetContractListResponse contractListResponse = new GetContractListResponse();
		
		response.setContractListResponse(contractListResponse);
		
		response.getContractListResponse().setConnectionStatus(
				new ConnectionStatus());
		
		response.getContractListResponse().setServiceStatus(
				new ServiceStatus());
		
		return response;		
	}
	
	private void log(HttpServletRequest request, ExceptionResponse exceptionResponse) {
		
		logger.error("----------------------------------");
		logger.error("Error: " + exceptionResponse.getMessageError());
		if (request.getParameterMap()!= null && !request.getParameterMap().isEmpty()) {
			logger.error("Parameters: ");
			request.getParameterMap().forEach((key, value) -> {				
				logger.error(key + " = " + request.getParameter(key)); 				
			});
		}
		logger.error("----------------------------------");
	}
	
}
