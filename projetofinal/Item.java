package projetofinal;

public class Item {
	String code; int quantity; ExpirationDate expdate; double price;
	Item(String code, int quantity, ExpirationDate expdate, double price){
		this.code = code;
		this.quantity = quantity;
		this.expdate = expdate;
		this.price = price;
		
	}
}
