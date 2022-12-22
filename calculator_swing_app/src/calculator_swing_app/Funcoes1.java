package calculator_swing_app;

import javax.swing.JLayeredPane;

import javax.swing.JButton;

public class Funcoes1 extends JLayeredPane {
	
	public Funcoes1() {
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(5, 15, 55, 40);
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
		
		setVisible(true);
		
	}
}
