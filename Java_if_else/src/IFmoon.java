import java.util.Scanner;

public class IFmoon {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	/*
	    * if(조건){
	    * 	조건에 만족할 경우 실행되는 문장;
	    * }
	    * else{
	    * 	조건에 만족하지 않을 경우 실행되는 문장;
	    * }
	   */
	System.out.println("수 입력 : ");
	int a = input.nextInt();
	if(a<5) 
		System.out.println("입력한 수는 5보다 작다");
	
	else 
		System.out.println("입력한 수는 5보다 작지 않다");
	
		// {} 여러 문장이있을경우 중괄호를 치지만 하나만 있을경우 없어도 실행된다.
		
		
		
		
}
}
