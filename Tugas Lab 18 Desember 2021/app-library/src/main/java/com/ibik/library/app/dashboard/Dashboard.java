package com.ibik.library.app.dashboard;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.ComponentOrientation;


public class Dashboard extends JFrame{

	public JFrame frameMain;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Dashboard() {
		initialize();
	}

	private void initialize() {
		setTitle("Dashboard Page");
		setResizable(false);
		setBounds(100, 100, 500, 640); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Wellcome to this application");
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(60, 27, 364, 29);
		getContentPane().add(labelTitle);		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Your Profile", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 90, 464, 458);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelUsername = new JLabel("NIK");
		labelUsername.setBounds(23, 34, 70, 14);
		panel.add(labelUsername);
		
		JTextField user = new JTextField();
		user.setBounds(23, 62, 195, 20);
		panel.add(user);
		user.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(228, 62, 215, 20);
		panel.add(textField);
		
		JLabel labelUsername_1 = new JLabel("Fullname");
		labelUsername_1.setBounds(228, 34, 70, 14);
		panel.add(labelUsername_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(23, 156, 131, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(164, 156, 131, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(316, 156, 114, 20);
		panel.add(textField_3);
		
		JLabel labelUsername_2 = new JLabel("Placebirth");
		labelUsername_2.setBounds(23, 125, 70, 14);
		panel.add(labelUsername_2);
		
		JLabel labelUsername_3 = new JLabel("Birthdate");
		labelUsername_3.setBounds(167, 125, 70, 14);
		panel.add(labelUsername_3);
		
		JLabel labelUsername_4 = new JLabel("Gender");
		labelUsername_4.setBounds(316, 125, 70, 14);
		panel.add(labelUsername_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(23, 237, 408, 108);
		textField_4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		panel.add(textField_4);
		
		JLabel labelUsername_2_1 = new JLabel("Address");
		labelUsername_2_1.setBounds(23, 212, 70, 14);
		panel.add(labelUsername_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(23, 409, 195, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(228, 409, 215, 20);
		panel.add(textField_6);
		
		JLabel labelUsername_2_1_1 = new JLabel("Email");
		labelUsername_2_1_1.setBounds(23, 384, 70, 14);
		panel.add(labelUsername_2_1_1);
		
		JLabel labelUsername_2_1_2 = new JLabel("Password");
		labelUsername_2_1_2.setBounds(228, 384, 70, 14);
		panel.add(labelUsername_2_1_2);
		
	}
}
