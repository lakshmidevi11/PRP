import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=3;
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=s.nextInt();
		}
		int mida=(0+(n-1))/2;
		int midb=(0+(n-1))/2;
		int c[]=new int[2];
		c[0]=a[mida];
		c[1]=b[midb];
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
