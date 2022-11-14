package projetopoo;

import java.util.ArrayList;


public class Goods {
	String name; double quantity; String code;
	ArrayList<Goods> Products = new ArrayList<Goods>();
	
	void AddGoods(double quantity, String name, String code){
		this.quantity = quantity;
		this.name = name;
		this.code = code;
		Products.add(this);
	}
	
	
	
	void Dysplay(){
		for(Goods products: Products){
			System.out.println(products.code);
			}
		}
	
	
	
}
