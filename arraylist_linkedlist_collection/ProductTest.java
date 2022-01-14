package arraylist_linkedlist_collection;

public class ProductTest {

	public static void main(String[] args) {
		ProductManager list=new ProductManager();
		Product p1=new Product("CBC",1,6);
		Product p2=new Product("AB1",2,7);
		Product p3=new Product("AB2",3,7);
		list.addProduct(p1);
		list.addProduct(p2);
		list.addProduct(p3);
		list.showListProduct();
		System.out.println("After soft");
		list.sortProductByName();
		list.showListProduct();

	}

}
