package Stok;

import java.util.Scanner;

public class Stok_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sr = new Scanner(System.in);

		Stok_1 product = new Stok_1();
		System.out.print("Enter Product Data \n");
		System.out.print("Name: ");
		product.name = sr.nextLine();
		System.out.print("Price:$ ");
		product.price = sr.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sr.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);

		
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int quantity = sr.nextInt();
		product.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);

		
		
		
		
		System.out.print("\nEnter the number of products to be remove in stock");
		quantity = sr.nextInt();
		product.RemoveProducts(quantity);
		System.out.println("Product data: " + product);
		sr.close();
	}

}
