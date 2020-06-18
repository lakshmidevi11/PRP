import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if((a[i]==1)||(a[i]==4)) {
				count++;
			}
		}
		if(count==n) {
			System.out.println("True");
		}
		else if(count!=n) {
			System.out.println("False");
		}
	}

}
