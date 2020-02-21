package model;

/* Classe criada para Funcionario, adicionando atributos p/ classe Faxineira, Professor, Secretaria
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe Carro com seus atributos
public class Funcionario {
	private int id;
	private String nome;
	private String cpf;
	private double salario;
	private Data dataNasc;
	private Endereco endereco;
	private String telefone;
	
	
	public Funcionario() {
		System.out.println("Funcionario criado!");
		
		
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public Data getDataNasc() {
		return dataNasc;
	}



	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public void exibe(){
		System.out.println("Nome do Funcionario: "+nome);
		System.out.println("CPF do Funcionario: "+cpf);
		System.out.println("Salario do Funcionario: "+salario);
		
	
}	
	
}
