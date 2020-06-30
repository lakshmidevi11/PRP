import java.util.Scanner;

public class Calculator {
	static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
	}
	static  double powerIDouble(double num1,double num2) {
		return Math.pow(num1, num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		System.out.println("Enter the power");
		int b=s.nextInt();
		System.out.println("Enter the number");
		double a1=s.nextDouble();
		System.out.println("Enter the power");
		double b1=s.nextDouble();
		
		System.out.println("The power value is "+c.powerInt(a,b));
		System.out.println("The power value is "+c.powerIDouble(a1,b1));

	}

}
