package com.muhammet.tamsayidegiskenleri;

import java.util.Scanner;

public class Runner_Input {

	public static void main(String[] args) {
		
		// Kullan�c�dan De�er Almak
		
		// Tarama yapma i�lemi
		// sistemi tara -> giri�leri
		Scanner sc = new Scanner(System.in);
		System.out.print("Say�1 ..: ");
		int sayi1 = sc.nextByte();
		System.out.print("sayi2...: ");
		int sayi2 = sc.nextShort();
		int toplam = sayi1  + sayi2;
		System.out.println("Toplam...: "+ toplam);

	}

}
