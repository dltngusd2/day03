package day03;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	/*제어문
	 	- 프로그램의 흐름을 변경할 수 있다.
	 	- if, switch, for, while, do while, break, continue
	 if 형식
	 	- if(조건식){
	 	(종속문장)
	 	해당 조건이 참이면 중괄호 내용이 실행	ㅡ	거짓이면 실행 XX 바로 다음문장으로 넘어감
	 	}
	 	if문 종료후 다음 문장들 실행
	 */
//	int num;
//	System.out.println("1. 쉬운게임");
//	System.out.println("2. 어려운게임");
//	System.out.println("3. 종료");
//	System.out.println("<<< : ");
//	num = input.nextInt();
//	if(num == 1) {
//		System.out.println("쉬운게임 시작");
//	}
//	if(num == 2) {
//		System.out.println("어려운게임 시작");
//	}
//	if(num == 3) {
//	
//		System.out.println("게임 종료");
//}
//	System.out.println("다음 문장들 실행!!!");
		
	
	int num1;
	System.out.println("수 입력");
	num1 = input.nextInt();
	if(num1 > 10) {
		System.out.println("num1 10보다 크다");
	
System.out.println("다음문장실행!!");	
	} // if문을 중괄호 안에 있는것은 다 실행 안된다.
	
	
	
	System.out.println("수 입력 : ");
	num1 = input.nextInt();
	if(num1 % 2 ==0) {
		System.out.println("입력 값 짝수 : " +num1);
	}
	if(num1 % 2 !=0) {
		System.out.println("입력 값 홀수 : " +num1);
	}
}
}
// 주말에 문제 하나씩 내고 한사람당 한문제씩 내서 다 풀어본다