package com.muhammet.temeloperatorler.iliskisel;

public class Runner {

	public static void main(String[] args) {
		// Ýki deðerin bir birine göre durumunu irdeleyip
		// sonucunda true/false deðeri dönen operatörler
		// 1- Eþitlik (==)
		int sayi1 = 123,sayi2=124;
		System.out.print("Ýki Sayý bir birine eþit midir? ");
		System.out.println(sayi1==sayi2);
		// 2- Deðil (!)
		System.out.print("iki sayý bir birine eþit deðildir? ");
		System.out.println(sayi1!=sayi2);
		// 3- Büyüktür (>)
		System.out.print("sayi1 -> sayi2 den büyüktür? ");
		System.out.println(sayi1>sayi2);
		// 4- Küçüktür (<)
		System.out.print("sayi1 -> sayi2 den küçüktür? ");
		System.out.println(sayi1<sayi2);
		// 5- BüyükEþittir (>=) Küçükeþittir (<=)
		boolean durum = sayi2 <= sayi1;
		System.out.println("durum..: "+ durum);
		
		
	}//Method Sonu

}// class Sonu
