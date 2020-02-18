package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AlunoView {
	private JFrame janela;
	private JButton botao1;	
	private JTextField campo;
	private JTextArea area;
	
	
	public AlunoView () {
		iniciaGui();
	}
	
	
	
	public void iniciaGui() {
		
		
		
		
//		configurar o tamanho da tela 
		janela.setSize(300, 300);
		
//		Cria a janela (instancia)
		janela = new JFrame();
		
//		criar area de texto 
		area = new JTextArea();
		
//		criar o primeiro botão
		botao1 = new JButton("Clique aqui");
		
//		Adicionar o metodo desenvolvido na classe TextoListerner 
//		addActionListener(new TextoListener()) intancia  o TextoListener e mostra tudo o que tem dentro dela 
		botao1.addActionListener(new TextoListener());
		
		
//		cria um campo para digitar texto 
		campo = new JTextField();
//		Adicionar o metodo desenvolvido na classe TextoListerner		
		campo.addActionListener(new TextoListener());
		
		JLabel lblMatricula = new JLabel();
		lblMatricula.setText("Numero da Matricula:");
		lblMatricula.setBounds(10, 40, 40, 20);
		
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome do Aluno:");
		lblNome.setBounds(10, 35, 100, 35);
		
		JLabel lblDataNasc = new JLabel();
		lblDataNasc.setText("Data de Nascimento:");
		lblDataNasc.setBounds(10, 40, 40, 20);
		
		JLabel lblSexo = new JLabel();
		lblSexo.setText("Sexo :");
		lblSexo.setBounds(10, 40, 40, 20);
		
		
		
		
		
	}

	public class TextoListener implements ActionListener {		
	public void actionPerformed(ActionEvent arg0) {
//			tem função de contatenar o campo e vc adiciona \n para pular uma linha 
//			sempre que o usuario adicionar um texto
		area.append(campo.getText()+"\n");
//			aqui vc esta limpando o campo digitado pelo usuario
			campo.setText(null);
	
		}
	}
}
