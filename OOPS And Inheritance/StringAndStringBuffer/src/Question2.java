import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String[] a=s1.split(",");
		int i=s1.indexOf(',');
		StringBuffer sb=new StringBuffer(s1.toLowerCase());
		if(s1.charAt(i-1)==s1.charAt(i+1)) {
			sb.delete(i-1,i+1);
			System.out.println(sb);
		}
		else {
			sb.setCharAt(i,' ');
			System.out.println(sb);
			
		}
		
		
	}

}
