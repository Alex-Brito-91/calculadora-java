package calculator_swing_app;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.UIManager;
import java.awt.Color;

public class Numeros  {
	

	public static void main(String[] args) {

		JPanel numeros = new JPanel();
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(UIManager.getColor("CheckBox.background"));
		desktopPane.setBounds(12, 152, 210, 205);
		
		numeros.setSize(225, 365);
		numeros.setLocation(600, 200);
		numeros.setLayout(null);
		numeros.add(desktopPane);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(12, 226, 173));
		btn1.setBounds(7, 9, 60, 40);
		desktopPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(12, 226, 173));
		btn2.setBounds(74, 9, 60, 40);
		desktopPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(12, 226, 173));
		btn3.setBounds(141, 9, 60, 40);
		desktopPane.add(btn3);

		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(12, 226, 173));
		btn4.setBounds(7, 58, 60, 40);
		desktopPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(12, 226, 173));
		btn5.setBounds(74, 58, 60, 40);
		desktopPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(12, 226, 173));
		btn6.setBounds(141, 58, 60, 40);
		desktopPane.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(12, 226, 173));
		btn7.setBounds(7, 107, 60, 40);
		desktopPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(12, 226, 173));
		btn8.setBounds(74, 107, 60, 40);
		desktopPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(12, 226, 173));
		btn9.setBounds(141, 107, 60, 40);
		desktopPane.add(btn9);

		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(12, 226, 173));
		btn0.setBounds(74, 156, 60, 40);
		desktopPane.add(btn0);

		JFrame f = new JFrame();
		f.setTitle("Calculadora");
		f.setSize(300, 400);
		f.setLocation(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(numeros);
		f.setVisible(true);
		
	}
}
