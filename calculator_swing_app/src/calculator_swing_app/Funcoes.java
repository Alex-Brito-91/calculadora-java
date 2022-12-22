package calculator_swing_app;

import javax.swing.JLayeredPane;
import javax.swing.JButton;

public class Funcoes extends JLayeredPane {
	
	public Funcoes() {
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(7, 15, 53, 40);
		add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBounds(72, 15, 55, 40);
		add(btnPercent);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(139, 15, 55, 40);
		add(btnDiv);
		
		JButton btnMult = new JButton("X");
		btnMult.setBounds(206, 15, 55, 40);
		add(btnMult);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBounds(206, 76, 55, 50);
		add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setBounds(206, 132, 55, 50);
		add(btnSub);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(206, 189, 55, 75);
		add(btnEquals);
		
		setVisible(true);
		
	}
}
