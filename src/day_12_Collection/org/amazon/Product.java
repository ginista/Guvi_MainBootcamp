package day_12_Collection.org.amazon;

public class Product {
//Define a data member
	private String name;
	private double price;
	private int quantity;
	
	//constructor
	public Product(String name,double price,int quantity) {
		//initialize all 3 members
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Getter method to print the data
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	//implement a setter method
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
