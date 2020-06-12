import java.util.*;
public class Question1A {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		if(a>0) {
			System.out.println("The given number is positive");
		}
		else if(a<0) {
			System.out.println("The given number is negative");
		}
		else {
			System.out.println("The given number is zero");
		}
		

	}

}
