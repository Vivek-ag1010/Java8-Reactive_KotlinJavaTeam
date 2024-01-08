package javaFunctional;
import java.util.*;
/*Suppose you have a list of Product objects with properties like name, price, and category. 
 * Implement a Java program that filters the products based on the following conditions:
The price is greater than 100.
The category is "Electronics."*/

class Product 
{
	private String name;
	private int price;
	private String category;
	
	public Product(String name, int price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
public class CombinedPracticeEx1 {

	public static void main(String[] args) {
		List<Product> list=List.of(
				new Product("Geyser",2000,"Electricals"),
				new Product("Charger", 200, "Electronics"),
				new Product("Mouse", 450, "Electronics"),
				new Product("USB", 75, "Electrnoics"),
				new Product("Bootle", 60, "PVC")
				);
		list.stream().filter(a->a.getPrice()>100&&(a.getCategory()).equals("Electronics")).forEach(a->System.out.println(a.getName()+" "+a.getPrice()+" "+a.getCategory()));
	}

}
