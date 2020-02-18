package controller;

/* Classe criada para processar a classe professor 
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe com suas definições, para testar a classe professor e suas caracteristicas 
import model.Professor;

public class ProfessorController {

	public void testaProfessor() {
		Professor p1= new Professor();
		p1.setNome("Vitória");
		p1.setCPF("133.289.778-99");
		p1.setSalario(50.000);
		p1.setMateria("Massoterapia");
		p1.exibe();
	}
	
	
	
	
	
	
	
	
	
}
