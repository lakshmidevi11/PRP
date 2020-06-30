import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int l=s1.length();
		
		if(l%2==0) {
			int r=l/2;
					System.out.println(s1.substring(0,r));
		}
		else {
			System.out.println("null");
		}

	}

}
