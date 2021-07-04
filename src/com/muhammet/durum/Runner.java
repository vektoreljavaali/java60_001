package com.muhammet.durum;

public class Runner {
	// Bir sýnýf içinde tanýmlanacak 
	// 1- Ýnner , Wrapper Class
	// 2- Method
	// 3- Global Deðiþken 
	int sayi;
	char karakter = 'A';
	
	public static void main(String[] args) {
		String durum = "Açýk"; // local deðiþken
		durum = "Kapalý";// 6 * 16bit = 96bit
		int durum_int = 0;
		durum_int = 1; // 32bit
		byte durum_byte= 0; // 8 bit
		boolean durum_boolean; // 1 bit 
		// true - false;
		durum_boolean = true; // 1 - açýk - aktif - evet
		durum_boolean = false;// 0 - kapalý - pasif - hayýr
		System.out.println("durum...: "+ durum_boolean);

	}// Main sonu
	
	private int topla() {// topla method u
		return 4;
	}

}//Class sonu
