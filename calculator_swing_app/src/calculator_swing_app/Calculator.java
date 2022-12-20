package calculator_swing_app;

import javax.swing.JFrame;

public class Calculator extends JFrame {
	
	public Calculator() {
		setTitle("calculadora");
		setSize(300,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
	
}

	
	
