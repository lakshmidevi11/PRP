import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		char c=s.next().charAt(0);
		if(c>=97&&c<=122) {
			System.out.println(c+"->"+Character.toUpperCase(c));
		}
		else if(c>=65&&c<=90) {
			System.out.println(c+"->"+Character.toLowerCase(c));
			
		}
	}

}
