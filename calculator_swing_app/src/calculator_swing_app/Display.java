package calculator_swing_app;

import javax.swing.JLayeredPane;
import javax.swing.JTextField;

public class Display extends JLayeredPane {
	
	private static JTextField txtNumber;
	
	public Display() {
		
		txtNumber = new JTextField();
		txtNumber.setHorizontalAlignment(JTextField.RIGHT);
		txtNumber.setBounds(2, 10, 264, 49);
		txtNumber.setColumns(15);
		txtNumber.setEnabled(false);
		add(txtNumber);
		setVisible(true);
		
	}
	
	public JTextField getTxtNumber() {
		return txtNumber;
	}
}
