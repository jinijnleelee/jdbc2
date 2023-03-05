package edu.kh.jdbc.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class CreateXMLFile {
	public static void main(String[] args) {
		
		// XML (eXtensible Markup Language) 단순화된 데이터 기술 형식 
		// XML 저장되는 데이터 형식은 MAP(K  : V)  형식이다 
		//MAP (String : String )
		// key , Value 모두 String (문자열) 형식이다
		
		//Properties 컬렉션 객체 *
		//MAp의 후손 클래
		// key , Value 모두 String (문자열) 형식이다
		//XML 파일을 읽고 쓰는데 특화된 메서드를 제공 
		
		
		
		try {
			

			Scanner sc = new Scanner(System.in);
			
			//Properties 객체 생성
			Properties prop = new Properties();
			
			System.out.println("생성할 파일 이름 : ");
			String fileName = sc.nextLine();
			
			//File OutPutStream  생성//
			//파일명.XMl
			
			FileOutputStream fos = new FileOutputStream(fileName + ".xml");
			
			
			//Properties 객체를 이용해서 XML 파일 생성
			prop.storeToXML(fos, fileName + ".xml file");
			System.out.println(fileName + ".xml 파일생성완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	
	
	}
}
