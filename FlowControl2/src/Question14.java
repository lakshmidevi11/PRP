import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		int rem;
		while(num>0) {
			rem =num% 10;
			sum =sum+ rem;
			num= num/ 10;
		}
		System.out.println(sum);

	}

}
