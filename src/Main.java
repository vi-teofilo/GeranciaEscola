
import controller.AlunoController;
import controller.ProfessorController;
import view.AlunoView;

/* Classe criada para adicionar e mostrar valor  
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe com seus atributos de exibição
public class Main {

	public static void main(String[] args) {
	
//		ProfessorController p1 = new ProfessorController();
//		 p1.testaProfessor();		
//		
		AlunoController aluno = new AlunoController();
//		aluno.inserirAluno();
//		aluno.listarTodos();		
//		aluno.listarAniversariantes(12);
		new AlunoView();
	}
	
	
	
	
}
