package projetofinal;

import java.time.LocalDate;

public class NormalWorkerProxy implements Employee {
	
	private NormalWorker normalworker;
	private LocalDate localDate = LocalDate.now();
	
	public NormalWorkerProxy(NormalWorker normalworker) {
		this.normalworker = normalworker;
	}
	
	@Override
	public void AddItem(String code, int quantity, ExpirationDate expdate, double price) {
		ModificationRecord.add(localDate);
		normalworker.AddItem(code, quantity, expdate, price);
	}
	@Override
	public void AddItem(Item item) {
		ModificationRecord.add(localDate);
		normalworker.AddItem(item);
	}
	@Override
	public void DysplayItens() {
		normalworker.DysplayItens();
		
	}

	@Override
	public void Clearall() {
		ModificationRecord.add(localDate);
		normalworker.Clearall();
		
	}
	

}
