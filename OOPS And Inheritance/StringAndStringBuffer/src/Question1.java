import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2="";
		int l=s1.length();
		for(int i=l-1;i>=0;i--) {
			s2=s2+s1.charAt(i);	
		}
		
		if(s1.equals(s2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
