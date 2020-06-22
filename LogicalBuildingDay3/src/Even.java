import java.util.*;
public class Even {
	static int isEven(int num) {
		if(num%2==0) {
			return 2;
		}		
		else {
			return 1;		
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(isEven(num));

	}

}
