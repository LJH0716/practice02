package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		double result ;
		
		if(num <= 0) {
			result = (double)(num*num*num) - (9*num) + 2;
		}
		
		else {
			result = (7*num) + 2;
		}
		
		System.out.println("계산 결과는 " + result + " 입니다.");
		
		
		sc.close();
		
		
		
		
		
	}

}
