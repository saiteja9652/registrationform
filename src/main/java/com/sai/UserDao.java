package com.sai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	public void saveUser(User user)
	{	Connection connection = DatabaseUtils.createConnection();	
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into janu values(?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getQualifications());
			preparedStatement.setString(4, user.getGender());
			preparedStatement.setString(5, user.getTechnologies());
			preparedStatement.setString(6, user.getType());
			preparedStatement.setString(7, user.getAddress());
			preparedStatement.setString(8, user.getComments());
			preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{	e.printStackTrace();
		}
	}
	
	public boolean checkuser(String username,String password)
	{	Connection connection = DatabaseUtils.createConnection();	
boolean status=false;
	try {
		PreparedStatement preparedStatement = connection.prepareStatement("select * from janu where username=? and password=?");
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
	ResultSet resultSet=preparedStatement.executeQuery();
	  if(resultSet.next())
	  {
		  status=true;
	  }
	}
	  
	
	catch(SQLException e){
		e.printStackTrace();
	}
	return status;	
	}
	
	
	public User searchuser(String username)
	{	Connection connection = DatabaseUtils.createConnection();	
		User user=null;
	try {
	PreparedStatement preparedStatement=connection.prepareStatement("select * from janu where username=?");
	preparedStatement.setString(1, username);
	ResultSet resultSet=preparedStatement.executeQuery();
	resultSet.next();
	
	user=new User();
	user.setUsername(resultSet.getString(1));
	user.setPassword(resultSet.getString(2));
	user.setQualifications(resultSet.getString(3));
	user.setGender(resultSet.getString(4));
	user.setTechnologies(resultSet.getString(5));
	user.setType(resultSet.getString(6));
	user.setAddress(resultSet.getString(7));
	user.setComments(resultSet.getString(8));

	
	
	}
	catch(SQLException e){
		e.printStackTrace();
	}
	return user;
	
	}
	
}
	
	








