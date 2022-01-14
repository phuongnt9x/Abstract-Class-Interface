package arraylist_linkedlist_collection;

public class Product implements Comparable<Product> {
	private String name;
	private int id;
	private float price;
	
	public Product() {
		super();
	}
	public Product(String name, int id, float price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int compareTo(Product p) {
		return this.getName().compareTo(p.getName());

	}

}
