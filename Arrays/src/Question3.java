import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a= {1,4,34,56,7};
		System.out.println("enter the search element");
		int sr=s.nextInt();
		int flag=0;
		int pos=0;
		for(int i=0;i<a.length;i++) 
			if(a[i]==sr) {
				flag=1;
				pos=i;
				break;
			}
			else {
				flag=0;
			}
		if(flag==1) {
			System.out.println(pos);
		}
		else {
			System.out.println("-1");
		}
		
		
		
	}

}
