package com.blz.PowerOf2;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println("Welcome to PowerOf2 Program!!");
		int N;
		int p;
		int power = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		 N = scan.nextInt();
	    System.out.println("Enter the Power:");
	     p = scan.nextInt();
		for(int i=1; i<=p; i++) {

			power =N*power;
		}
			System.out.println("Power Table of 2 is:"+power);
		
	

}
}