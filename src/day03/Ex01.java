package day03;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String str;
	System.out.println("값 입력 : ");
	str = input.next();
//	공백 (띄어쓰기)은 엔터로 인식해 하나밖에 인식 하지 못한다.
//	next 뒤에 Line ㅡ> 공백도 인식한다
	System.out.println(str);
	
	System.out.println("2값 입력 : ");
	input.nextLine();
	str = input.nextLine();
	System.out.println("출력 결과 : "+str);
	System.out.println("다음 문장들 실행!!!");
	
	
	
	
	
}
}
