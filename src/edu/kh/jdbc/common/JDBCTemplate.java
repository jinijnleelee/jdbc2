package edu.kh.jdbc.common;

import java.sql.Statement;
import java.util.Properties;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTemplate {
	//미리 짜놓은것. 계속 반복적으로 쓰는것들을 여기에 써놓는것. 
	
	
	private static Connection conn = null;
	public static Connection getConnection() {
		
		try {
			
			if(conn ==null || conn.isClosed()) {
				Properties prop = new Properties();
				
				prop.loadFromXML(new FileInputStream("driver.xml"));
				
				
				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");
				
				Class.forName(driver);
				
				conn = DriverManager.getConnection(url,user,password);
				
				conn.setAutoCommit(false);
			
			
			
			}
			
		}catch(Exception e){
			System.out.println("Connection 생성 중 예외 발생 ");
			e.printStackTrace();
		}
		return conn;
	}
	
	
	
	
	
	public static void close(
			Connection conn) {
		try {
			if(conn != null && !conn.isClosed())conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public static void close(Statement stmt) {
		
		try {
			if(stmt != null && stmt.isClosed()) stmt.close(); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public static void close(ResultSet rs) {
		try {
			if(rs != null && rs.isClosed()) rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
	
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed())conn.commit();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	public static void rollback(Connection conn) {
		
		try {
			if(conn != null && conn.isClosed()) conn.rollback();
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
		
	}
	
	
	
	
	
	
	
	
	


