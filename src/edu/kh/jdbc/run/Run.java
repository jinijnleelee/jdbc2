package edu.kh.jdbc.run;

import edu.kh.jdbc.model.service.TestService;
import edu.kh.jdbc.model.vo.TestVO;

public class Run {

	public static void main(String[] args) {
		// 1. creatXML파일 
		// 2. driver.XML만들기
		//3.LoadXML 파일  1 2 를 3이 읽음 
		//4. jdbcTempleat4
		
		//Run/TestService/TestDAO/TestVO
		
		//런에서 서비스 만들고 손코딩 하다가 관련된 메서드 만들고
		//DAO 로 내가 할려고했던 메서드들의 DAO를 만들면 됨. 
		
		
		
		
		
		TestService service = new TestService();
		
		// TB_TEST 테이블에 INSERT 수행
		TestVO  vo1 = new TestVO(1,"제목","내용1");
		
		//TB_TEST 테이블에 insert를 수행하는 서비스 메서드를
		//호출 후 결과 반환 받기
		try {
			
			
			
			int result = service.insert(vo1); //1 / 0
			
			if(result > 0) {
				System.out.println("insert 성공");
			}else {
				System.out.println("insert 실패");
			}
			
			
		}catch(Exception e) {
			System.out.println("SQL 수행중 오류 발생 ");
			e.printStackTrace();
			
			
			
		}
		
	}

}
