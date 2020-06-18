import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int maxOne=0;
		int maxTwo=0;
		for(int i=0;i<a.length;i++) {
			if(maxOne<a[i]) {
				maxTwo=maxOne;
				maxOne=a[i];
			}
			else if(maxTwo<a[i]){
				maxTwo=a[i];			
			}
		}
		int minOne=a[0];
		int minTwo=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<minOne) {
				minOne=a[i];
				
			}
			
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<minTwo&&minTwo>maxOne) {
				minTwo=a[i];
			}
			
		}
		System.out.println("First Max Number: "+maxOne);
		System.out.println("Second Max Number: "+maxTwo);
		System.out.println("First Min Number: "+minOne);
		System.out.println("Second Min Number: "+minTwo);
		
	}

}
