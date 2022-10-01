import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(34, 11, 163, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(234, 11, 169, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton Add = new JButton("Add");
		Add.setFont(new Font("Tahoma", Font.BOLD, 20));
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					ans=num1+num2;
					textField_2.setText(Integer.toString(ans));
					
				}catch(Exception c) {
					JOptionPane.showMessageDialog(null, "please enter the number");
					
				}
			}
		});
		Add.setBounds(51, 122, 130, 37);
		frame.getContentPane().add(Add);
		
		JButton minus = new JButton("minus");
		minus.setFont(new Font("Tahoma", Font.BOLD, 20));
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					ans=num1-num2;
					textField_2.setText(Integer.toString(ans));
					
				}catch(Exception c) {
					JOptionPane.showMessageDialog(null, "please enter the number");
					
				}
			}
		});
		minus.setBounds(248, 122, 108, 37);
		frame.getContentPane().add(minus);
		
		textField_2 = new JTextField();
		textField_2.setBounds(210, 199, 163, 37);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel answer = new JLabel("the answer");
		answer.setFont(new Font("Tahoma", Font.BOLD, 20));
		answer.setBounds(34, 199, 147, 37);
		frame.getContentPane().add(answer);
	}
}
