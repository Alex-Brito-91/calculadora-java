package calculator_swing_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

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
		fCalc.setTitle("Calculadora");
		fCalc.setResizable(false);
		fCalc.setBounds(100, 100, 300, 400);
		fCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCalc.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("Dialog", Font.PLAIN, 40));
		display.setText("0");
		display.setBounds(12, 12, 274, 70);
		fCalc.getContentPane().add(display);
		display.setColumns(10);
	}
}
