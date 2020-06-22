import java.util.Scanner;

public class SecondLastDigit {
	static int secondLastDigit(int num) {
		return (num%100)/10;	
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("The second last digit of a number "+num+" is "+Math.abs(secondLastDigit(num)));
	}
	

}
