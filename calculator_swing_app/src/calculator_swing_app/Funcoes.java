package calculator_swing_app;

import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Funcoes extends JLayeredPane implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JFormattedTextField txtText;

	private char op;
	private BigDecimal value1;
	private BigDecimal value2;
	private BigDecimal result;

	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnPercent;
	private JButton btnEquals;
	private JButton btnClear;

	public Funcoes(JFormattedTextField txtText) {
		this.txtText = txtText;

		btnAdd = new JButton("+");
		btnAdd.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btnAdd.setBackground(new Color(231, 196, 105));
		btnAdd.setBounds(206, 76, 55, 50);
		btnAdd.addActionListener(this);
		add(btnAdd);

		btnSub = new JButton("-");
		btnSub.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btnSub.setBackground(new Color(231, 196, 105));
		btnSub.setBounds(206, 132, 55, 50);
		btnSub.addActionListener(this);
		add(btnSub);

		btnMult = new JButton("X");
		btnMult.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btnMult.setBackground(new Color(231, 196, 105));
		btnMult.setBounds(206, 15, 55, 40);
		btnMult.addActionListener(this);
		add(btnMult);

		btnDiv = new JButton("/");
		btnDiv.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btnDiv.setBackground(new Color(231, 196, 105));
		btnDiv.setBounds(139, 15, 55, 40);
		btnDiv.addActionListener(this);
		add(btnDiv);

		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btnPercent.setBackground(new Color(231, 196, 105));
		btnPercent.setBounds(72, 15, 55, 40);
		btnPercent.addActionListener(this);
		add(btnPercent);

		btnEquals = new JButton("=");
		btnEquals.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btnEquals.setBackground(new Color(154, 198, 129));
		btnEquals.setBounds(206, 189, 55, 75);
		btnEquals.addActionListener(this);
		add(btnEquals);

		btnClear = new JButton("C");
		btnClear.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btnClear.setBackground(new Color(242, 71, 71));
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

			value2 = new BigDecimal(txtText.getText());
			result = new BigDecimal(0);

			if (op == '+') {
				result = result.add(value1.add(value2));
			} else if (op == '-') {
				result = result.add(value1.subtract(value2));
			} else if (op == 'X') {
				result = result.add(value1.multiply(value2));
			} else if (op == '/') {
				result = result.add(value1.divide(value2));
			} else if (op == '%') {
				BigDecimal percent = new BigDecimal(100);
				result = result.add(value1.divide(percent).multiply(value2));
			}
			
			DecimalFormat vf = new DecimalFormat("###,###.###");
			
			result.setScale(3, RoundingMode.HALF_EVEN);
			String valorString = vf.format(result);
			txtText.setText(valorString);

			op = '\u0000';
			value1.add(result);
			value2 = new BigDecimal(0);

		} else {

			op = btn.getText().charAt(0);
			
			String valueFormatado = (txtText.getText().replaceAll(".", ""));
			valueFormatado.replaceAll(",", ".");
			value1 = new BigDecimal(valueFormatado);
			txtText.setText("");
		}

	}

}
