package com.office.ex;

public class MainClass {
	
	// 프로그램의 시작
	public static void main(String[] args) {
		
		System.out.println("Hello java~");
		
		/*
		 class란,
		 
		 클래스는 프로그램을 구성하는 단위이다.
		 그리고 자바 프로그램에서는 반드시 하나 이상 있어야 한다. 
		 */
		
		/*
		 클래스 기본 형식
		 public class 클래스이름 {
		 	
		 }
		 */
		
		/*
		 키워드란,
		 특정한 목적으로 정의된 예약어를 말한다.
		 그래서 우리 개발자는 함부로 사용할 수 없다. 
		 */
		
		/*
		 클래스 이름 작명 규칙
		 1. 클래스 이름은 영문 대문자로 시작한다.
		     ex) Hello(o) / H2llo(o) / Hello2(o)
		         2Hello(X)
		 2. 특수문자 사용 금지. 단, $, _ 는 사용가능(하지만 비추천)
		    ex) _Hello(o) / H_ello(o) / Hello_(o)
		    	$Hello(o) / H$ello(o) / Hello$(o)
		    	@Hello(X) / ^^Hello(X)
		    	
		 3. 클래스 이름은 클래스의 기능을 알 수 있도록 작명한다.
		    계산기(Calculator), 예약(Reservation), 결제(Payment)
		    파일업로드(FileUpload)
		 */
		
		/*
		 ; 이란,
		 종결자라고 한다.
		 ex) 안녕하세요. ==> 프로그램 구문의 끝을 나타낼 때 ;으로 구문의 끝을 나타낸다.
		 */
		
		System.out.println("Hello 자바!"); //에러가 떴을 땐 왼쪽 x를 보고 해결하자.
		
		/* 
		   주석
		   // : 한줄 주석
		   /* : 여러줄 주석
		   Ctrl + / : 주석 단축키 
		   
		 */
	}

}
