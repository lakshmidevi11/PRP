import java.util.Scanner;

public class LastDigit {
	static int lastDigit(int num) {
		return num%10;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("The last digit of the number "+num+" is "+Math.abs(lastDigit(num)));		

	}
}
