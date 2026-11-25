package com.office.ex;

public class Variable {

	public static void main(String[] args) {
		
		// 변수
		int mynum = 1;   // 변수 정의
		int mynum2 = 2;
		float mynum3 = 3.14f;
		
		System.out.println(mynum + mynum2); // 3
		
		/*
		 변수란, 메모리의 특정 공간을 뜻한다.
		 변수명이란, 메모리 주소 대신 인간이 붙인 이름이다.
		 
		 변수 정의 문법 
		 데이터타입 변수명 = 데이터; 
		 
		 변수 정의 = 변수 선언 + 변수 초기화
		 변수 선언 : int mynum
		 변수 초기화 : mynum = 1
		 = : 할당 연산자 (오른쪽의 데이터를 왼쪽의 변수에 할당해준다.)
		 
		 */
		
		// 변수 선언
		int num1;
		
		// 변수 초기화
		num1 = 10;
		
		// 데이터 타입
		// 정수 : int
		// 실수(소수) : float 숫자 뒤에 f 붙여야함
		// 문자 : char
		// 문자열 : String
		
		int score = 100;
		
		float pi = 3.14f;
		
		char a = 'a';
		
		String str = "abcdefg";
		
		// 내 이름(김나예)
		String myName = "김나예";
		
		// 1학기 수학 점수(85)
		int myScore = 85;
		
		// 나의 키 (1.88)
		float myHeight = 1.88f;
		
		// 내가 제일 좋아하는 알파벳(P)
		char myFaverityAlphabet = 'P';
		
	}
	
}
