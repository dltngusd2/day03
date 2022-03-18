package day03;

import java.util.Scanner;

public class ITbank {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num1, num2, num3;
	int temp;

	System.out.print("첫번째 수를 입력 : ");
	num1 = input.nextInt();

	System.out.print("두번째 수를 입력 : ");
	num2 = input.nextInt();

	System.out.print("세번째 수를 입력 : ");
	num3 = input.nextInt();

	if (num1 > num2) {
	temp = num1;
	num1 = num2;
	num2 = temp;
	}
	if (num1 > num3) {
	temp = num1;
	num1 = num3;
	num3 = temp;
	}
	if (num2 > num3) {
	temp = num2;
	num2 = num3;
	num3 = temp;
	}
	System.out.println("정렬 : " + num1 + "," + num2 + "," + num3);

	input.close();

	
	
	
	
	
	
	
	
}
}
