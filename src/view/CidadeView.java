package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import view.AlunoView1.CancelarListener;

public class CidadeView {
	
	private JTextField txtcidade;
	private JLabel lblcidade;
	private JButton botao1;
	private JButton botao2;
	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painel4;
	
	public void cidadeView() {		
		
//		Criar as instancia 
		txtcidade = new JTextField();
		lblcidade = new JLabel();
		botao1 = new JButton("Registrar");
		botao2 = new JButton("Cancelar ");
		janela = new JFrame();
		painelDaJanela=(JPanel) janela.getContentPane();
		painel4 = new JPanel();

		
		lblcidade.setText("Cidade:");
		lblcidade.setBounds(20, 62, 350, 20);
		
		txtcidade.setBounds(65, 60, 190, 25);
		
		botao2.setText("Cancelar");
		botao2.setBounds(40, 120, 90, 20);
		botao2.addActionListener(new CancelarListener());

		botao1.setText("Cadastrar");
		botao1.setBounds(150, 120, 90, 20);
		
//		configuração do JPanel 4
		painel4.setBounds(4, 5, 300, 150);
		painel4.setLayout(new GridLayout(1,0,0,0));
		painel4.setBorder(new TitledBorder("Cidade"));
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painel4);
		
//		configurar a tela 
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(320, 200);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
		painelDaJanela.add(botao1);
		painelDaJanela.add(botao2);
		painelDaJanela.add(lblcidade);
		painelDaJanela.add(txtcidade);
		painelDaJanela.add(painel4);
	}
	
	public class CancelarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
//		janela.setVisible(false)
			System.exit(0);
		}

	}
	
}
