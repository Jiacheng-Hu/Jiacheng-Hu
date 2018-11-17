package calculator;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

enum Operator {
	ADD, SUBTRACT, MULTIPLY, DIVIDE
}

public class Calculator extends JFrame {
	private JTextField resultTextField;
	private JButton add, subtract, multiply, divide, compute, clear, decimal;

	private JButton numbers[];
	private Font font;

	String result = "";

	Operator o = Operator.ADD;

	class OperatorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == add) {
				o = Operator.ADD;
			}
			if (e.getSource() == subtract) {
				o = Operator.SUBTRACT;
			}
			if (e.getSource() == multiply) {
				o = Operator.MULTIPLY;
			}
			if (e.getSource() == divide) {
				o = Operator.DIVIDE;
			}
			result = resultTextField.getText();
			resultTextField.setText("");
		}

	}

	class ComputeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double res = 0;
			double num1 = Double.parseDouble(Calculator.this.result);
			double num2 = Double.parseDouble(resultTextField.getText());

			if (o == Operator.ADD) {
				res = num1 + num2;
			}
			if (o == Operator.SUBTRACT) {
				res = num1 - num2;
			}
			if (o == Operator.DIVIDE) {
				try {
					res = num1 / num2;
				} catch (Exception e1) {
					e1.printStackTrace();
					res = 0;
				}
			}
			if (o == Operator.MULTIPLY) {
				res = num1 * num2;
			}

			NumberFormat nf = NumberFormat.getInstance();
			nf.setGroupingUsed(false);
			resultTextField.setText(nf.format(res));

		}
	}

	class NumberListener implements ActionListener {

		private JButton button;

		public NumberListener(JButton button) {
			this.button = button;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			resultTextField.setText(resultTextField.getText() + button.getText());
		}
	}

	public Calculator() {
		super("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}

	private void addBehaviors() {
		ComputeListener cl = new ComputeListener();
		compute.addActionListener(cl);

		OperatorListener ol = new OperatorListener();
		add.addActionListener(ol);
		subtract.addActionListener(ol);
		multiply.addActionListener(ol);
		divide.addActionListener(ol);

		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				result = "";
				resultTextField.setText("");
			}
		});

		decimal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = resultTextField.getText();
				if (!text.contains("."))
					resultTextField.setText((text.equals("") ? "0" : text) + ".");
			}
		});
	}

	private void display() {
		setSize(350, 400);
		setVisible(true);
	}

	private void addComponents() {
		Container c = getContentPane();
		c.add(resultTextField);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(clear);
		panel.add(divide);
		c.add(panel);

		panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(numbers[7]);
		panel.add(numbers[8]);
		panel.add(numbers[9]);
		panel.add(multiply);
		c.add(panel);

		panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(numbers[4]);
		panel.add(numbers[5]);
		panel.add(numbers[6]);
		panel.add(subtract);
		c.add(panel);

		panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(numbers[1]);
		panel.add(numbers[2]);
		panel.add(numbers[3]);
		panel.add(add);
		c.add(panel);

		panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(numbers[0]);
		panel.add(decimal);
		panel.add(compute);
		c.add(panel);

	}

	private void setLayout() {
		GridLayout gl = new GridLayout(6, 1);
		Container c = this.getContentPane();
		c.setLayout(gl);
	}

	private void createComponents() {

		font = new Font("TimesRoman", Font.PLAIN, 36);
		resultTextField = new JTextField(10);
		resultTextField.setEditable(false);
		resultTextField.setFont(font);

		numbers = new JButton[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = new JButton(i + "");
			numbers[i].setFont(font);
			numbers[i].addActionListener(new NumberListener(numbers[i]));
		}

		add = new JButton("+");
		add.setFont(font);
		subtract = new JButton("-");
		subtract.setFont(font);
		multiply = new JButton("x");
		multiply.setFont(font);
		divide = new JButton("/");
		divide.setFont(font);
		compute = new JButton("=");
		compute.setFont(font);
		clear = new JButton("AC");
		clear.setFont(font);
		decimal = new JButton(".");
		decimal.setFont(font);

	}
	
	public static void main(String[] args) throws IOException{
		Calculator calculator = new Calculator();
	}
}
