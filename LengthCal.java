import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.DropMode;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;


public class LengthCal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LengthCal frame = new LengthCal();
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
	public LengthCal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Energy Calculator By Papri Rani Das");
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setForeground(Color.BLACK);
		setBackground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Desktop\\New folder (2)\\download.png"));
		setBounds(550, 120, 374, 545);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cb = new JComboBox();
		cb.setForeground(Color.BLACK);
		cb.setBackground(Color.GRAY);
		cb.setMaximumRowCount(16);
		cb.setFont(new Font("Tahoma", Font.BOLD, 18));
		cb.setModel(new DefaultComboBoxModel(new String[] {"Meters", "Kilometers", "Centi-meters", "Inches"}));
		cb.setBounds(4, 64, 207, 32);
		contentPane.add(cb);
		
		JComboBox cb1 = new JComboBox();
		cb1.setMaximumRowCount(16);
		cb1.setBackground(Color.GRAY);
		cb1.setForeground(Color.BLACK);
		cb1.setFont(new Font("Tahoma", Font.BOLD, 18));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Meters", "Kilometers", "Centi-meters", "Inches"}));
		cb1.setBounds(4, 168, 207, 32);
		contentPane.add(cb1);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Backspace=str.toString();
					textField.setText(Backspace);
				}
				
			}
		});
		btnBackspace.setBackground(Color.RED);
		btnBackspace.setForeground(Color.BLACK);
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 22));
		btnBackspace.setBounds(120, 216, 114, 60);
		contentPane.add(btnBackspace);
		
		JButton button = new JButton("9");
		button.setBackground(Color.BLUE);
		button.setForeground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button.getText();
				textField.setText(number);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(235, 278, 114, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("6");
		button_1.setBackground(Color.BLUE);
		button_1.setForeground(Color.BLACK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_1.getText();
				textField.setText(number);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(235, 330, 114, 50);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBackground(Color.BLUE);
		button_2.setForeground(Color.BLACK);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_2.getText();
				textField.setText(number);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(235, 382, 114, 50);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton(".");
		button_3.setBackground(Color.BLUE);
		button_3.setForeground(Color.BLUE);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_3.getText();
				textField.setText(number);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 28));
		button_3.setBounds(4, 434, 114, 50);
		contentPane.add(button_3);
		
		JButton btnClear = new JButton("CE");
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		btnClear.setBounds(4, 216, 114, 60);
		contentPane.add(btnClear);
		
		JButton button_6 = new JButton("7");
		button_6.setBackground(Color.BLUE);
		button_6.setForeground(Color.BLACK);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_6.getText();
				textField.setText(number);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.setBounds(4, 278, 114, 50);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBackground(Color.BLUE);
		button_7.setForeground(Color.BLACK);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_7.getText();
				textField.setText(number);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.setBounds(120, 278, 114, 50);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("4");
		button_8.setSelectedIcon(null);
		button_8.setBackground(Color.BLUE);
		button_8.setForeground(Color.BLACK);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_8.getText();
				textField.setText(number);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_8.setBounds(4, 330, 114, 50);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.setBackground(Color.BLUE);
		button_9.setForeground(Color.BLACK);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_9.getText();
				textField.setText(number);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.setBounds(120, 330, 114, 50);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.setForeground(Color.BLACK);
		button_10.setBackground(Color.BLUE);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+button_10.getText();
				textField.setText(number);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_10.setBounds(4, 382, 114, 50);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("2");
		button_11.setBackground(Color.BLUE);
		button_11.setForeground(Color.BLACK);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+button_11.getText();
				textField.setText(number);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.setBounds(120, 382, 114, 50);
		contentPane.add(button_11);
		
		JButton button_13 = new JButton("0");
		button_13.setBackground(Color.BLUE);
		button_13.setForeground(Color.BLACK);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_13.getText();
				textField.setText(number);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_13.setBounds(120, 434, 114, 50);
		contentPane.add(button_13);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setForeground(Color.BLACK);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(4, 4, 345, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setForeground(Color.BLACK);
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setBounds(4, 108, 345, 50);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Convert");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double result;
				double input = Double.parseDouble(textField.getText());
				
				if(cb.getSelectedItem().toString()=="Meters" && cb1.getSelectedItem().toString()=="Meters")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Meters" && cb1.getSelectedItem().toString()=="Kilometers")
				{
					result= input/1000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Meters" && cb1.getSelectedItem().toString()=="Centi-meters")
				{
					result= input*100;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Meters" && cb1.getSelectedItem().toString()=="Inches")
				{
					result= input* 39.37;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilometers" && cb1.getSelectedItem().toString()=="Meters")
				{
					result= input*1000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilometers" && cb1.getSelectedItem().toString()=="Kilometers")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilometers" && cb1.getSelectedItem().toString()=="Centi-meters")
				{
					result= input*100000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilometers" && cb1.getSelectedItem().toString()=="Inches")
				{
					result= input* 39370.1;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Centi-meters" && cb1.getSelectedItem().toString()=="Kilometers")
				{
					result= input/100000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Centi-meters" && cb1.getSelectedItem().toString()=="Meters")
				{
					result= input/100;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Centi-meters" && cb1.getSelectedItem().toString()=="Centi-meters")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Centi-meters" && cb1.getSelectedItem().toString()=="Inches")
				{
					result= input/2.54;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Inches" && cb1.getSelectedItem().toString()=="Kilometers")
				{
					result= input/39370.1;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Inches" && cb1.getSelectedItem().toString()=="Meters")
				{
					result= input/39.37;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Inches" && cb1.getSelectedItem().toString()=="Centi-meters")
				{
					result= input*2.54;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Inches" && cb1.getSelectedItem().toString()=="Inches")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				
			}
		});
		btnNewButton_1.setBounds(235, 217, 114, 60);
		contentPane.add(btnNewButton_1);
		
		JButton button_4 = new JButton("00");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String number = textField.getText()+button_4.getText();
					textField.setText(number);
			}
		});
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBackground(Color.BLUE);
		button_4.setBounds(235, 434, 114, 50);
		contentPane.add(button_4);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{cb, cb1, btnBackspace, button, button_1, button_2, button_3, btnClear, button_6, button_7, button_8, button_9, button_10, button_11, button_13, textField, textField_1, btnNewButton_1}));
	}
}
