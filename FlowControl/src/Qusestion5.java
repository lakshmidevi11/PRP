import java.util.Scanner;

public class Qusestion5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the charcter");
		char c=s.next().charAt(0);
		if((c>=65&&c<=90)||(c>=97&&c<=122)) {
			System.out.println("Alphabhet");
		}
		else if(c>=48&&c<=57) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}

	}

}
