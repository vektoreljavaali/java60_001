package com.muhammet.tamsayidegiskenleri;

public class RunnerByte {

	public static void main(String[] args) {
		// Byte De�i�keni
		// 1 byte -> 8 bit -> 256 adet de�er alabilir.
		// Max..: 
		// Min..: 
		byte byte_deger = 0;
		System.out.println("de�er...: "+ byte_deger);
		byte_deger = 127;
		byte_deger = -128;
		// -128+ 0 + 127 = 256 adet say�
		System.out.println("de�er...: "+ byte_deger);
		// cast
		byte_deger = (byte) 2560;
		System.out.println("de�er...: "+ byte_deger);
		
	}

}
