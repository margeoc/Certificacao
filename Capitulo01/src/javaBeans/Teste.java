package javaBeans;

public class Teste {
	public void setMyValue(int a){} 
	public int getMyValue(){ return 0;}
	
	
	//Booleanos
	public boolean isMyStatus(){ 
		return true;
	}
	
	//M�todos listenners
//	public void addMyListener (MyListener m){}
	
	//Inv�lidos
	/*
	void setCustomerName(String s) //deve ser public
	public void modifyMyValue(int v) //n�o pode usar 'modify'
	public void addXListenner(MyListenner m) //erro tipo de	listenner
	*/
}
