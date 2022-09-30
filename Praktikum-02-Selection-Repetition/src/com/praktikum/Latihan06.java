package com.praktikum;

import javax.swing.*;

public class Latihan06 {

	public static void main(String[] args) {	
		String pilih;
		pilih = JOptionPane.showInputDialog("Pilih Menu Sarapan \n1. Nasi Goreng \n2. Bubur Ayam \n3. Soto Ayam");
		JOptionPane.showMessageDialog(null, "Anda Memilih :  " + pilih );
		
		int jawab = JOptionPane.showConfirmDialog(null, "Apakah Pesanan Sudah Benar?");
		switch(jawab) {
		case JOptionPane.YES_OPTION:
			 JOptionPane.showMessageDialog(null, "Lanjutkan");
			 break;
		case JOptionPane.NO_OPTION:
			 JOptionPane.showMessageDialog(null, "Ganti Menu Kembali?");
			 break;
		case JOptionPane.CANCEL_OPTION:
			 JOptionPane.showMessageDialog(null, "Batalkan Menu");
		}
		
		int input = JOptionPane.showOptionDialog(null,
					"Ingin Memesan Kembali?",
					"Keluar",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, null, null);
		
		if(jawab == JOptionPane.YES_NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Program Akan Berakhir");
			System.exit(0);
		}
		
		}

	}