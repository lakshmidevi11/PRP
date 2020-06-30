import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int l=s1.length();
		if(s1.length()==s2.length()) {
			for(int i=0;i<l;i++) {
				System.out.print(s1.charAt(i));
				System.out.print(s2.charAt(i));
			}	
		}
		else {
			if(s1.length()>s2.length()) {
				int r=s1.length()-s2.length();
				System.out.println(r);
				String s3=s1.substring(0,s1.length()-r);
				for(int i=0;i<s2.length();i++) {
					System.out.print(s3.charAt(i));
					System.out.print(s2.charAt(i));
				}	
				System.out.print(s1.substring(s1.length()-r));
				
			}
			else if(s2.length()>s1.length()) {
				int r=s2.length()-s1.length();
				System.out.println(r);
				String s3=s2.substring(0,s2.length()-r);
				for(int i=0;i<s1.length();i++) {
					System.out.print(s3.charAt(i));
					System.out.print(s1.charAt(i));
				}	
				System.out.print(s2.substring(s2.length()-r));
				
			}
		}
		

	}

}
