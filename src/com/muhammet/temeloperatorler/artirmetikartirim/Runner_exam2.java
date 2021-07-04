package com.muhammet.temeloperatorler.artirmetikartirim;

public class Runner_exam2 {

	public static void main(String[] args) {
		int toplam,sayi1=2,sayi2=4;
				//	2    +   5     +   3     -    4   = 6    
		toplam = sayi1++ + ++sayi2 + sayi1++ - --sayi2;
		System.out.println("Toplam....: "+ toplam);
		// 6, 5, 8, 
	}//Method sonu

}// Class Sonu
