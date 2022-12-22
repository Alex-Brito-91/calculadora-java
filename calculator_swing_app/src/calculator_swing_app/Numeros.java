package calculator_swing_app;

import javax.swing.JLayeredPane;
import javax.swing.JButton;

public class Numeros extends JLayeredPane {
	
	public Numeros() {
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(3, 12, 55, 40);
		add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(64, 12, 55, 40);
		add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(125, 12, 55, 40);
		add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(3, 62, 55, 40);
		add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(64, 62, 55, 40);
		add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(125, 62, 55, 40);
		add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(3, 111, 55, 40);
		add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(64, 111, 55, 40);
		add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(125, 111, 55, 40);
		add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(3, 160, 116, 40);
		add(btn0);
		
		JButton btnPoint = new JButton(".");
		btnPoint.setBounds(125, 160, 55, 40);
		add(btnPoint);
		
		setVisible(true);
		
	}
}
