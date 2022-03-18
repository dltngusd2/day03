package day03;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("수 입력 : ");
	input.next();
	int sh1 = 10;
	int result = sh1%2;
	boolean boll;
	boll = result == 0;
	System.out.println("10 = 짝수 : "+boll);
	System.out.println("10 = 3의 배수가 아니다 : "+boll);
	System.out.println("두 수 입력 : ");
	input.next();
	int num1 = 10, num2 = 20;
	System.out.println("num1 : " +num1 +",num2 : " +num2);
	System.out.println("num2가 num1보다 크다");
	System.out.println(num2>num1);
	
}
}
