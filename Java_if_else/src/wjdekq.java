import java.util.Scanner;

public class wjdekq {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   int rock, scissors, paper, a, b;
		   System.out.println("\n rock is no.1 \n scisssors is no.2 \n paper is no.3 \n ");
		   System.out.println("a의 선택지를 고르세요 : ");
		   a = sc.nextInt();
		   System.out.println("b의 선택지를 고르세요 : ");
		   b = sc.nextInt();
		   rock=1;
		   scissors=2;
		   paper=3;
		   if((a==1&&b==1)||(a==2&&b==2)||(a==3&&b==3)) {
		   System.out.println("draw");
		   
		   }
		   
		   if((a==1&&b==2)||(a==2&&b==3)||(a==3&&b==1))
		   {System.out.println("winner is a");
		   
		   }
		   if((a==2&&b==1)||(a==3&&b==2)||(a==1&&b==3))
		   {System.out.println("winner is b");
		   
		   }
		   
		}
		}


