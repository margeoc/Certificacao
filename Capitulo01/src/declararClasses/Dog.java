//1. Declara��o do package deve aparecer no topo
package declararClasses;

//2. Declara��o de imports em seguida, se houver.

//3. Declara��o da classe

//�nico modificador permitido � o public ou default
//se a subclasse estiver em outro pacote, � necess�rio importar a superclasse
public class Dog {
	
}


//Um arquivo pode ter mais de uma classe n�o public
class Cat{}   //modificador Default APENAS para classes no mesmo pacote
class outro{}

/*S� pode haver uma classe public em cada arquivo de c�digo-fonte.

public class Bird{}    //N�o compila


*/