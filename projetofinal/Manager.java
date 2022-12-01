package projetofinal;

import java.text.NumberFormat;
import java.time.LocalDate;

public class Manager extends Supervisor implements Employee {
	
	private static String ManagerName;
	private static int ManagerAge;
	private static double ManagerHeight;
	private static Manager Instance;
	
	private Manager(String ManagerName, int ManagerAge, double ManagerHeight){
		Manager.ManagerName = ManagerName;
		Manager.ManagerAge = ManagerAge;
		Manager.ManagerHeight = ManagerHeight;
	}
	
	public static Manager getManagerInstance(String ManagerName, int ManagerAge, double ManagerHeight) {
		if (Instance == null) {
			Instance = new Manager(ManagerName, ManagerAge, ManagerHeight);
		} 
		return Instance;
	}
	
	void WhoIsTheManager() {
		System.out.println("Nome: " + ManagerName + " Idade: " + ManagerAge + " Altura: " + ManagerHeight);
	}
	
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
	
	void DysplayModRecord() {
		for (LocalDate l: ModificationRecord) {
			System.out.println(l);
			
		}
	}
}
