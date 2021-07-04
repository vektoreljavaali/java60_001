package com.muhammet.temeloperatorler.atama;

public class Runner {

	public static void main(String[] args) {
		// Atama (=)
		int sayi1=4, sayi2=54;
		sayi1 = sayi2;
		System.out.println("sayi1...: "+ sayi1);
		// Arttýrarak Atama (+=)
		sayi1 += sayi2;
		System.out.println("sayi1...: "+ sayi1);
		//   5      5    + 5  = 10
		// sayi1 = sayi1 + 5 ; 
		// sayi1 += 5;
		// (-=) (*=) (/=) (%=)
		int moood = 21;
		moood %= 4;
		System.out.println("mood...: "+ moood);

	}

}
