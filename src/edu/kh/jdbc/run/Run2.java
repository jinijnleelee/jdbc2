package edu.kh.jdbc.run;

import edu.kh.jdbc.model.service.TestService;
import edu.kh.jdbc.model.vo.TestVO;

public class Run2 {

	public static void main(String[] args) {
		TestService service = new TestService();

		TestVO vo1 = new TestVO(70, "제목70", "내용 70 입니다 ");
		TestVO vo2 = new TestVO(80, "제목80", "내용 80 입니다 ");
		TestVO vo3 = new TestVO(90, "제목90", "내용 90 입니다 ");
	
		
			try {
				int result = service.insert(vo1,vo2,vo3);
				
				if(result > 0 ) {
					System.out.println("성공 ");
				}else {
					System.out.println("실패  ");
				}
				
		}catch(Exception e) {
			System.out.println("SQL 수행중 오류 발생 ");
			e.printStackTrace();
		}
	
	}


}
