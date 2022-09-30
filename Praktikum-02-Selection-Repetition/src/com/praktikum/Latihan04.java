package com.praktikum;

import java.util.Scanner;
public class Latihan04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System. in );
        System.out.println("Masukkan angka");
        int nilai = input.nextInt();
        System.out.println("Faktor-faktornya:");
        int tambah = 0;
        for (int z = 0; z <= nilai; z++) {
            tambah++;
            if (nilai % tambah == 0) {
                System.out.print(tambah + " ");
                                        
            }
        }

	}

}