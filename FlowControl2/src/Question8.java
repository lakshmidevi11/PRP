import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the color code ");
		char ch=s.next().charAt(0);
		char c=Character.toUpperCase(ch);
		switch(c) {
		case 'R':
			System.out.println("R->Red");
			break;
		case 'B':
			System.out.println("B->Blue");
			break;
		case 'G':
			System.out.println(" G->Green");
			break;
		case 'O':
			System.out.println("O->Orange");
			break;
		case 'Y':
			System.out.println("Y->Yellow");
			break;
		case 'W':
			System.out.println(" W->White");
			break;
		default:
			System.out.println("Invalid Code");
			break;
		
		}

	}

}
