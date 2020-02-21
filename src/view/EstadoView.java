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

public class EstadoView {
	private JTextField txtuf;
	private JTextField txtestado;
	private JLabel lblestado;
	private JLabel lbluf;
	private JButton botao1;
	private JButton botao2;
	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painel4;
	
	public void estadoView() {		
		
//		Criar as instancia
		
		txtestado = new JTextField();
		txtuf = new JTextField();
		lbluf = new JLabel();
		lblestado = new JLabel();
		botao1 = new JButton("Registrar");
		botao2 = new JButton("Cancelar ");
		janela = new JFrame();
		painelDaJanela=(JPanel) janela.getContentPane();
		painel4 = new JPanel();

		
		lblestado.setText("Estado:");
		lblestado.setBounds(15,45, 220, 20);
		
		lbluf.setText("UF:");
		lbluf.setBounds(265, 45, 220, 20);
		
		txtestado.setBounds(65, 45, 190, 25);
		txtuf.setBounds(285, 45, 50, 25);
		
		botao2.setText("Cancelar");
		botao2.setBounds(70, 100, 90, 25);
		botao2.addActionListener(new CancelarListener());

		botao1.setText("Cadastrar");
		botao1.setBounds(180, 100, 90, 25);
		
//		configuração do JPanel 4
		painel4.setBounds(4, 5, 365, 150);
		painel4.setLayout(new GridLayout(1,0,0,0));
		painel4.setBorder(new TitledBorder("Estado"));
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painel4);
		
//		configurar a tela 
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 200);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
		painelDaJanela.add(lbluf);
		painelDaJanela.add(txtuf);
		painelDaJanela.add(botao1);
		painelDaJanela.add(botao2);
		painelDaJanela.add(lblestado);
		painelDaJanela.add(txtestado);
		painelDaJanela.add(painel4);
	}
	
	public class CancelarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
//		janela.setVisible(false)
			System.exit(0);
		}

	}
	
}

