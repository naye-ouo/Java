package com.office.ex;

public class DataType {

	public static void main(String[] args) {
		
		// 데이터 타입(Data type)이란?
		
		// 메모리에 데이터가 저장될 때 데이터에 따라서 할당 받는 메모리 크기가 다르게 되는데요,
		// 예를 들어 정수는 1~8 byte, 실수는 4~8 byte의 크기가 할당 됩니다.
		// 이런 것을 데이터 타입이라고 합니다.
		// 크기가 작은 데이터와 크기가 큰 데이터를 모두 작은 상자에 저장하게 되면 크기가 작은 데이터는 문제 없겠지만,
		// 큰 데이터는 상자의 크기가 작아서 흘러넘치게 된다. --> 이것을 오버플로우라고 하며 데이터 손실을 방지하기 위해서 크기를 할당해준다.
		// 데이터가 필요이상으로 공간을 많이 써서 메모리가 낭비됨 --> 언더플로우 
		
		// 메모리 단위
		// 1bit -> 메모리 최소 단위
		// 8bit -> 1byte(바이트)
		// 1024byte -> 1KB(키로 바이트)
		// 1024KB -> 1MB(메가 바이트)
		// 1024MB -> 1GB(기가 바이트)
		// 1024GB -> 1TB(테라 바이트)
		
		// 1. 정수 데이터 타입
		// 1-1. byte 1byte 사용   쓸 수 있는 수: -128 ~ 127
		byte byteVar = 127;
		System.out.println("byteVar : " + byteVar); //127
		
		// byteVar = 128; 에러남
		
		// 1-2. short  2byte 사용    쓸 수 있는 수: -32,768 ~ 32,767
		short shortVar = 32767;
		System.out.println("shortVar: " + shortVar);
		
		//shortVar = 32768; 에러남
		
		// 1-3. int 4byte 사용       쓸 수 있는 수: -2,147,483,648 ~ 2,147,483,647
		int intVar = 2147483647;
		System.out.println("intVar: " + intVar);
		//intVar = 2147483648; 에러남
		
		// 1-4. long 8byte 사용      쓸 수 있는 수: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		// 뒤에 반드시 L 을 붙여야함
		long longVar = 9223372036854775807L;
		System.out.println("longVar: " + longVar);
		//longVar = 9223372036854775808L; 에러남
		
		// 2. 실수형 데이터 타입
		// 2-1. float  4byte 사용
		float floatVar = 3.14f;
		System.out.println("floatVar: " + floatVar);
		
		// 2-2. double 8byte 사용
		double doubleVar = 3.141592; // 뒤에 d를 붙여도 되지만 안 붙이는게 일반적인 관례
		System.out.println("doubleVar: " + doubleVar);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		// float 에 비해 double 가 좀 더 정밀한 숫자를 저장할 수 있음 그래서 '정밀한 수치가 요구'되는 프로그램에서는 double 의 사용을 권장함
		
		floatVar = 3.12345678901234567890f;
		System.out.println("floatVar: " + floatVar);
		
		doubleVar = 3.12345678901234567890;
		System.out.println("doubleVar: " + doubleVar);
		//둘 다 데이터가 유실되긴함 (물리적 한계) 따라서 실수는 데이터를 정확하게 표현할 수 있는 방법이 없음
		
		System.out.println(0.1 + 0.2); //인간: 0.3 / 컴퓨터: 0.30000000000000004 <- 쓰레기 데이터 발생
		//정수로 바꾼 다음에 연산해서 실수로 바꿔서 표현함 / 파이썬은 정수의 한계돌파
		
		// 3. 논리형(boolean)    1byte   참(ture) or 거짓(false)
		boolean booleanVar = true;
		System.out.println("booleanVar: " + booleanVar); //true
		
		booleanVar = false;
		System.out.println("booleanVar: " + booleanVar); //false
		
		boolean isMember = true;
		isMember = false;
		
		// 4. 문자 데이터 타입
		// char   2byte
		char charVar = 'A';
		System.out.println("charVar: " + charVar); //A
		
		// charVar = 'AA'; 에러남
		
		// 참고 
		// 빈(empty) 문자, 공백(space) 문자
		// '' --> 빈(empty) 문자
		// ' ' --> 공백(space) 문자
		
		// char ch1 = ''; 빈 문자이기 때문에 에러
		char ch2 = ' '; // 공백 문자이기 때문에 가능
		// char ch3 = '  '; 공백 문자가 2개 이기 때문에 문자열로 판정되어 에러남
		
		// 유니코드 : 문자가 메모리에 저장될 때 문자 자체로 저장되는 것이 아니고 유니코드로 저장됨.
		// 유니코드란, 영어, 한글, 중국어 등의 전 세계 모든 문자를 정수로 나타낸 코드로 컴퓨터는 문자를 다룰 수 없기 때문에
		// 문자를 정수로 변환해서 사용한다.
		
		char char1 = 'A'; //65
		System.out.println("char1: " + char1); //A
		
		int unicode1 = 65;
		System.out.println("unicode1: " + unicode1); //65
		
		char char2 = 65;
		System.out.println("char2: " + char2); //A
		
		char char3 = 12593; // ㄱ
		System.out.println("char3: " + char3); // ㄱ
		
		
		// char char1 = 'A';  -> 65 -> 0100 0001 -> 실행
		// char char2 = 65; -> 0100 0001 -> 실행
		
		// 5. 문자열 String
		// 원래 문자열이라는 데이터 타입은 없었음 그래서 문자를 쭈욱 배열로 나열해서 만들었음
		// 그때 그때 동적으로 만들어지기 때문에 정해진 메모리 공간이 없음
		// 엄밀히 말하면 기초데이터 타입이 아님 많이 쓰니까 기초데이터 타입처럼 쓰셈 이라고 하는 거임
		
		String str1 = "Hello";
		System.out.println("str1: " + str1);
		
		str1 = ""; //빈 문자여도 됌
		str1 = " "; // 공백 문자도 가능
		str1 = "A"; // 문자도 담을 수 있음
		// str1 = 'A'; 작은 따옴표라서 에러남
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
