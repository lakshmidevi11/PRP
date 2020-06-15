import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		int n=s.nextInt();
	    for(int i=2;i<=n;i++)
	    {
	        if(n%i==0)
	        {
	            count++;
	        }
	    }
	    if(count==1)
	    {
	        System.out.println(n+" is a prime number");
	    }
	    else{
	    	System.out.println(n+" is not a prime number");
	    }

	}

}
