package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class TelaPrincipal {

	private JFrame frmCalculadora;
	private JTextField telaPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calculos calculos = new Calculos();
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.getContentPane().setBackground(SystemColor.windowBorder);
		frmCalculadora.setResizable(false);
		frmCalculadora.getContentPane().setLayout(null);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			telaPrincipal.setText(telaPrincipal.getText().concat("."));
		}
			});
		btnPonto.setBounds(10, 298, 50, 38);
		frmCalculadora.getContentPane().add(btnPonto);
		
		JButton btn1 = new JButton("1");
		btn1.setHorizontalAlignment(SwingConstants.RIGHT);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaPrincipal.setText(telaPrincipal.getText().concat("1"));
			}
		});
		btn1.setBounds(10, 249, 50, 38);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setText(telaPrincipal.getText().concat("2"));
			}
		});
		btn2.setBounds(70, 249, 50, 38);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setText(telaPrincipal.getText().concat("3"));
			}
		});
		btn3.setBounds(130, 249, 50, 38);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setText(telaPrincipal.getText().concat("4"));
			}
		});
		btn4.setBounds(10, 200, 50, 38);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setText(telaPrincipal.getText().concat("5"));
			}
		});
		btn5.setBounds(70, 200, 50, 38);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setText(telaPrincipal.getText().concat("6"));
			}
		});
		btn6.setBounds(130, 200, 50, 38);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setText(telaPrincipal.getText().concat("7"));
			}
		});
		btn7.setBounds(10, 151, 50, 38);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setText(telaPrincipal.getText().concat("8"));
			}
		});
		btn8.setBounds(70, 151, 50, 38);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setText(telaPrincipal.getText().concat("9"));
			}
		});
		btn9.setBounds(130, 149, 50, 38);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setText(telaPrincipal.getText().concat("0"));
			}
		});
		btn0.setBounds(70, 298, 50, 38);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculos.setN1(Float.parseFloat(telaPrincipal.getText()));
				telaPrincipal.setText("");
				calculos.setOperador("+");
				
			}
		});
		btnSoma.setBounds(190, 298, 50, 38);
		frmCalculadora.getContentPane().add(btnSoma);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculos.setN1(Float.parseFloat(telaPrincipal.getText()));
				telaPrincipal.setText("");
				calculos.setOperador("-");
			}
		});
		btnSubtracao.setBounds(190, 249, 50, 38);
		frmCalculadora.getContentPane().add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculos.setN1(Float.parseFloat(telaPrincipal.getText()));
				telaPrincipal.setText("");
				calculos.setOperador("*");
			}
		});
		btnMultiplicacao.setBounds(190, 200, 50, 38);
		frmCalculadora.getContentPane().add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculos.setN1(Float.parseFloat(telaPrincipal.getText()));
				telaPrincipal.setText("");
				calculos.setOperador("/");
			}
		});
		btnDivisao.setBounds(190, 151, 50, 38);
		frmCalculadora.getContentPane().add(btnDivisao);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculos.setN2(Integer.parseInt(telaPrincipal.getText()));
				
				switch (calculos.getOperador()) {
				case "+":
					telaPrincipal.setText(String.valueOf(calculos.somar(calculos.getN1(), calculos.getN2())));
					break;
				case "-":
					telaPrincipal.setText(String.valueOf(calculos.subtrair(calculos.getN1(), calculos.getN2())));
					break;
				case "*":
					telaPrincipal.setText(String.valueOf(calculos.multiplicar(calculos.getN1(), calculos.getN2())));
					break;
				case "/":
					telaPrincipal.setText(String.valueOf(calculos.dividir(calculos.getN1(), calculos.getN2())));
				default:
					break;
				}
			}
		});
		btnIgual.setBounds(130, 298, 50, 38);
		frmCalculadora.getContentPane().add(btnIgual);
		
		telaPrincipal = new JTextField();
		telaPrincipal.setEditable(false);
		telaPrincipal.setHorizontalAlignment(SwingConstants.RIGHT);
		telaPrincipal.setBounds(10, 22, 228, 62);
		frmCalculadora.getContentPane().add(telaPrincipal);
		telaPrincipal.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setText("");
				calculos.setN1(0);
				calculos.setN2(0);
			}
		});
		btnC.setBounds(190, 102, 50, 38);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnRaizQuadrada = new JButton("\u221A");
		btnRaizQuadrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculos.setN1(Float.parseFloat(telaPrincipal.getText()));
				telaPrincipal.setText(String.valueOf(calculos.raizQuadrada(calculos.getN1())));
			}
		});
		btnRaizQuadrada.setBounds(130, 102, 50, 38);
		frmCalculadora.getContentPane().add(btnRaizQuadrada);
		
		JButton btnPorcentagem = new JButton("%");
		btnPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPorcentagem.setBounds(70, 102, 50, 38);
		frmCalculadora.getContentPane().add(btnPorcentagem);
		
		JButton btnX = new JButton("x\u00B2");
		btnX.setBounds(10, 102, 50, 38);
		frmCalculadora.getContentPane().add(btnX);
		frmCalculadora.setBounds(100, 100, 266, 386);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
