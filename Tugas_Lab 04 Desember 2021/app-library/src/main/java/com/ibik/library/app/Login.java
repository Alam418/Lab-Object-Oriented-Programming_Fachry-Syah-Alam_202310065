package com.ibik.library.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class Login extends JFrame{
	
	private JFrame mainFrame;
	private JFrame currentFrame;
	private JTextField user;
	private JPasswordField pass;
	
	public static void main(String[] args) {

		Login mainFrame = new Login();
		mainFrame.setTitle("Login"); //set title pada window
		mainFrame.setBounds(530,300,270,200); //set ukuran window dengan format (x, y, width, height) 
		mainFrame.getContentPane().setLayout(null); 
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ketika menutup window, program akan berakhir
		mainFrame.setResizable(false); //windows tidak bisa di minimize ataupun maximize
		
		JLabel username = new JLabel();
		username.setText("Username");
		username.setBounds(10,30,100,20);
		mainFrame.getContentPane().add(username);
		
		JLabel password = new JLabel();
		password.setText("Password");
		password.setBounds(10,60,100,20);
		mainFrame.getContentPane().add(password);
		
		JTextField user = new JTextField();
		user.setBounds(100,30,100,20);
		user.setDocument(new textLimit(10));// set untuk membatasi panjang input
		mainFrame.add(user);
		
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(100,60,100,20);
		mainFrame.add(pass);
		
		JButton buttonLogin = new JButton();
		buttonLogin.setText("login");
		buttonLogin.setBounds(140,100,90,20);
		mainFrame.getContentPane().add(buttonLogin);
		mainFrame.getContentPane().add(buttonLogin);
		
		user.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) { //keyTyped = function ini akan terpanggil setiap ketikan keyboard
	             char user = e.getKeyChar();
	             if ( ((user < '0') || (user > '9')) && (user != KeyEvent.VK_BACK_SPACE)) { //jika menginput selain angka maka field tidak akan terisi 
	            	 JOptionPane.showMessageDialog(null, "Harap masukan angka");
	            	 e.consume();
	             }
	         }
	      });
		
		pass.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char pass = e.getKeyChar();
	             if ( ((pass < '0') || (pass > '9')) && (pass != KeyEvent.VK_BACK_SPACE)) {
	            	 JOptionPane.showMessageDialog(null, "Harap masukan angka");
	            	 e.consume();
	             }
	         }
	      });
		
		//action click pada button
		buttonLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String inUser = user.getText();
				String inPass = String.valueOf(pass.getPassword());			
				System.out.println("username:"+inUser);
				System.out.println("password:"+inPass);
				
				// == /.equals/.equalsIgnoreCase
				if (inUser.equalsIgnoreCase("202310065") && inPass.equalsIgnoreCase("28082002")) {
					
					JOptionPane.showMessageDialog(null, "Selamat datang di perpustakaan IBIK");//showMessageDialog = memunculkan message
					
				} else if (user.getText().trim().isEmpty() && String.valueOf(pass.getPassword()).trim().isEmpty()){
					
					JOptionPane.showMessageDialog(null, "Mohon masukan username dan password anda");
			
				} else {
					
					JOptionPane.showMessageDialog(null, "Data yang anda masukan salah");
					
				}
				
			}
		});
		//end event click
		
		
		
		JButton buttonCancel = new JButton();
		buttonCancel.setText("Cancel");
		buttonCancel.setBounds(20,100,100,20);
		mainFrame.getContentPane().add(buttonCancel);
		
		mainFrame.setVisible(true);
	
	}
	
}

class textLimit extends PlainDocument {
	  private int limit;
	  textLimit(int limit) {
		  super();//memanggil constructor dari parent class agar bisa mengakses properti dan method dari parent class.
		  this.limit = limit;
	  }

	  textLimit(int limit, boolean upper) {
		  super();
		  this.limit = limit;
	  }

	  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
		  if (str == null)
			  return;
		  
		  if ((getLength() + str.length()) <= limit) {//mereturn panjang dari suatu objek kemudian mencek jika panjangnya kurang atau sama dengan 10
			  super.insertString(offset, str, attr);
	    }else {
	    	JOptionPane.showMessageDialog(null, "Maximum inputan 10 digit");
	    }
	  }
	}
