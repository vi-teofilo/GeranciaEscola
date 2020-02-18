package model;

/* Classe criada para Funcionario, adicionando atributos p/ classe Faxineira, Professor, Secretaria
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe Carro com seus atributos
public class Funcionario {
	private String nome;
	private String CPF;
	private double salario;

	public Funcionario() {
		System.out.println("Funcionario criado!");
		
		
	}

	public Funcionario(String nome, String cPF, double salario) {

		this.nome = nome;
		CPF = cPF;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void exibe(){
		System.out.println("Nome do Funcionario: "+nome);
		System.out.println("CPF do Funcionario: "+CPF);
		System.out.println("Salario do Funcionario: "+salario);
		
	
}	
	
}
