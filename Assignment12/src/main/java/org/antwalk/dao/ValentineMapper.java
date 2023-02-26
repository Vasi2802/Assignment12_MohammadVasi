package org.antwalk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.antwalk.model.Valentine;
import org.springframework.jdbc.core.RowMapper;


public class ValentineMapper implements RowMapper<Valentine>{
	public Valentine mapRow(ResultSet rs,int rowNum) throws SQLException{
		Valentine valentine = new Valentine();
		valentine.setId(rs.getInt("id"));
		valentine.setDay(rs.getString("day"));
		valentine.setGift(rs.getString("gift"));
		valentine.setLocation(rs.getString("location"));
		return valentine;
	}
}
