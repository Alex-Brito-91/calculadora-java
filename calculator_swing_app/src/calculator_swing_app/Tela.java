package calculator_swing_app;

import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Font;

public class Tela extends JLayeredPane {
	
	private static final long serialVersionUID = 2L;
	
	private static JFormattedTextField textoTela;
	
	public Tela() {
		
		textoTela = new JFormattedTextField();
		textoTela.setFont(new Font("DialogInput", Font.ITALIC, 22));
		textoTela.setBackground(new Color(154, 198, 129));
		textoTela.setForeground(new Color(255, 255, 255));
		textoTela.setHorizontalAlignment(JFormattedTextField.RIGHT);
		textoTela.setBounds(2, 10, 264, 49);
		textoTela.setColumns(20);
		textoTela.setDisabledTextColor(Color.BLACK);
		textoTela.setEnabled(false);
		add(textoTela);
		setVisible(true);
		
	}
	
	public JFormattedTextField getTextoTela() {
		return textoTela;
	}
}
