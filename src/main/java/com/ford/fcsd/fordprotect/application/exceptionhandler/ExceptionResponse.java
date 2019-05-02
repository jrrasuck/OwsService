package com.ford.fcsd.fordprotect.application.exceptionhandler;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 4722545054275313397L;
	
	LocalDateTime timeStamp;
	Integer httpStatus;
	String messageError;
	String message;
	String messageNotTranslated;
	String path;

}
