import java.util.Scanner;

public class If_quiz {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
//	1문제
	int su;
	System.out.print("수 입력 : ");
	su = input.nextInt();
	if(su%3 == 0)
		System.out.println(su+"3의 배수입니다");
	
// 2번문제
	int a, b;
	System.out.println("a 입력 : ");
	a=input.nextInt();
	System.out.println("b 입력 : ");
	b=input.nextInt();
	if(a>b) {
		System.out.println("a가 더 크다");
	}
	if(a<b) {
		System.out.println("b가 더 크다.");
	}
// 3번문제
	int q, w, e;
	System.out.println("q입력:");
	q=input.nextInt();
	System.out.println("w입력:");
	w=input.nextInt();
	System.out.println("e입력:");
	e=input.nextInt();
	if(q>w && q>e) {
		System.out.println("q가 가장크다.");
	}
	if(w>q && w>e) {
		System.out.println("w가 가장크다.");
	}
	if(e>q && e>w) {
		System.out.println("e가 가장크다.");
	}
		
//3번 문제
		int num1, num2;
		System.out.println("num1 입력 : ");
		num1=input.nextInt();
		System.out.println("num2 입력 : ");
		num2=input.nextInt();
		if(num1>num2) {
			System.out.println();
		}
	

}
			}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			