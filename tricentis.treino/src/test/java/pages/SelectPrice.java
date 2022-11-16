package pages;

import elementos.Elementos;
import metodos.Metodos;

public class SelectPrice {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	public void selectPrice() {
		
		
		metodos.pausa(2000);;
		metodos.clicar(el.selectP, "select price");
		metodos.evidencias("price");
		//metodos.pausa(2000);
		//metodos.esperarElemento(el.download);
		metodos.esperarElemento(el.next4);
		
		
		
	}

}
