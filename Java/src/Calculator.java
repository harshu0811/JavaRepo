import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("=======welcome=======");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number : ");
		int a=sc.nextInt();
		System.out.println("enter the second number : ");
		int b=sc.nextInt();
		System.out.println( "+   -    *    / ");
		System.out.println("enter above symbols ");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case '+':System.out.println(a+b);break;
		case '-':System.out.println(a-b);break;
		case '*':System.out.println(a*b);break;
		case '/':System.out.println(a/b);break;
		default:System.out.println("invalid choice ");
		}
	}
}
