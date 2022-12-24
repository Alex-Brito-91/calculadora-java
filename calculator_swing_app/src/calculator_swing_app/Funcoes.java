package calculator_swing_app;

import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Funcoes extends JLayeredPane implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	private JTextField txtText;
	
	private char op;
	private double value1;
	private double value2;
	
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnPercent;
	private JButton btnEquals;
	private JButton btnClear;
	
	public Funcoes(JTextField txtText) {
		this.txtText = txtText;
		
		btnAdd = new JButton("+");
		btnAdd.setBounds(206, 76, 55, 50);
		btnAdd.addActionListener(this);
		add(btnAdd);
		
		btnSub = new JButton("-");
		btnSub.setBounds(206, 132, 55, 50);
		btnSub.addActionListener(this);
		add(btnSub);
		
		btnMult = new JButton("X");
		btnMult.setBounds(206, 15, 55, 40);
		btnMult.addActionListener(this);
		add(btnMult);
		
		btnDiv = new JButton("/");
		btnDiv.setBounds(139, 15, 55, 40);
		btnDiv.addActionListener(this);
		add(btnDiv);
		
		btnPercent = new JButton("%");
		btnPercent.setBounds(72, 15, 55, 40);
		btnPercent.addActionListener(this);
		add(btnPercent);
		
		btnEquals = new JButton("=");
		btnEquals.setBounds(206, 189, 55, 75);
		btnEquals.addActionListener(this);
		add(btnEquals);
		
		btnClear = new JButton("C");
		btnClear.setBounds(7, 15, 53, 40);
		btnClear.addActionListener(this);
		add(btnClear);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (txtText.getText().isEmpty()) {
			return;
		}
		
		JButton btn = (JButton) e.getSource();
		
		if (btn == btnClear) {
			op = '\u0000';
			txtText.setText("");
			
		} else if (btn == btnEquals) {
			value2 = Double.parseDouble(txtText.getText());
			
			double result = 0.0;
			
			if (op == '+') {
				result = value1 + value2;
			} else if (op == '-') {
				result = value1 - value2;
			} else if (op == 'X') {
				result = value1 * value2;
			} else if (op == '/') {
				result = value1 / value2;
			}
			
			txtText.setText(String.valueOf(result));
			op = '\u0000'; 
			value1 = result;
			value2 = 0;
			
		} else {
			
			op = btn.getText().charAt(0);
			value1 = Double.parseDouble(txtText.getText());
			txtText.setText("");
		}
		
	}
	
}
