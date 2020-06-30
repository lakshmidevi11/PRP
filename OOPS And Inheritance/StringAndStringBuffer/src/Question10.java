import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int n=s.nextInt();
		String s2=s1.substring(n-1,s1.length());
		for(int i=0;i<n;i++) {
			System.out.print(s2);
		}

	}

}
