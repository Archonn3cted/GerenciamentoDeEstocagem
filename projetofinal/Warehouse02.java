package projetofinal;

import java.util.ArrayList;

public class Warehouse02 implements Warehouse {
	private ArrayList<ArrayList<Item>> WarehouseList = new ArrayList<>();
	
	public void AddToWarehouse(ArrayList<Item> ListOfItens) {
		WarehouseList.add(ListOfItens);
	}
	
	public void ShowItens() {
		for (ArrayList<Item> i: WarehouseList) {
			for (Item j: i) {
				System.out.println(j.code);
			}
		}
	}
}
