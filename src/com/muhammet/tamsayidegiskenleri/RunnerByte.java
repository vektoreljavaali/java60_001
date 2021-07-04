package com.muhammet.tamsayidegiskenleri;

public class RunnerByte {

	public static void main(String[] args) {
		// Byte Değişkeni
		// 1 byte -> 8 bit -> 256 adet değer alabilir.
		// Max..: 
		// Min..: 
		byte byte_deger = 0;
		System.out.println("değer...: "+ byte_deger);
		byte_deger = 127;
		byte_deger = -128;
		// -128+ 0 + 127 = 256 adet sayı
		System.out.println("değer...: "+ byte_deger);
		// cast
		byte_deger = (byte) 2560;
		System.out.println("değer...: "+ byte_deger);
		
	}

}
