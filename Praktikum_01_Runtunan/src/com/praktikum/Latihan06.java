package com.praktikum;

import java.util.Scanner;

public class Latihan06 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		   System.out.println("======== MASUK DATA ANDA =======");
		   System.out.println("Nama Depan : ");
		   String namadepan = in.nextLine();
		   System.out.println("Nama Belakang : ");
		   String namabelakang = in.nextLine();
		   System.out.println("NPM : ");
		   String npm = in.nextLine();
		   System.out.println("Umur : ");
		   String umur = in.nextLine();
		   
	       System.out.println("======== OUTPUT DATA =======");
	       System.out.println("Depan =" + namadepan);
	       System.out.println("Belakang =" + namabelakang);
	       System.out.println("Npm =" + npm);
	       System.out.println("Umur =" + umur);
	 
	       String output = umur.concat(namadepan).concat(namabelakang).concat(npm);
	       System.out.println("output =" + output);


	}

}
