package calculator_swing_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class CalcApp {

	private JFrame fCalc;
	private JTextField display;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp window = new CalcApp();
					window.fCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalcApp() {
		initialize();
	}

	private void initialize() {
		fCalc = new JFrame();
		fCalc.setBackground(new Color(0, 0, 0));
		fCalc.getContentPane().setBackground(new Color(0, 0, 0));
		fCalc.getContentPane().setForeground(new Color(0, 0, 0));
		fCalc.setTitle("Calculadora");
		fCalc.setResizable(false);
		fCalc.setBounds(100, 100, 300, 400);
		fCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCalc.getContentPane().setLayout(null);

		display = new JTextField();
		display.setEditable(false);
		display.setForeground(new Color(0, 0, 0));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("Dialog", Font.PLAIN, 40));
		display.setText("10");
		display.setBounds(12, 14, 274, 70);
		fCalc.getContentPane().add(display);
		display.setColumns(10);

		JButton btn_zero = new JButton("0");
		btn_zero.setBackground(new Color(211, 215, 207));
		btn_zero.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_zero.setBounds(15, 310, 125, 39);
		fCalc.getContentPane().add(btn_zero);

		JButton btn_one = new JButton("1");
		btn_one.setBackground(new Color(211, 215, 207));
		btn_one.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_one.setBounds(15, 257, 55, 39);
		fCalc.getContentPane().add(btn_one);

		JButton btn_two = new JButton("2");
		btn_two.setBackground(new Color(211, 215, 207));
		btn_two.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_two.setBounds(85, 257, 55, 39);
		fCalc.getContentPane().add(btn_two);

		JButton btn_three = new JButton("3");
		btn_three.setBackground(new Color(211, 215, 207));
		btn_three.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_three.setBounds(155, 257, 55, 39);
		fCalc.getContentPane().add(btn_three);

		JButton btn_four = new JButton("4");
		btn_four.setBackground(new Color(211, 215, 207));
		btn_four.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_four.setBounds(15, 204, 55, 39);
		fCalc.getContentPane().add(btn_four);

		JButton btn_five = new JButton("5");
		btn_five.setBackground(new Color(211, 215, 207));
		btn_five.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_five.setBounds(85, 204, 55, 39);
		fCalc.getContentPane().add(btn_five);

		JButton btn_six = new JButton("6");
		btn_six.setBackground(new Color(211, 215, 207));
		btn_six.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_six.setBounds(155, 204, 55, 39);
		fCalc.getContentPane().add(btn_six);

		JButton btn_seven = new JButton("7");
		btn_seven.setBackground(new Color(211, 215, 207));
		btn_seven.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_seven.setBounds(15, 151, 55, 39);
		fCalc.getContentPane().add(btn_seven);

		JButton btn_eight = new JButton("8");
		btn_eight.setBackground(new Color(211, 215, 207));
		btn_eight.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_eight.setBounds(85, 151, 55, 39);
		fCalc.getContentPane().add(btn_eight);

		JButton btn_nine = new JButton("9");
		btn_nine.setBackground(new Color(211, 215, 207));
		btn_nine.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_nine.setBounds(155, 151, 55, 39);
		fCalc.getContentPane().add(btn_nine);

		JButton btn_point = new JButton(".");
		btn_point.setBackground(new Color(211, 215, 207));
		btn_point.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_point.setBounds(155, 310, 55, 39);
		fCalc.getContentPane().add(btn_point);

		JButton btn_adiction = new JButton("+");
		btn_adiction.setForeground(new Color(255, 255, 255));
		btn_adiction.setBackground(new Color(252, 175, 62));
		btn_adiction.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_adiction.setBounds(225, 204, 55, 39);
		fCalc.getContentPane().add(btn_adiction);

		JButton btn_subtraction = new JButton("-");
		btn_subtraction.setForeground(new Color(255, 255, 255));
		btn_subtraction.setBackground(new Color(252, 175, 62));
		btn_subtraction.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_subtraction.setBounds(225, 151, 55, 39);
		fCalc.getContentPane().add(btn_subtraction);

		JButton btn_multiplication = new JButton("X");
		btn_multiplication.setForeground(new Color(255, 255, 255));
		btn_multiplication.setBackground(new Color(252, 175, 62));
		btn_multiplication.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_multiplication.setBounds(225, 98, 55, 39);
		fCalc.getContentPane().add(btn_multiplication);

		JButton btn_division = new JButton("/");
		btn_division.setForeground(new Color(255, 255, 255));
		btn_division.setBackground(new Color(252, 175, 62));
		btn_division.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_division.setBounds(155, 98, 55, 39);
		fCalc.getContentPane().add(btn_division);

		JButton btn_percent = new JButton("%");
		btn_percent.setForeground(new Color(255, 255, 255));
		btn_percent.setBackground(new Color(252, 175, 62));
		btn_percent.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_percent.setBounds(85, 98, 55, 39);
		fCalc.getContentPane().add(btn_percent);

		JButton btn_result = new JButton("=");
		btn_result.setForeground(new Color(255, 255, 255));
		btn_result.setBackground(new Color(114, 159, 207));
		btn_result.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_result.setBounds(225, 257, 55, 92);
		fCalc.getContentPane().add(btn_result);

		JButton btn_ac = new JButton("AC");
		btn_ac.setForeground(new Color(255, 255, 255));
		btn_ac.setBackground(new Color(243, 44, 44));
		btn_ac.setFont(new Font("Dialog", Font.BOLD, 13));
		btn_ac.setBounds(15, 98, 55, 39);
		fCalc.getContentPane().add(btn_ac);

	}
}
