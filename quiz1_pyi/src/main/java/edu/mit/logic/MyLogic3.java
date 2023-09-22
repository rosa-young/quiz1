package edu.mit.logic;

import org.springframework.stereotype.Component;

@Component //스프링에서 관리하는 객체라고 인식시키기
public class MyLogic3 {
	
	public int addUp(int num1, int num2) {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			sum +=i;
		}
		return sum;		
	}
	
	public int evenAddUp(int num1, int num2) {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			if(i%2 == 0)
				sum +=i;
		}
		return sum;		
	}	

}
