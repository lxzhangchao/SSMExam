package com.hand.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.hand.model.User;
import com.hand.service.UserService;

@Repository
public class UserServiceImpl implements UserService {

	@Autowired
	private DataSource dataSource;
	//private JdbcTemplate jdbcTemplateObject; 
	private JdbcTemplate jdbcTemplate;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public User  getUser(String userName,int passWord) {
		String sql="select * from customer where first_name=? and customer_id=?";		
		final User user = new User();
		List u = jdbcTemplate.queryForList(sql,userName,passWord);
		jdbcTemplate.query(sql,new Object[]{userName,passWord},new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException {
				user.setUserName(rs.getString("userName"));
				user.setPassWord(rs.getInt("passWord"));
			}
		});
		if(u.size()==0){
			return null;
		}
		return user;
	}
}
