package model;
/* Classe criada para Professor  
* @author vfurtado
* @since 18/02/2020
* @version 0.1
*/
// 
public class Aluno {

	private String matricula;
	private String nome;
	private Data dataNasc;
	private char sexo;

	public Aluno() {
	
}
	
	
	
	public Aluno(String matricula, String nome, Data dataNasc, char sexo) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Data getDataNasc() {
		return dataNasc;
	}



	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
