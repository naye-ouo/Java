package com.office.ex;

public class Example {

	public static void main(String[] args) {
		
		//변수 정의 = 변수 선언 + 변수 초기화
		
		//변수 선언 
		int num1;
		
		//변수 초기화
		num1 = 5;
		
		System.out.println("num1: " + num1); //5
		
		//변수 데이터 수정 가능
		num1 = 50;
		
		System.out.println("num1: " + num1); //50
		
		//정수 : int
		//실수 : float
		//문자 : char
		//문자열 : String
		
		//변수 이름 작명
		
		// 1. 변수명의 시작은 일반적으로 소문자를 사용한다.(소문자와 대문자를 구분함)
		int money = 1000;
		// int Money = 1000; 비추천
		
		// 2. 변수명은 일반적으로 영문자를 사용한다.
		int myMoney = 500;
		// int 나의돈 =  500; 영어 외에는 쓰지마셈

		// 3. 변수명은 데이터의 의미를 쉽게 파악할 수 있도록 작명한다.(*****)
		int score = 100;
		// int s = 100;
		
		// 4. 2개 이상의 단어가 조합된 경우 낙타표기법을 사용한다.(*****) 띄어쓰기를 못하니 가독성을 위해 사용함
		int currentLocation;
		int myCurrentLocation;
		int totalScore;
		int highScore;
		int maxScore;
		String newItem;
		
		// 5. 키워드(==예약어)는 변수명으로 사용할 수 없다.
		// int public = 100; 에러남
		
		// 6. '_' or '$'를 제외한 특수문자 사용 금지
		// int score!; (X) / int score^^; (X) / int score@; (X)
		
		// 7. 변수명에는 공백문자는 사용할 수 없다.
		// int my  score; (X)
		
		// 8. 변수명에 숫자를 사용하는 경우 첫 글자를 제외한 나머지 글자에 사용할 수 있다.
		// ex) int sco7re;(O) / int score7;(O) / int 7score;(X)
		
		/*
		 	- 변수명은 영문으로 하고, 첫 글자는 소문자로 한다.
		 	- 2개 이상의 단어가 조합된 경우 낙타표기법을 따른다.
		 	- 특수문자, 예약어 그리고 공백문자는 사용하지 않는다.
		 	- 숫자를 사용해야하는 경우 중간 또는 뒤에 사용한다.
		 */
		
		// 변수 데이터 변경
		int myNum = 10;
		System.out.println("myNum: " + myNum); //10
		
		myNum = 20; //데이터 타입 명시는 선언 단계에서만 함
		
		int yourNum = myNum; // yourNum = 20 / myNum = 20 ---> 데이터 복사라고 함(copy)
		
		//기초데이터 타입 데이터 자체가 복사, 레퍼런스 타입(참조 타입) 데이터 자체가 복사되는게 아닌 데이터가 담긴 메모리 주소를 복사
		
		System.out.println("myNum: " + myNum); // 20
		System.out.println("yourNum: " + yourNum); //20
		
		yourNum = 200;
		
		System.out.println("yourNum: " + yourNum); //200
		
		// 데이터 스왑(swap)
		int n1 = 10;
		int n2 = 20;
		
		// n1: 20 / n2: 10 으로 스왑할 거임
		
		int temp = n1;
		n1 = n2; //20
		n2 = temp; //10
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
	}
	
}
