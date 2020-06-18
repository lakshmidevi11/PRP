import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of element");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
