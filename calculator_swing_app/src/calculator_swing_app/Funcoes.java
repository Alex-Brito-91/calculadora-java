package calculator_swing_app;

import javax.swing.JLayeredPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class Funcoes extends JLayeredPane implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JFormattedTextField txtText;

	private char op;
	private BigDecimal value1;
	private BigDecimal value2;
	private BigDecimal result;
	private BigDecimal valor;

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

			valor = new BigDecimal(0);
			valor = valor.add(result);
			
			DecimalFormat vf = new DecimalFormat("###,###,###.000");
			String valorString = vf.format(result);
			txtText.setText(valorString);

			op = '\u0000';
			value1.add(valor);
			value2 = new BigDecimal(0);

		} else {

			op = btn.getText().charAt(0);
			value1 = new BigDecimal(txtText.getText());
			txtText.setText("");
		}

	}

}
