package projetofinal;

import java.util.ArrayList;

public interface Employee {
	
	ArrayList<Item> ItensList = new ArrayList<>();
	
	public void AddItem(String code, int quantity, ExpirationDate expdate, double price);
	public void AddItem(Item item);
	public void DysplayItens();

}
