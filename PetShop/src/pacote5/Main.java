package pacote5;

import java.util.List;

import pacote1.Animal;
import pacote1.CadastroAnimais;

public class Main {


	public static void main(String[] args) {


		CadastroAnimais cadastroAnimais = new CadastroAnimais();
		
		Animal animal1 = new Animal();
		cadastroAnimais.adicionarAnimal(animal1);
		
		
		// Lista de animais cadastrados
		
		List<Animal> animaisCadastrados = cadastroAnimais.getAnimais();
		for (Animal animal : animaisCadastrados) {
			
			System.out.println(animal);
			
		}
	
		
	}

}