package com.muhammet.durum;

public class Runner {
	// Bir s�n�f i�inde tan�mlanacak 
	// 1- �nner , Wrapper Class
	// 2- Method
	// 3- Global De�i�ken 
	int sayi;
	char karakter = 'A';
	
	public static void main(String[] args) {
		String durum = "A��k"; // local de�i�ken
		durum = "Kapal�";// 6 * 16bit = 96bit
		int durum_int = 0;
		durum_int = 1; // 32bit
		byte durum_byte= 0; // 8 bit
		boolean durum_boolean; // 1 bit 
		// true - false;
		durum_boolean = true; // 1 - a��k - aktif - evet
		durum_boolean = false;// 0 - kapal� - pasif - hay�r
		System.out.println("durum...: "+ durum_boolean);

	}// Main sonu
	
	private int topla() {// topla method u
		return 4;
	}

}//Class sonu
