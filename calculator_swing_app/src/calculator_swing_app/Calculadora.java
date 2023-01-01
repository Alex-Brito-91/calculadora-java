package calculator_swing_app;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.Color;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 2L;

	public Calculadora() throws Exception {
		getContentPane().setForeground(new Color(255, 255, 255));

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			// If Nimbus is not available, you can set the GUI to another look and feel.
		}

		getContentPane().setBackground(new Color(85, 87, 83));
		getContentPane().setLayout(null);
		setBackground(new Color(85, 87, 83));
		setTitle("Calculadora");
		setSize(300, 420);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Tela tela = new Tela();
		tela.getTextoTela().setBounds(2, 10, 264, 75);
		tela.setForeground(new Color(0, 0, 0));
		tela.setBounds(12, 0, 274, 91);
		getContentPane().add(tela);

		Numeros numeros = new Numeros(tela.getTextoTela());
		numeros.setBounds(15, 156, 193, 201);
		getContentPane().add(numeros);

		Funcoes funcoes = new Funcoes(tela.getTextoTela());
		funcoes.setBounds(12, 92, 274, 265);
		getContentPane().add(funcoes);

		setVisible(true);

	}

	public static void main(String[] args) throws Exception {
		new Calculadora();
	}
}
