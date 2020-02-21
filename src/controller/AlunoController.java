package controller;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
//import java.util.Scanner;

import model.Aluno;
import model.Data;

public class AlunoController {
	 
	public void inserirAluno(String matricula,String nome, Data data,char sexo) {
//	recebe as informações dos alunos e salva
		
		
	Aluno aluno = new Aluno();
	Data d1 = new Data();
	aluno.setMatricula(matricula);
	aluno.setNome(nome);
	aluno.setDataNasc(d1);
	aluno.setSexo(sexo);
		 	
		File arquivo = new File("aluno.txt");
		  FileOutputStream arquivoOutput;	  
		try {
			arquivoOutput = new FileOutputStream(arquivo,true);
			PrintStream gravador = new PrintStream(arquivoOutput);
			  gravador.print(aluno.getMatricula());
			  gravador.print((";"));
			  gravador.print(aluno.getNome());
			  gravador.print((";"));
			  gravador.print(aluno.getDataNasc());
			  gravador.print((";"));
			  gravador.print(aluno.getSexo());
			  gravador.print(("\n"));
			
  
			  gravador.print(("\n"));
			  gravador.close();
			  arquivoOutput.close();
			  System.out.println("Alunos gravados!");
			 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  
		
		
	
}
	public void listarTodos() {
//		listar todos os alunos, ele le todos os alunos de saida 
		try {		
			InputStream is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader aluno = new BufferedReader(isr);
			String texto = aluno.readLine();
			 
			while (texto !=null) { 
				String dados[] = texto.split(";");
				
				System.out.println("A matricula do aluno:"+dados[0]);
				System.out.println("O nome do aluno:"+dados[1]);
				System.out.println("A Data de Nascimento do aluno:"+dados[2]);
				System.out.println("O sexo do aluno:"+dados[3]+"\n");
				texto = aluno.readLine();
				
				
			} 
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de entrada não encontrado!");	
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
//	vai ler os alunos e mostrar somente o aniversariante l
	public void listarAniversariantes(int mes) {
		try {		
			InputStream is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader aluno = new BufferedReader(isr);
			String texto = aluno.readLine();
			 
			while (texto !=null) { 
				String dados[] = texto.split(";");
				String data[] = dados[2].split("/");
				int mesAniversario = Integer.parseInt(data[1]);
				if (mesAniversario==mes) {
					System.out.println("A matricula do aluno:"+dados[0]);
					System.out.println("O nome do aluno:"+dados[1]);
					System.out.println("A Data de Nascimento do aluno:"+dados[2]);
					System.out.println("O sexo do aluno:"+dados[3]+"\n");
						
				}
				texto = aluno.readLine();
				
				
			} 
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de entrada não encontrado!");	
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
