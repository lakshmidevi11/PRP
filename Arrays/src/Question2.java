import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a= {5,10,15,20,25,30};
		int max=0;
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("The maximum element of the array is "+max);
		System.out.println("The minimum element  of the array is "+min);


	}

}
