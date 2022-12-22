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
		setSize(300, 420);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Display display = new Display();
		display.setBounds(12, 12, 274, 68);
		getContentPane().add(display);
		
		Numeros numeros = new Numeros();
		numeros.setBounds(15, 156, 193, 201);
		getContentPane().add(numeros);
		
		Funcoes funcoes = new Funcoes();
		funcoes.setBounds(12, 92, 274, 265);
		getContentPane().add(funcoes);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) throws Exception {
		new Calculadora();
	}
}
