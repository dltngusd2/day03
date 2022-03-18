package day03;

public class Ex02 {
public static void main(String[] args) {
//	사칙연산자
//	+, -, *, /, %
//	/ : 정수 / 정수 = 정수
//		실수 결과를 원한다면 연산값들 중 하나라도 실수값 있어야함
//	%(mod)모드연산자 : 정수 % 정수 -> 나머지 값 
	int num1=10, num2=3;
	System.out.println(num1 / num2);
	System.out.println(num1 / (float)num2);
	System.out.println(num1 % num2);
//a = 10;
//a += 10; -> a = a+10
//a *= 10; -> a = a*10
	int su1=5, su2=5;
	su1+=1; // su1(6) = su1(5) +1
	System.out.println(su1);
	su1-=1; // su1(5) = su1(6) -1
	System.out.println(su1);
	su1*=su2; // su1(25) = su1(5) * su2(5)
	System.out.println(su1);
	su1/=su2; // su1(5) = su1(25) / su2(5)
	System.out.println(su1);
	su1%=su2; // su1(o) = su1(5) % su2(5)
	System.out.println(su1);
	
//	관계연산자
//	<, >, <=, >=, ==
//	-결과적으로 참(true) 또는 거짓(false) 표현
//	- =는 대입 연산자 왼쪽에 있는걸 오른쪽에 대입
//	ex) 10 < 20 => trun, 10 > 20 => false
	
	double do01 = 3.0, do02 = 3.1;
	System.out.println(do01 >= do02);
	System.out.println(do01 <= do02);
	System.out.println(do01 == do02);
	// != 두 값이 같지 않냐
	System.out.println(do01 != do02);
	
//	논리 연산자
//	-참 또는 거짓을 표현
//	-앞에있는 값과 뒤에있는 값을 연산 (값 || 값 => )
//	||(or)[역슬래쉬shift] :  값들 중 하나라도 참이면 결과는 참
//	&&(and) : 하나라도 거짓이면 거짓(false) [모두가 참이면 참]
//	! : 반전. !참 => 거짓으로 변경. !거짓 => 참(true)
	System.out.println(false || false);
	System.out.println(false || true);
	System.out.println(true || false);
	System.out.println(true || true);
	
	System.out.println(false && false);
	System.out.println(false && true);
	System.out.println(true && false);
	System.out.println(true && true);
	
	System.out.println("!true : "+ !true);
	System.out.println("!false : " +!false);
	
	// % : 범위 구할때 쓴다. 또는 짝, 홀, 배수
	su1 = 10;
	// boolean : 참 또는 거짓만 저장 가능하다.
	boolean bool;
	int result = su1 % 2;
	System.out.println();
	// 2로 10을 나눴을때 나머지는 0이다.
	bool = result ==0;
	
	System.out.println("true면 짝수 : "+bool);
	System.out.println("false면 홀수 : "+bool);
	System.out.println(su1%2 == 0);
	System.out.println(su1%2 == 0  && su1 > 5);
	//						짝수냐고 물어보는 식 t면 짝수 f면 홀수
	su1 = 9;
	System.out.println(su1%2 == 0  || su1 > 5);
	
	//증감연산자
	//-자기 자신을 1증가 또는 감소 시킨다.
//	a++, ++a, --a, a--
//	-> a=a+1, a=a-1 <ㅡ위에 식을 해석하자면
	su1 = 10;
	su2 = ++su1; // ++su1 이기때문에 1이 증가한다 su1도 마찬가지로 11이다.
	System.out.println("su1 : "+su1);
	System.out.println("su2 : "+su2);
	
	// ++가 앞에 있냐 뒤에있냐에 따라 다르다 앞쪽에 있다면 다른식보다 자기자신을 먼저 1을올린다
	// ++가 뒤에있다면 다 계산하고 난후 마지막에 자기자신을 1이 증가한다.
	su1 = 10;
	su2 = su1++;
	System.out.println("su1 : "+su1);
	System.out.println("su2 : "+su2);
	// 쉬운방법은 변수 설정전에
	// ++su1 = 10; 이런식으로 설정하고 한다. 위처럼 한다면 코드를 줄일수있다는 장점이있다.
	
	//-------------------------------------------------
	su1 = 9;
	String s = (su1%2 == 0)?"T":"F";
	System.out.println(s);
	
	
	
}
}
