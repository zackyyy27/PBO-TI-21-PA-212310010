package com.praktikum;

import java.util.Scanner;

public class Latihan05 {

	public static void main(String[] args) {
		int bil;
		 Scanner input = new Scanner(System.in);
	       
		    System.out.println("##  Program Java Persegi Bintang ##");
		    System.out.println("===================================");
		    System.out.println();
		     
		   
		  
		    System.out.print("Input besar persegi: ");
		   bil = input.nextInt();
		    
		    System.out.println();
	
		for (int i= bil; i>=1; i--){
           for (int j=1; j<=i;
           		j++){
               System.out.print("*");
           }
           for (int l=1; l<=((bil-i)*2); l++){
               System.out.print(" ");
           }
           for (int k=1; k<=i; k++){
               System.out.print("*");
           }
           System.out.println();
       }

   for (int i=0; i<=bil; i++){
           for (int j=1; j<=i; j++){
               System.out.print("*");
           }
           for (int l=1; l<=((bil-i)*2); l++){
               System.out.print(" ");
           }
           for (int k=1; k<=i; k++){
               System.out.print("*");
           }
           System.out.println();
       }
	}
}