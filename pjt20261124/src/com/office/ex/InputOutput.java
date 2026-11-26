package com.office.ex;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		// 1. 데이터 출력 System.out.println();
		// ln = line 
		
		int num = 1000;
		System.out.println(num);
		
		String str = "Hello";
		System.out.println(str);
		
		System.out.println(10 + 20); // 덧셈 연산자
		
		System.out.println("Hello " + 20); // 연결 연산자
		// 문자열과 숫자가 만나면 숫자가 문자열화 됨 Hello 20
		int num1 = 20;
		System.out.println("Hello " + num1);
		
		System.out.print("abc");
		System.out.print(" ");
		System.out.print("def"); // abc def 
		System.out.print("\n"); // 개행의 특수문자
		System.out.print("ghi");
		// 이처럼 ln 은 개행하지만 print 는 개행하지 않고 이어붙임
		
		
		// 특수문자
		// \n : 개행
		// \t : 탭의 기능
		// \' : ' 작은 따옴표 출력
		// \" : " 큰 따옴표 출력
		// \\ : \ 역 슬래시 출력
		
		System.out.println("\n");
		
		System.out.print("이름\t학번\n");
		System.out.print("Mr.H\t2020_000123\n");
		System.out.print("Mr.K\t2020_000124\n");
		
		System.out.print("어머님께서는 \"밥 먹고 설거지 해놔라.\" 라고 하셨습니다. \n");
		System.out.print("그래서 나는 \'네.\' 라고 했습니다. \n");
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("\\\\2026-11-26\\\\");
		
		// 2. 데이터 입력 Scanner
		
		//Scanner 데이터 타입 scanner 변수 
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine();
		
		System.out.println("str1: " + str1);
		
		//nextByte(): 정수(byte) 입력
		//nextInt(): 정수(int) 입력
		//nextLong(): 정수(long) 입력
		//nextFloat(): 실수(float) 입력
		//nextdouble(): 실수(double) 입력
		//nextLine(): 문자열(String) 입력
		//nextBoolean(): 논리(boolean) 입력
		
		byte byteNum = scanner.nextByte();
		System.out.println("byteNum: " + byteNum);
		
		int intNum = scanner.nextInt();
		System.out.println("intNum: " + intNum);
		
		long longNum = scanner.nextLong();
		System.out.println("longNum: " + longNum);
		
		float floatNum = scanner.nextFloat();
		System.out.println("floatNum: " + floatNum);
		
		boolean booleanData = scanner.nextBoolean();
		System.out.println("booleanData: " + booleanData);
		
		scanner.close(); // close 를 하게 되면 해당 스캐너는 다시 사용할 수 없음
	}
	
}
