
public class Box {
	private int width;
	private int height;
	private int depth;
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public void volume(Box b) {
		System.out.println("The volume of the box is "+b.width*b.height*b.depth);
		
	}
	public static void main(String[] args) {
		Box b=new Box(4,2,6);
		b.volume(b);

	}

}
