package com.muhammet.tamsayidegiskenleri;

import java.util.Scanner;

public class Runner_Input {

	public static void main(String[] args) {
		
		// Kullanýcýdan Deðer Almak
		
		// Tarama yapma iþlemi
		// sistemi tara -> giriþleri
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayý1 ..: ");
		int sayi1 = sc.nextByte();
		System.out.print("sayi2...: ");
		int sayi2 = sc.nextShort();
		int toplam = sayi1  + sayi2;
		System.out.println("Toplam...: "+ toplam);

	}

}
