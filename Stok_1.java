package Stok;
import java.util.Scanner;
public class Stok_1 {

	Scanner sr = new Scanner(System.in);
	//Atributos do Estoque
	public String name;
	public double price;
	public int quantity;
	
	

	
	public double TotalValueInStok() {
		return price * quantity;
	}
	
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
		
	}
	
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}


	@Override
	public String toString() {
		return "Name: " + this.name 
				+ ", Price: $ "+ String.format("%.2f", price) + ", Quantity in stock: " 
				+ this.quantity + ", Total: " + String.format("%.2f", TotalValueInStok());
	}
	
	
	
}
