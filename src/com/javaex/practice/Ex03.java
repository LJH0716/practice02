package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");
		}
		else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");
		sc.close();
		
		//15세 ->2번, 19세->2번, 20세->2번, 21세->1번,100세->1번 그룹
		

	}

}
