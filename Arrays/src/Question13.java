
public class Question13 {

	public static void main(String[] args) {
		int len=args.length;
		
		if(len!=4) {
			System.out.println("Please enter 4 integer numbers");
		}
		else if(len==4) {
			int a[][]=new int[2][2];
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					a[i][j]=Integer.parseInt(args[2*i+j]);
					
				}
			}
			System.out.println("The given array is :");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The reverse of the array is :");
			for(int i=a.length-1;i>=0;i--) {
				for(int j=a.length-1;j>=0;j--) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		

	}

}
