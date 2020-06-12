import java.util.Scanner;

public class Question1B {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two non negative numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int digit1=a%10;
		int digit2=b%10;
		if(digit1==digit2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
