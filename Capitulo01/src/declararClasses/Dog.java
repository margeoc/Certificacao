//1. Declaração do package deve aparecer no topo
package declararClasses;

//2. Declaração de imports em seguida, se houver.

//3. Declaração da classe

//Único modificador permitido é o public ou default
//se a subclasse estiver em outro pacote, é necessário importar a superclasse
public class Dog {
	
}


//Um arquivo pode ter mais de uma classe não public
class Cat{}   //modificador Default APENAS para classes no mesmo pacote
class outro{}

/*Só pode haver uma classe public em cada arquivo de código-fonte.

public class Bird{}    //Não compila


*/