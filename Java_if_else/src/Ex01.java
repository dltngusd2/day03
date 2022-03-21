import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		   /*
		    * if(조건){
		    * 	조건에 만족할 경우 실행되는 문장;
		    * }
		    * else{
		    * 	조건에 만족하지 않을 경우 실행되는 문장;
		    * }
		    
		    */
		   Scanner input = new Scanner(System.in);
		   int num;
		   System.out.println("수 입력");
		   num = input.nextInt();
		   if(num % 3 == 0) {
		      System.out.println("3의 배수");
		   }else {
		      System.out.println("아님");
		   }
		   System.out.println("다음 문장들 실행!!!");
		   /*
		    if(조건식) 종속문장
		    else if(조건식) 종속문장
		    else if(조건식) 종속문장
		    ....
		    else 종속문장
		    
		    */
		   if(num > 100) 
		      System.out.println("100보다크다");
		   else if(num > 50)
		      System.out.println("50보다 크다");
		   else if(num > 30)
		      System.out.println("30보다 크다");
		   else
		      System.out.println("그 외의 값");
		   System.out.println("다음 문장들 실행");
		}
		}


