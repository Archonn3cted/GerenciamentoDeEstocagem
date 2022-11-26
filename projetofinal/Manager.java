package projetofinal;

import java.text.NumberFormat;

public class Manager extends Supervisor implements Employee {
	
	void RemoveItem(String code) {
		for (Item item: Employee.ItensList) {
			if (item.code == code) {
				System.out.println("O item " + item.code + " foi removido.");
				Employee.ItensList.remove(item);
			}
		} System.out.println("O item não está no estoque.");
	}
	
	void RemoveItem(String code, ExpirationDate expdate) {
		for (Item item: Employee.ItensList) {
			if (item.code == code && item.expdate == expdate) {
				System.out.println("O item " + item.code + " foi removido.");
				Employee.ItensList.remove(item);
			}
		}	System.out.println("O item não está no estoque.");
	}
	
	void GetTotalValue(){
		double TotalValue = 0;
		NumberFormat inteiro = NumberFormat.getInstance();
		for (Item item: Employee.ItensList) {
			TotalValue += item.price * item.quantity;
		} System.out.println("O valor total de todos os itens aramazenados é: R$ " + inteiro.format(TotalValue));
	}
	
	void ChangePrice(String code, ExpirationDate expdate, double price) {
		for (Item item: Employee.ItensList) {
			if (item.code == code && item.expdate == expdate) {
				System.out.println("O preço do item " + item.code + " foi alterado de R$ " + item.price + " para R$ " + price);
				item.price = price;
			}
		}
	}
}
