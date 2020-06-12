import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two character");
		char a=s.next().charAt(0);
		char b=s.next().charAt(0);
		int value1=(int)a;
		int value2=(int)b;
		
		if(a>b) {
			System.out.println(b+","+a);
		}
		else {
			System.out.println(a+","+b);
		}

	}

}
