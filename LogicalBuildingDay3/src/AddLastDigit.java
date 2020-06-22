import java.util.Scanner;

public class AddLastDigit {
	static int addLastDigit(int input1,int input2) {
		int a=Math.abs(input1%10);
		int b=Math.abs(input2%10);
		return a+b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int num1=s.nextInt();
		int digit=addLastDigit(num,num1);
		System.out.println(digit);
	}

}
