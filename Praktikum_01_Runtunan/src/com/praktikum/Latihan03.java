package com.praktikum;

public class Latihan03 {

	public static void main(String[] args) {
		int a,b,c,t,d1,d2,la;
		a = 6;
		b = 5;
		c = 8;
		d1 = 7;
		d2 = 9;
		t  = 9;
		la = 8;
				
		
		double luas = (0.5*d1*d2);
		int keliling = 2*(a+b);
		
		System.out.println("MENGHITUNG LAYANG - LAYANG");
		System.out.println("Luas layang - layang adalah " +luas);
		System.out.println("Keliling layang layang adalah "+ keliling);
		
		int luasprs = t*(a*b*c)+2*la;
		double volumeprs = (0.5*a*t)*t;
		
		System.out.println("MENGHITUNG PRISMA SEGITIGA");
		System.out.println("luas prisma segitiga adalah = "+luasprs);
		System.out.println("Volume prisma segitiga adalah = "+volumeprs);
	}

}
