package day03;

import java.util.Scanner;

public class pratice {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int money = 30000;
	int time;
	System.out.println("비행기 탄 시간(분):");
	time=input.nextInt();
	time-=30;
	if(time>0) {
		//money + (500+((time-1)/10*500);
		if(time%10==0)
			money=money+time/10*5000;
		else
			money=money+time/10*5000+5000;
	}
System.out.println(time+"분 비행기 요금 : "+money+"원 입니다.");	
	
	
	}
	
	
	
	
}

