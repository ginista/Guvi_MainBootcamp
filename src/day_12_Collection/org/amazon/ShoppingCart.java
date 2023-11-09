package day_12_Collection.org.amazon;

import java.util.Vector;

public class ShoppingCart {
	
	public static void main(String args[]) {
		//create a vector
		//Collection<Product> shoppingcart = new Vector<>();
		Vector<Product> shoppingcart = new  Vector<>();
		
		//add a product to the shopping cart.
		shoppingcart.add(new Product("Laptop",150000,1));
		shoppingcart.add(new Product("Headphones",6000,2));
		shoppingcart.add(new Product("Mouse",1500,5));
		
		//update the mouse quantity from 5 to 1
		for(Product product:shoppingcart) {
			if(product.getName().equals("Mouse")) {
				//reduce the quantity
				product.setQuantity(2);
				break;
			}
		}
		//remove the product headphone.
		for(Product product:shoppingcart) {
			if(product.getName().equals("Headphones")) {
			     shoppingcart.remove(product);
			     break;
			}
		}
		
		//display product details
		System.out.println("Shopping cart : ");
		for(Product product:shoppingcart) {
			System.out.println(product);
		}
		
		//calculating total price of the product
		double totalPrice =0;
		for(Product product:shoppingcart) {
			totalPrice+=product.getPrice()*product.getQuantity();
		}
		System.out.println("Total Product Cost : "+totalPrice);
	}

}
