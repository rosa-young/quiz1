package edu.mit.persistence;

import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {
	
	@Test
	public void testConnection() {		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://@127.0.0.1:3306/mit", "aaa", "1234");
			log.info("접속성공");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			log.info("접속실패");
		}
	}
	
	@Test
	public void aaa() {
		log.info("잘나옴!!");
	}

}
