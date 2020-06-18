
public class Question6 {

	public static void main(String[] args) {
		int[] a= {67,98,75,112,120};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		System.out.print("Ascending Order:");
        for (int i = 0; i <a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int temp1=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
				}
			}
		}
		System.out.print("Decending Order:");
        for (int i = 0; i <a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }

	}

}
