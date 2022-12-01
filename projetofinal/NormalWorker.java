package projetofinal;

import java.util.Iterator;

public class NormalWorker implements Employee {
	
	@Override
	public void AddItem(String code, int quantity, ExpirationDate expdate, double price) {
		if (Check(code, quantity, expdate) == false) {
			Employee.ItensList.add(new Item(code, quantity, expdate, price));
			}}

	@Override
	public void AddItem(Item item) {
		if (Check(item.code, item.quantity, item.expdate) == false) {
		Employee.ItensList.add(item);
		}
	}

	@Override
	public void DysplayItens() {
		Iterator<Item> it = ItensList.iterator();
        	while (it.hasNext()) {
            		System.out.println(it.next());
        	}
	}
		
	private boolean Check(String code, int quantity, ExpirationDate expdate){
		
		if (Employee.ItensList.size() == 0) {
			return false; } else {
			for (Item item: Employee.ItensList){
				if (code.equals(item.code) && expdate == item.expdate) {
					item.quantity += quantity;
					return true; }}}
		return false;
		}

	@Override
	public void Clearall() {
		Employee.ItensList.clear();
		
	}	
	}
