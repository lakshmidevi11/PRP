import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		if(a%2==0) {
			System.out.println("The given number is even");
		}
		else {
			System.out.println("The given number is odd");
		}

	}

}
