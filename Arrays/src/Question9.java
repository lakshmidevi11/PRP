import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of element");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==10) {
				a[i]=0;
			}
			
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]!=0)
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<n;i++) {
			if(a[i]==0)
			System.out.print(a[i]+" ");
		}
		
		

	}

}
