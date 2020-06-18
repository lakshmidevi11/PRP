import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a= {5,10,15,20,25,30};
		int sum=0;
		double avg=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("The sum of the array is "+sum);
		System.out.println("The average of the array is "+avg);

	}

}
