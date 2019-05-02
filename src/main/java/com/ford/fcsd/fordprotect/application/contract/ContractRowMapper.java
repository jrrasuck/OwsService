package com.ford.fcsd.fordprotect.application.contract;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ContractRowMapper implements RowMapper<Contract> {

	@Override
	public Contract mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contract contract = new Contract();
		contract.setId(rs.getInt("id"));
		return contract;
	}

}
