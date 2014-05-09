package packageC;

import packageB.Filho;

public class Neto extends Filho {
	Filho f1 = new Filho();
	
	public void testaFilho(){
		f1.doPaiThings();
		System.out.println(doPaiThings());
	}
}
