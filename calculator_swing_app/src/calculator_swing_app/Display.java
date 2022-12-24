package calculator_swing_app;

import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Font;

public class Display extends JLayeredPane {
	
	private static final long serialVersionUID = 1L;
	
	private static JFormattedTextField txtNumber;
	
	public Display() {
		
		txtNumber = new JFormattedTextField();
		txtNumber.setFont(new Font("DialogInput", Font.PLAIN, 25));
		txtNumber.setBackground(new Color(255, 255, 255));
		txtNumber.setForeground(new Color(255, 255, 255));
		txtNumber.setHorizontalAlignment(JFormattedTextField.RIGHT);
		txtNumber.setBounds(2, 10, 264, 49);
		txtNumber.setColumns(12);
		txtNumber.setDisabledTextColor(Color.BLACK);
		txtNumber.setEnabled(false);
		add(txtNumber);
		setVisible(true);
		
	}
	
	public JFormattedTextField getTxtNumber() {
		return txtNumber;
	}
}
