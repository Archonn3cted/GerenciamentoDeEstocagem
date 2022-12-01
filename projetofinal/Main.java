package projetofinal;

public class Main {
	public static void main(String[] args) {
		
		ExpirationDate e = new ExpirationDate(12, 12, 2002);
		Item item = new Item("Teste", 15, e, 155);
		Item item2 = new Item("Teste2", 15, e, 155);
		Manager m = Manager.getManagerInstance("Matheus", 25, 1.85);
		NormalWorker n = new NormalWorker();
		Employee E = new NormalWorkerProxy(n);
		E.AddItem(item);
		E.DysplayItens();
		m.DysplayModRecord();
		m.WhoIsTheManager();
		Warehouse a1 = new Warehouse01();
		a1.AddToWarehouse(E.ItensList);
		a1.ShowItens();
		E.Clearall();
		System.out.println("==================================");
		E.AddItem(item2);
		Warehouse a2 = new Warehouse02();
		a2.AddToWarehouse(E.ItensList);
		a2.ShowItens();
	}	
}
