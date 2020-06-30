import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int l=s1.length();
		if(s1.charAt(0)=='x'&&s1.charAt(l-1)=='x') {
			System.out.println(s1.substring(1, l-1));		
		}
		else {
			System.out.println(s1);
		}

	}

}
