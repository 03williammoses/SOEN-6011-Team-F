package teamF.calc;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Calculator extends Applet implements ActionListener {
	TextField inp;

	public void init() {
		setBackground(Color.white);
		setLayout(null);
		setSize(400, 300);
		int i;
		inp = new TextField();
		inp.setBounds(0, 0, 250, 50);
		this.add(inp);
		Button button[] = new Button[10];
		int calcOrderFormat[] = { 7, 8, 9, 4, 5, 6, 1, 2, 3, 0 };
		for (i = 0; i < 9; i++) {
			button[i] = new Button(String.valueOf(calcOrderFormat[i]));
			button[i].setBounds(0 + ((i % 3) * 50), 50 + ((i / 3) * 50), 50, 50);
			this.add(button[i]);
			button[i].addActionListener(this);
		}

		Button dec = new Button(".");
		dec.setBounds(0, 200, 50, 50);
		this.add(dec);
		dec.addActionListener(this);

		Button zero = new Button(String.valueOf(0));
		zero.setBounds(50, 200, 50, 50);
		this.add(zero);
		zero.addActionListener(this);

		Button clr = new Button("C");
		clr.setBounds(100, 200, 50, 50);
		this.add(clr);
		clr.addActionListener(this);

		Button operator[] = new Button[5];
		operator[0] = new Button("tan(x)");
		operator[1] = new Button("sinh(x)");
		operator[2] = new Button("ab^x");
		operator[3] = new Button("x^y");
		operator[4] = new Button("=");

		for (i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				operator[i].setBounds(150, 50 + (i / 2 * 50), 50, 50);
				this.add(operator[i]);
				operator[i].addActionListener(this);
			} else {
				operator[i].setBounds(200, 50 + (i / 2 * 50), 50, 50);
				this.add(operator[i]);
				operator[i].addActionListener(this);
			}

		}
		operator[4].setBounds(150, 150, 100, 100);
		this.add(operator[4]);
		operator[4].addActionListener(this);
	}

	String op = "";
	String num1 = "";
	String num2 = "";
	String num3 = "";
	
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		char ch = button.charAt(0);
		if (ch >= '0' && ch <= '9' || ch == '.') {
			if (!op.equals(""))
				num2 = num2 + button;
			else
				num1 = num1 + button;
			inp.setText(inp.getText()+ch);
		} else if (ch == 'C') {
			num1 = op = num2 = "";
			inp.setText("");
		} else if(button.equals("tan(x)")){
			inp.setText("tan(x) : x = ");
		} else if(button.equals("sinh(x)")){
			inp.setText("sinh(x) : x = ");
		} else if(button.equals("ab^x")){
			inp.setText("ab^x : a = ");
		} else if(button.equals("x^y")){
			inp.setText("x^y : x = ");
		}  else if(button.equals("=")) {
			if(inp.getText().startsWith("ab^x")) {
				if(inp.getText().substring(7).contains("a")) {
					num1=inp.getText().substring(10);
					inp.setText("ab^x : b = ");
					JOptionPane.showMessageDialog(this, num1);
				} else if(inp.getText().substring(7).contains("b")) {
					num2=inp.getText().substring(10);
					inp.setText("ab^x : x = ");
					JOptionPane.showMessageDialog(this, num2);
				} else {
					num3=inp.getText().substring(11);
////					F5 f5 = new F5();
////					double a = Double.parseDouble(num1);
////					double b = Double.parseDouble(num2);
////					int x = Integer.parseInt(num3);
//					inp.setText(f5.calc_F5(a, b, x)+"");
				}
			} else if(inp.getText().startsWith("tan(x)")) {
				num1=inp.getText().substring(12);
				F2 f = new F2();
				String result = F2.getTanX(Double.parseDouble(num1));
				if(result.startsWith("Error")) {
					inp.setText("");
					JOptionPane.showMessageDialog(this, result.substring(7));
				}else {
					inp.setText(result);
				}
				
			} else if(inp.getText().startsWith("sinh(x)")) {
				num1=inp.getText().substring(13);
//				String output = Function call;
				inp.setText(num1);
			} else if(inp.getText().startsWith("x^y")) {
				if(inp.getText().substring(5).contains("x")) {
					num1=inp.getText().substring(9);
					inp.setText("x^y : y = ");
					JOptionPane.showMessageDialog(this, num1);
				} else {
					num2=inp.getText().substring(9);
//					String output = Function call;
					inp.setText(num2);
				}
			}
		}
//		JOptionPane.showMessageDialog(this, button);
	}
}