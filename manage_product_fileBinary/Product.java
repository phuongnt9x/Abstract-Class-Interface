package manage_product_fileBinary;

import java.io.Serializable;

public class Product implements Serializable {
	private int id;
	private String name;
	private String company;
	private float price;
	private String desc;
	public Product() {
		super();
	}
	public Product(int id, String name, String company, float price, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", company=" + company + ", price=" + price + ", desc=" + desc
				+ "]";
	}

}
