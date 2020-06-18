import java.util.Arrays;
import java.util.Scanner;

public class Question7 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
	int count=0;	
	Arrays.sort(a);
	int b[]=new int[a.length];
	for(int i=0;i<a.length;i++) {
		int cur=a[i];
		if(count>0)
				if(b[count-1]==cur)
					continue;
		b[count]=cur;
		count++;
	}
	int c[]=new int[count];
	
	System.arraycopy(b,0,c,0, count);
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i]+" ");
	}
	
	}	
}

