
class Book extends Author {
	private String name;
	private double price;
	private int qty;
	public Book(String name, String email, char gender, String name2, double price, int qty) {
		super(name, email, gender);
		this.name = name2;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", qty=" + qty + ", " + super.toString() + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	
	

}
