package calculator_swing_app;

import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class Display extends JLayeredPane {
	
	private static JTextField txtNumber;
	
	public Display() {
		
		txtNumber = new JTextField();
		txtNumber.setFont(new Font("DialogInput", Font.PLAIN, 25));
		txtNumber.setBackground(new Color(255, 255, 255));
		txtNumber.setForeground(new Color(255, 255, 255));
		txtNumber.setHorizontalAlignment(JTextField.RIGHT);
		txtNumber.setBounds(2, 10, 264, 49);
		txtNumber.setColumns(15);
		txtNumber.setDisabledTextColor(Color.BLACK);
		txtNumber.setEnabled(false);
		add(txtNumber);
		setVisible(true);
		
	}
	
	public JTextField getTxtNumber() {
		return txtNumber;
	}
}
