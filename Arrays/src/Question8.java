import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int index2=0;
		int index1=0;
		for(int i=0;i<n;i++) {
			if(a[i]==6) {
				index1=i;
			}
			else if(a[i]==7) {
				index2=i;
			}			
		}
		int sum=0;
		int sum1=0;
		int Sum=0;
		if((index1!=0&&index2!=0)&&(index1<index2)) {
			for(int i=0;i<a.length;i++) {
				if(i<index1) {
					sum=sum+a[i];
				}
			}
			for(int i=0;i<a.length;i++) {
				if(i>index2) {
					sum1=sum1+a[i];
				}
			}
			
			System.out.println(sum+sum1);		
		}
		
		else {
			
			for(int i=0;i<a.length;i++) {
				Sum=Sum+a[i];
			}
			System.out.println(Sum);
		}
		
		
	}

}
