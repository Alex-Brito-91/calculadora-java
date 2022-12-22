package calculator_swing_app;

import javax.swing.JLayeredPane;
import javax.swing.JButton;

public class Funcoes2 extends JLayeredPane {
	
	public Funcoes2() {
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBounds(4, 12, 55, 50);
		add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setBounds(4, 68, 55, 50);
		add(btnSub);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(4, 125, 55, 75);
		add(btnEquals);
		
		setVisible(true);
		
	}
}
