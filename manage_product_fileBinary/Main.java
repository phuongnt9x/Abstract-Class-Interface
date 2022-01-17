package manage_product_fileBinary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> Products = new ArrayList<>();
	    Products.add(new Product(1, "My tom", "Hao Hao",6,"My tomm"));
	    Products.add(new Product(2,"My", "Hao 1",(float) 3.0,"My tomm"));
	    Products.add(new Product(3, "My 2", "Hao 2",6,"My an lien"));
	    Products.add(new Product(4, "My 3", "Hao 3",6,"My 213"));
	    Products.add(new Product(5, "My 4", "Hao 4",6,"My sadsd"));
	    writeToFile("Product.txt", Products);
	    List<Product> ProductDataFromFile = readDataFromFile("Product.txt");
	    for (Product Product : ProductDataFromFile){
	        System.out.println(Product);
	    }
	    
	    System.out.println("Searching ...........");
	    List<Product> search=searchProduct(ProductDataFromFile,"My");
	    if(search.isEmpty()) {
	    	System.out.println("KO tim thay");
	    }else {
	    	for(Product s: search) {
	    		System.out.println(s);
	    	}
	    }
	}
	public static void writeToFile(String path, List<Product> Products) {
	    try {
	        FileOutputStream fos = new FileOutputStream(path);
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeObject(Products);
	        oos.close();
	        fos.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public static List<Product> readDataFromFile(String path){
	    List<Product> Products = new ArrayList<>();
	    try{
	        FileInputStream fis = new FileInputStream(path);
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        Products = (List<Product>) ois.readObject();
	        fis.close();
	        ois.close();
	    }catch(Exception ex){
	        ex.printStackTrace();
	    }
	    return Products;
	}
	public static List<Product> searchProduct(List<Product> products,String name) {
		List<Product> ls=new ArrayList<>();
		for(Product product:products) {
			if(product.getName().equals(name)) {
				ls.add(product);				
			}
		}
		return ls;
	}

}
