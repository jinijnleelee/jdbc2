package edu.kh.jdbc.run;

import java.sql.SQLException;

import edu.kh.jdbc.model.dao.TestDAO;
import edu.kh.jdbc.model.service.TestService;
import edu.kh.jdbc.model.vo.TestVO;

public class Run {

	public static void main(String[] args) {
	
	
	
	TestService service = new TestService();
	TestVO vo1= new TestVO(1,"볶음1,","제목1");
	
	
	try {
		int result = service.insert(vo1);
		

		if(result > 0) {
			System.out.println("insert 성공 ");
			
		}else {
		System.out.println("insert 실패 ");
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("SQL 슈행중 오류 발생 ");
	}
	
	
	
	}

}
