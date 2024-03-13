package entities;

public class Products {
	private String name;
	private double price;
	private int quantity;

	
public Products(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity; //this é para diferenciar atributos de variáveis locais e para passar o próprio objeto como argumento na chamada de um método ouconstrutor. 
}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getQuantity() {
	return quantity; // só get por regras de negócios
}
public double totalValueStock() {
	return price*quantity;	
}
public void addProducts(int quantity) {
	this.quantity += quantity;
}

public void removeProducts(int quantity) {
	this.quantity -= quantity;
	}

public String toString() {
	return name 
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+quantity
			+ " units, Total: $ "
			+ String.format("%.2f",totalValueStock());
}


}

