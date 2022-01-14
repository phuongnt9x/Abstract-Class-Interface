package arraylist_linkedlist_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
	List<Product> products= new ArrayList<Product>();
	public void addProduct(Product prod) {
		this.products.add(prod);
		System.out.println("Add Product successful!");
	}
	public Product searchById(int id) {
		for(Product product:products) {
			if(product.getId()==id) {
				return product;
			}
		}
		return null;
		
	}
	public boolean deleteProduct(Product prod) {
		return products.remove(prod);
	}
	public void showListProduct() {
		int i=1;
		for(Product product:products) {
			System.out.println("Product "+i);
			System.out.println("Name: " +product.getName());
			System.out.println("Price: " +product.getPrice());
			i++;
		}
	}
	public void sortProductByName() {
		Collections.sort(this.products);
	}


}
