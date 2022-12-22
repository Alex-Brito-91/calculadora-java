package calculator_swing_app;

import javax.swing.JFrame;
import java.awt.Color;

public class Calculadora extends JFrame {
	
	public Calculadora() throws Exception {
		super("Calculadora");
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		setBackground(new Color(255, 255, 255));
		setTitle("Calculadora");
		setSize(300, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Display display = new Display();
		display.setBounds(12, 12, 274, 68);
		getContentPane().add(display);
		
		Funcoes1 funcoes1 = new Funcoes1();
		funcoes1.setBounds(12, 92, 274, 58);
		getContentPane().add(funcoes1);
		
		Funcoes2 funcoes2 = new Funcoes2();
		funcoes2.setBounds(214, 156, 69, 201);
		getContentPane().add(funcoes2);
		
		Numeros numeros = new Numeros();
		numeros.setBounds(15, 156, 193, 201);
		getContentPane().add(numeros);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) throws Exception {
		new Calculadora();
	}
}
