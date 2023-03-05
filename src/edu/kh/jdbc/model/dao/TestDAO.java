package edu.kh.jdbc.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.*;
import edu.kh.jdbc.model.dao.TestDAO;
import java.beans.PropertyChangeListenerProxy;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import edu.kh.jdbc.model.vo.TestVO;

public class TestDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	
	public TestDAO() {
		

		try {
			prop = new Properties();
			prop.loadFromXML(new FileInputStream("test-query.xml"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	};
	
	
	
	
	
	
	public int insert(Connection conn, TestVO vo1) throws SQLException{
		
		
		
		int result = 0;
		
		
		try {
			String sql = prop.getProperty("insert");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, vo1.getTestNo());
			pstmt.setString(2, vo1.getTestTitle());
			pstmt.setString(3, vo1.getTestContent());
			
			result = pstmt.executeUpdate();

		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	 
	
	

}
