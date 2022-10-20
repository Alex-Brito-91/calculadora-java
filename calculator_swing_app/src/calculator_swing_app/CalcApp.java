package calculator_swing_app;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class CalcApp {

	private JFrame fCalc;

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
	}

}
