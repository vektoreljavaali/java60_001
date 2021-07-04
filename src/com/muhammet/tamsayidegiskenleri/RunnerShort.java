package com.muhammet.tamsayidegiskenleri;

public class RunnerShort {

	public static void main(String[] args) {
		// short -> 16 bit -> 2^16
		// 65.536 Adet deðer alýr
		short short_deger=128;
		short short_max = Short.MAX_VALUE;
		short short_min = Short.MIN_VALUE;
		System.out.println("Max...: "+short_max);
		System.out.println("Min...: "+short_min);
		short degisken_s;
		byte degisken_b= 45;
		degisken_s = degisken_b;
		System.out.println("sonuc....: "+ degisken_s);
				

	}

}
