package javaBeans;

public class Teste {
	public void setMyValue(int a){} 
	public int getMyValue(){ return 0;}
	
	
	//Booleanos
	public boolean isMyStatus(){ 
		return true;
	}
	
	//Métodos listenners
//	public void addMyListener (MyListener m){}
	
	//Inválidos
	/*
	void setCustomerName(String s) //deve ser public
	public void modifyMyValue(int v) //não pode usar 'modify'
	public void addXListenner(MyListenner m) //erro tipo de	listenner
	*/
}
