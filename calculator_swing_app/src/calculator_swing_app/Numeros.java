package calculator_swing_app;

import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Numeros extends JLayeredPane implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JFormattedTextField txtText; 
	
	public Numeros(JFormattedTextField txtText) {
		this.txtText = txtText;
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btn1.setBounds(3, 12, 55, 40);
		btn1.addActionListener(this);
		add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btn2.setBounds(64, 12, 55, 40);
		btn2.addActionListener(this);
		add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btn3.setBounds(125, 12, 55, 40);
		btn3.addActionListener(this);
		add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btn4.setBounds(3, 62, 55, 40);
		btn4.addActionListener(this);
		add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btn5.setBounds(64, 62, 55, 40);
		btn5.addActionListener(this);
		add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btn6.setBounds(125, 62, 55, 40);
		btn6.addActionListener(this);
		add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btn7.setBounds(3, 111, 55, 40);
		btn7.addActionListener(this);
		add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btn8.setBounds(64, 111, 55, 40);
		btn8.addActionListener(this);
		add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btn9.setBounds(125, 111, 55, 40);
		btn9.addActionListener(this);
		add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btn0.setBounds(3, 160, 116, 40);
		btn0.addActionListener(this);
		add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btnDot.setBounds(125, 160, 55, 40);
		btnDot.addActionListener(this);
		add(btnDot);
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(txtText.getText().length() == 15) {
			return;
		}
		
		JButton btn = (JButton) e.getSource();
		String number = btn.getText();
		txtText.setText(txtText.getText() + number);
	}
	
}
