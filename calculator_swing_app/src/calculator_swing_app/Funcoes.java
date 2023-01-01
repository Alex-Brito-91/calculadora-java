package calculator_swing_app;

import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Funcoes extends JLayeredPane implements ActionListener {

	private static final long serialVersionUID = 2L;

	private JFormattedTextField textoTela;

	private char operador;
	private BigDecimal valor1;
	private BigDecimal valor2;
	private BigDecimal resultado;

	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnPercent;
	private JButton btnIgual;
	private JButton btnClear;

	public Funcoes(JFormattedTextField txtText) {
		this.textoTela = txtText;

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

		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
		btnIgual.setBackground(new Color(154, 198, 129));
		btnIgual.setBounds(206, 189, 55, 75);
		btnIgual.addActionListener(this);
		add(btnIgual);

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
		if (textoTela.getText().isEmpty()) {
			return;
		}

		JButton btn = (JButton) e.getSource();
		DecimalFormat vf = new DecimalFormat("#,###.00");

		if (btn == btnClear) {
			operador = '\u0000';
			textoTela.setText("");

		} else if (btn == btnIgual) {

			String valor2Formatado = (textoTela.getText().replaceAll("\\.", ""));
			String valor2Formatado2 = (valor2Formatado.replaceAll(",", "."));
			valor2 = new BigDecimal(valor2Formatado2);
			resultado = new BigDecimal(0);

			if (operador == '+') {
				resultado = valor1.add(valor2);
			} else if (operador == '-') {
				resultado = valor1.subtract(valor2);
			} else if (operador == 'X') {
				resultado = valor1.multiply(valor2);
			} else if (operador == '/') {
				resultado = valor1.divide(valor2);
			} else if (operador == '%') {
				BigDecimal percent = new BigDecimal(100);
				resultado = valor1.divide(percent).multiply(valor2);
			}
			
			textoTela.setText(vf.format(resultado));

			operador = '\u0000';
			valor1.add(resultado);
			valor2 = new BigDecimal(0);

		} else {

			operador = btn.getText().charAt(0);
			
			String valor1Formatado = (textoTela.getText().replaceAll("\\.", ""));
			String valor1Formatado2 = (valor1Formatado.replaceAll(",", "."));
			valor1 = new BigDecimal(valor1Formatado2);
			textoTela.setText("");
		}

	}

}
