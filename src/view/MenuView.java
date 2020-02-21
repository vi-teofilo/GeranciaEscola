package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuView {
	
	
	// declaração de variaveis 
		private JFrame janela;
		private JMenuBar barraMenu;
		private JMenu menu01;
		private JMenu menu02;
		private JMenuItem itemMenu1;
		private JMenuItem itemMenu2;
		private JPanel painelDaJanela;
		
		public void iniciaMenu() {
			
//		criar instancia 
			janela = new JFrame("Exemplo de menu");
			barraMenu = new JMenuBar();
			menu01 = new JMenu("Cadastro");
			menu02 = new JMenu("Relatório");
			itemMenu1 = new JMenuItem("Aluno");
			itemMenu2 = new JMenuItem("Item 2");
			painelDaJanela = (JPanel)janela.getContentPane();
			
			
			
//			acrescentar menus na barra de menu 
			barraMenu.add(menu01);
			barraMenu.add(menu02);
			
//			acrescentar idem de menu em menus 
			menu01.add(itemMenu1);
			menu02.add(itemMenu2);
			
		//		adicionar ação do menu 
			itemMenu1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					new AlunoView1().iniciaAluno();
				}	
			});
			
			itemMenu2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					new FuncionarioView().funcionarioView();
				}	
			});
			
			
//			configurar painel 
			painelDaJanela.setLayout(null);
			
			
//			configuração de tela, a barra de menu sempre fica dentro da janela 
			janela.setJMenuBar(barraMenu);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setSize(600, 600);
			janela.setVisible(true);
			
			
			
			
		}// fim do metodo Gui
		
		
		
}
