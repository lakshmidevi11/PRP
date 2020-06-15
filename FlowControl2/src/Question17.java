
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int temp=num;
		int reverse=0;
		int digit;
		while(num != 0) {
            digit = num % 10;
            reverse= reverse * 10 + digit;
            num /= 10;
        }
		if(temp==reverse) {
			System.out.println(temp+" is a palindrome");
		}
		else {
			System.out.println(temp+" is not a palindrome");
		}

	}

}
