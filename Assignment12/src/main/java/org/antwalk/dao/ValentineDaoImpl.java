package org.antwalk.dao;

import java.util.List;

import javax.sql.DataSource;

import org.antwalk.model.Valentine;
import org.springframework.jdbc.core.JdbcTemplate;

public class ValentineDaoImpl implements ValentineDao{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource ds) {
		dataSource=ds;
		jdbcTemplate=new JdbcTemplate(dataSource);
	}
	public void create(String day,String gift,String location) {
		String query="insert into valentine(day,gift,location) values(?,?,?)";
		jdbcTemplate.update(query,day,gift,location);
	}
	public List<Valentine> listValentine(){
		String query="select * from book";
		List<Valentine> books=jdbcTemplate.query(query, new ValentineMapper());
		return books;
	}
}
