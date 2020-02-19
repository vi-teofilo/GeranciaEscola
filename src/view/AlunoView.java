package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.AlunoController;
import model.Data;

public class AlunoView {
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JTextField txtSexo;

	public AlunoView() {

		iniciaGui();
	}

	public void iniciaGui() {

		janela = new JFrame("Cadastro Aluno");
		janela.setTitle("Cadastro Aluno");
		janela.setSize(700, 200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);

		botao1 = new JButton("Clique aqui");
		botao1.setText("Cancelar");
		botao1.setBounds(325, 135, 100, 20);
		botao1.addActionListener(new CancelarListener());

		botao2 = new JButton("Clique aqui");
		botao2.setText("Salvar");
		botao2.setBounds(200, 135, 100, 20);
		botao2.addActionListener(new SalvarListener());

		JLabel lblMatricula = new JLabel();
		lblMatricula.setText("Numero da Matricula:");
		lblMatricula.setBounds(5, 10, 350, 20);

		JLabel lblNome = new JLabel();
		lblNome.setText("Nome do Aluno:");
		lblNome.setBounds(5, 35, 350, 20);

		JLabel lblDataNasc = new JLabel();
		lblDataNasc.setText("Data de Nascimento:");
		lblDataNasc.setBounds(5, 60, 350, 20);

		JLabel lblSexo = new JLabel();
		lblSexo.setText("Sexo:");
		lblSexo.setBounds(5, 85, 350, 20);

		txtMatricula = new JTextField();
		txtMatricula.setBounds(130, 10, 350, 20);

		txtNome = new JTextField();
		txtNome.setBounds(130, 35, 350, 20);

		txtDataNasc = new JTextField();
		txtDataNasc.setBounds(130, 60, 350, 20);

		txtSexo = new JTextField();
		txtSexo.setBounds(130, 85, 350, 20);

//	criar area de texto 
		area = new JTextArea();

//	cria um campo para digitar texto 
		campo = new JTextField();
//	Adicionar o metodo desenvolvido na classe TextoListerner		
		campo.addActionListener(new TextoListener());

//	adicionar os componentes na tela 
		janela.getContentPane().add(botao1);
		janela.getContentPane().add(botao2);
		janela.getContentPane().add(lblMatricula);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(lblDataNasc);
		janela.getContentPane().add(lblSexo);
		janela.getContentPane().add(txtMatricula);
		janela.getContentPane().add(txtNome);
		janela.getContentPane().add(txtDataNasc);
		janela.getContentPane().add(txtSexo);

//	informar a visibilidade da tela 
		janela.setVisible(true);

	}

	public class TextoListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

//		tem função de contatenar o campo e vc adiciona \n para pular uma linha 
//		sempre que o usuario adicionar um texto
			area.append(campo.getText() + "\n");
//		aqui vc esta limpando o campo digitado pelo usuario
			campo.setText(null);

		}
	}

	public class CancelarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Programa encerrado!");
			System.exit(0);
		}

	}

	public class SalvarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			AlunoController aluno = new AlunoController();
			
			try {
				boolean registro =true;
				
				String aux = txtSexo.getText().toUpperCase();
				char sexo = aux.charAt(0);
				
		
				String aux3 = txtDataNasc.getText();

				String data[] = aux3.split("/");
				int dia = Integer.parseInt(data[0]);
				int mes = Integer.parseInt(data[1]);
				int ano = Integer.parseInt(data[2]);
				Data data1 = new Data(dia, mes, ano);
				

//				StringBuilder sbRegistro = new StringBuilder();
				if ((txtMatricula.getText().equals(null) || txtMatricula.getText().trim().equals(""))
						|| (txtNome.getText().equals(null) || txtNome.getText().trim().equals(""))
						|| (txtDataNasc.getText().equals(null) || txtDataNasc.getText().trim().equals(""))
						|| (txtSexo.getText().equals(null)) || txtSexo.getText().trim().equals("")) {
					

				} else {
					aluno.inserirAluno(txtMatricula.getText(), txtNome.getText(), data1, sexo);
				}
				
				

				if (data.length != 3) { 
					registro= false;
				}
				 //Verifico se fevereiro está com mais de 28 dias
				if ((mes == 2) && (dia > 29)) {
					registro = false;
				}
//				// meses tem mais de 31 dias
				if ((dia > 31) || (dia < 1) || (mes < 1) || (mes > 12) || (ano > 2020) || (ano < 1800)) { 
					registro = false;
				}
				
				
				if ((sexo!='m'&& sexo!='f')) {
					registro = false;
					
				}
				

				JOptionPane.showMessageDialog(null, "Aluno salvo com sucesso!");
//		} catch (Exception e2) {
//				JOptionPane.showMessageDialog(null, "Preencher todos os campo!!");
//				// TODO: handle exception
			} catch (NumberFormatException N) { // Utilizo alguns catchs para tratar exceptions
				JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!\n\n");
			} catch (java.lang.ArrayIndexOutOfBoundsException A) {
				JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!");
			} catch (java.lang.StringIndexOutOfBoundsException C) {
				JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!");
			}
			txtMatricula.setText("");
			txtNome.setText("");
			txtDataNasc.setText("");
			txtSexo.setText("");
		}
	}
}
