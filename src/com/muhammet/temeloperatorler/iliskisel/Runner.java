package com.muhammet.temeloperatorler.iliskisel;

public class Runner {

	public static void main(String[] args) {
		// �ki de�erin bir birine g�re durumunu irdeleyip
		// sonucunda true/false de�eri d�nen operat�rler
		// 1- E�itlik (==)
		int sayi1 = 123,sayi2=124;
		System.out.print("�ki Say� bir birine e�it midir? ");
		System.out.println(sayi1==sayi2);
		// 2- De�il (!)
		System.out.print("iki say� bir birine e�it de�ildir? ");
		System.out.println(sayi1!=sayi2);
		// 3- B�y�kt�r (>)
		System.out.print("sayi1 -> sayi2 den b�y�kt�r? ");
		System.out.println(sayi1>sayi2);
		// 4- K���kt�r (<)
		System.out.print("sayi1 -> sayi2 den k���kt�r? ");
		System.out.println(sayi1<sayi2);
		// 5- B�y�kE�ittir (>=) K���ke�ittir (<=)
		boolean durum = sayi2 <= sayi1;
		System.out.println("durum..: "+ durum);
		
		
	}//Method Sonu

}// class Sonu
