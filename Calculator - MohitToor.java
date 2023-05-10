//Created by Mohit Singh Toor
package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField tft;
	private JButton tf13;
	
	//Stores first and second numbers from user
	double first;
	double second;
	//Stores the result 
	double result;
	//Declares which operation needs to be done.
	String operation;
	//Stores final answer
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tft = new JTextField();
		tft.setFont(new Font("Tahoma", Font.BOLD, 18));
		tft.setBackground(SystemColor.info);
		tft.setBounds(28, 11, 176, 42);
		contentPane.add(tft);
		tft.setColumns(10);
		
		JButton tf1 = new JButton("1");
		tf1.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//These are same for all number buttons, and the dot button.
				//Text field from user
				String s = tft.getText();
				//Display the number in the text field
				tft.setText(s+"1");
			}
		});
		tf1.setBounds(28, 64, 52, 35);
		contentPane.add(tf1);
		
		JButton tf2 = new JButton("2");
		tf2.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tft.getText();
				tft.setText(s+"2");
			}
		});
		tf2.setBounds(90, 64, 52, 35);
		contentPane.add(tf2);
		
		JButton tf3 = new JButton("3");
		tf3.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tft.getText();
				tft.setText(s+"3");
			}
		});
		tf3.setBounds(152, 64, 52, 35);
		contentPane.add(tf3);
		
		JButton tf10 = new JButton(".");
		tf10.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tft.getText();
				tft.setText(s+".");
			}
		});
		tf10.setBounds(28, 202, 52, 35);
		contentPane.add(tf10);
		
		JButton tf12 = new JButton("+");
		tf12.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Takes first number from user and then leaves text field blank
				//Same for all operations but the operation symbol is changed
				first = Double.parseDouble(tft.getText());
				tft.setText("");
				operation = "+";
			}
		});
		tf12.setBounds(214, 64, 52, 35);
		contentPane.add(tf12);
		
		JButton tf11 = new JButton("=");
		tf11.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String answer;
				//Get second number
				second = Double.parseDouble(tft.getText());
				//If statement declares which operation is being used
				//Then does that operation to first and second number
				//And answer is stored in result
				if(operation == "+") {
					result = first + second;
					//Converting all results and assign to answer
					answer = String.valueOf(result);
					tft.setText(answer);
				}
				
				if(operation == "-") {
					result = first - second;
					answer = String.valueOf(result);
					tft.setText(answer);
				}
				
				if(operation == "*") {
					result = first * second;
					answer = String.valueOf(result);
					tft.setText(answer);
				}
				
				if(operation == "/") {
					result = first / second;
					answer = String.valueOf(result);
					tft.setText(answer);
				}
				
						
			}
		});
		tf11.setBounds(214, 17, 52, 35);
		contentPane.add(tf11);
		
		JButton tf4 = new JButton("4");
		tf4.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tft.getText();
				tft.setText(s+"4");
			}
		});
		tf4.setBounds(28, 110, 52, 35);
		contentPane.add(tf4);
		
		JButton tf7 = new JButton("7");
		tf7.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tft.getText();
				tft.setText(s+"7");
			}
		});
		tf7.setBounds(28, 156, 52, 35);
		contentPane.add(tf7);
		
		JButton tf5 = new JButton("5");
		tf5.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tft.getText();
				tft.setText(s+"5");
			}
		});
		tf5.setBounds(90, 110, 52, 35);
		contentPane.add(tf5);
		
		JButton tf8 = new JButton("8");
		tf8.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tft.getText();
				tft.setText(s+"8");
			}
		});
		tf8.setBounds(90, 156, 52, 35);
		contentPane.add(tf8);
		
		JButton tf6 = new JButton("6");
		tf6.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String s = tft.getText();
			  tft.setText(s+"6");
			}
		});
		tf6.setBounds(152, 110, 52, 35);
		contentPane.add(tf6);
		
		JButton tf9 = new JButton("9");
		tf9.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tft.getText();
				tft.setText(s+"9");
			}
		});
		tf9.setBounds(152, 156, 52, 35);
		contentPane.add(tf9);
		
		JButton tf0 = new JButton("0");
		tf0.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tft.getText();
				tft.setText(s+"0");
			}
		});
		tf0.setBounds(90, 202, 52, 35);
		contentPane.add(tf0);
		
		tf13 = new JButton("-");
		tf13.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(tft.getText());
				tft.setText("");
				operation = "-";
				
			}
		});
		tf13.setBounds(214, 110, 52, 35);
		contentPane.add(tf13);
		
		JButton tf14 = new JButton("*");
		tf14.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(tft.getText());
				tft.setText("");
				operation = "*";
				
			}
		});
		tf14.setBounds(214, 156, 52, 35);
		contentPane.add(tf14);
		
		JButton tf15 = new JButton("/");
		tf15.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(tft.getText());
				tft.setText("");
				operation = "/";
				
			}
		});
		tf15.setBounds(214, 202, 52, 35);
		contentPane.add(tf15);
		
		JButton tfclear = new JButton("C");
		tfclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Clear button sets text to blank(null)
				tft.setText(null);	
			}
		});
		tfclear.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfclear.setBounds(152, 202, 52, 35);
		contentPane.add(tfclear);
	}
}
