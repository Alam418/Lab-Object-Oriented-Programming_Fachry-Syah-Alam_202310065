package com.ibik.app;

import javax.swing.JOptionPane;

public class Latihan1 {
	
	
	public static void main(String[]args) {
		String inputTextbox = JOptionPane.showInputDialog(null, "Enter your name"); //showinputdialog = memunculkan dialog dan meminta user untuk menginput 
		Latihan1 myApp = new Latihan1();
		
		while (inputTextbox.isEmpty()) {//.isEmpty = untuk mengecek apakah variabel yang dimasukan kosong atau tidak
			JOptionPane.showMessageDialog(null, "Error!! Field tidak boleh kosong"); //showMessageDialog = memunculkan message 
			inputTextbox = JOptionPane.showInputDialog(null,"Masukan Nama");
		}
			
			int inputButton = JOptionPane.showConfirmDialog(null,
					"Apa Kamu Suka Burger ?",	
					"Confirm",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE);// showConfirmDialog = memunculkan dialog dengan pilihan yes, no, cancel
			
			if (inputButton == JOptionPane.NO_OPTION) {
				int inputConfirm = JOptionPane.showConfirmDialog(null,
						"Apakah anda yakin tidak ingin membeli burger ?",	
						"Confirm",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE);
				
			}else if (inputButton == JOptionPane.YES_OPTION){
				
				String inputDialog1 = JOptionPane.showInputDialog(null, "Anda Mau Beli Berapa:");
				while (myApp.isNumber(inputDialog1) == false) {
					JOptionPane.showMessageDialog(null, "Field harus angka");
					inputDialog1 = JOptionPane.showInputDialog(null,"Masukan Jumlah Burger");
				}
				String inputDialog2 = "38000";
				int jumlah = Integer.parseInt(inputDialog1) * Integer.parseInt(inputDialog2);// Integer.parseInt = untuk convert string ke integer
				JOptionPane.showMessageDialog(null,inputTextbox+ " Pesan "+inputDialog1+". Total Harga : "+jumlah);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Sampai Jumpa Lagi "+inputTextbox);
				
			}
	}
	
	public boolean isNumber(String input) { //method untuk mengecek apakah variabel tersebut bernilai double 
		try {
			Double x = Double.parseDouble(input);// Double.parseDouble = untuk convert string ke double
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
