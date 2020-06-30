import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int len1=s1.length();
		int len2=s2.length();
		if(len1<len2) {
			System.out.println(s1+s2+s1);
		}
		else {
			System.out.println(s2+s1+s2);
		}

	}

}
