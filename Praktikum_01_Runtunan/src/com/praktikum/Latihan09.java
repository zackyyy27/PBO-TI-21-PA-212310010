package com.praktikum;

import java.util.Scanner;

public class Latihan09 {
	public static void main(String[] args) {
		
		input();
		
	}
	static void input() {
		Scanner input = new Scanner(System.in);
		Students myBio = new Students();
		System.out.print("Masukan Nama = ");
		String textnama = input.nextLine();
		String FullName = myBio.GetFullName(textnama);
		System.out.print("Masukan NPM = ");
		int textnpm = input.nextInt();
		int NPM = myBio.GetNPM(textnpm);
		output(NPM, FullName);
		
		input.close();
	}
	static void output(int NPM, String FullName) {
		System.out.println("=====OUTPUT=====");
		Students myBio = new Students();
		System.out.println("NPM Mahasiswa = " +NPM);
		System.out.println("Nama Mahasiswa = " +FullName);
		String ClassName = myBio.GetClassName("TI-21-PA");
		System.out.println("Kelas Mahasiswa = " +ClassName);
		int Semester = myBio.GetSemester(3);
		System.out.println("Semester = " +Semester);
		double GPA = myBio.GetGPA(4.0);
		System.out.println("IPK = " +GPA);
	}
}