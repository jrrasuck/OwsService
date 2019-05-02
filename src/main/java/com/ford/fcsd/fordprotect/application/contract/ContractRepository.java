package com.ford.fcsd.fordprotect.application.contract;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ford.fcsd.fordprotect.application.exceptionhandler.ContractNotFoundException;

@Repository
public class ContractRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void getContract() {
		
		throw new ContractNotFoundException();
	}
	
	public void save(Long contractId) {

		Contract found = null;
		try {
			found = jdbcTemplate.queryForObject("select * from KTMCF20_CONTRACTS where id = ?",
					new Object[] { contractId }, new ContractRowMapper());
			System.out.println("Boleto já processado: " + found.getId());
		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Boleto não encontrado.. Inserindo");
			insertBoleto(boleto);
		}
		
	}

}
