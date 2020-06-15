import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int reverse=0;
		int digit;
		while(num != 0) {
            digit = num % 10;
            reverse= reverse * 10 + digit;
            num /= 10;
        }
		System.out.println(reverse);

	}

}
