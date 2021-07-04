package com.muhammet.tamsayidegiskenleri;

public class RunnerInteger {

	public static void main(String[] args) {

		// int -> 32 bit 
		// int -> (Referans Type -> Integer)
		// Java dilinin default tam sayý deðiþken deðeridir.
		int sayi = 1;
		int sayi_Min = Integer.MIN_VALUE;
		int sayi_Max = Integer.MAX_VALUE;
		System.out.println("Max....: "+ sayi_Max);
		System.out.println("Max....: "+ sayi_Min);
		System.out.println("sayý...: "+ (2147483647L*2));
		System.out.println("Tarih..: 01/01/2022 15:10"+(100*60*60*24*365));
	}

}
