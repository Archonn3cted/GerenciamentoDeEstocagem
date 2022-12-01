package projetofinal;

import java.time.LocalDate;
import java.util.ArrayList;

public interface Employee {
	
	ArrayList<Item> ItensList = new ArrayList<>();
	ArrayList<LocalDate> ModificationRecord = new ArrayList<>();
	
	public void AddItem(String code, int quantity, ExpirationDate expdate, double price);
	public void AddItem(Item item);
	public void DysplayItens();
	public void Clearall();
	
	
	

}