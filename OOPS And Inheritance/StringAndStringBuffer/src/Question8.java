import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int i=s1.indexOf('*');
		StringBuffer sb=new StringBuffer(s1);
		sb.delete(i-1,i+2);
		System.out.println(sb);

	}

}
