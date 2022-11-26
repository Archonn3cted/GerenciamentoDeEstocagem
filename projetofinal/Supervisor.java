package projetofinal;

import java.util.ArrayList;

public class Supervisor extends NormalWorker implements Employee {
	
	void SearchForItem(String code) {
		boolean exist = false;
		for (Item item: Employee.ItensList) {
			if (code == item.code) {
				System.out.println("Existem " + item.quantity + " unidades do produto no estoque.");
				exist = true;
			}
		} 	if (exist == false) {
			System.out.println("Não possuimos o item informado no estoque.");
		} 
	}

	void GetExpirationDate(String code) {
		boolean exist = false;
		for (Item item : Employee.ItensList) {
			if (code == item.code) {
				System.out.println("Exitem " + item.quantity + " unidades do item e sua data de vencimento é " + item.expdate);
				exist = true;
			}
		} 	if (exist == false) {
			System.out.println("Não possuimos o item informado no estoque.");
		} 
	}
	
	void HowLongToExpire(ExpirationDate e) {
		int difference = 0;
		for (Item item: Employee.ItensList) {
			difference = ((item.expdate.day - e.day) + ((item.expdate.month - e.month) * 30) + (item.expdate.year - e.year) * 365);
			if (difference > 0) {
				System.out.println("Item: " + item.code + " Status: "+ difference + " dias até o vencimento desse lote.");
			difference = 0;
			} else {
				System.out.println("Item: "+ item.code + " Status: Esse lote do produto está vencido." );
			}
		}
	}
	
	void RemoveExpiredItens(ExpirationDate e) {
		ArrayList<Item> ExpiredItens = new ArrayList<>();
		int difference = 0;
		for (Item item: Employee.ItensList) {
			difference = ((item.expdate.day - e.day) + ((item.expdate.month - e.month) * 30) + (item.expdate.year - e.year) * 365);
			if (difference <= 0) {
				ExpiredItens.add(item);
				}
			} 	for (Item item : ExpiredItens) {
				System.out.println(item.quantity + " unidades do item " + item.code + ", foram removidas por estar fora do prazo de validade.");
				Employee.ItensList.remove(item);
			}
			
	}
}
	

