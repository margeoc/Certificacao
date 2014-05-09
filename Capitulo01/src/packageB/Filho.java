package packageB;

import packageA.Pai;

public class Filho extends Pai{
	public void testaPai(){
		System.out.println(this.doPaiThings()); 
		System.out.println(doPaiThings()); //O this é implícito
	}
}
