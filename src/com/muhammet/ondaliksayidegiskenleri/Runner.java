package com.muhammet.ondaliksayidegiskenleri;

public class Runner {

	public static void main(String[] args) {
		// Ondalýk sayý Deðiþkenleri
		// 1. float -> 32Bit
		float ondalik_float_degiskeni;
		int s1,s2,s3,s4;
		ondalik_float_degiskeni = 1;
		ondalik_float_degiskeni = -12;
		ondalik_float_degiskeni = 5.5f;
		float fmax,fmin;
		fmax = Float.MAX_VALUE;
		fmin = Float.MIN_VALUE;
		System.out.println("Float Max..: "+ fmax);
		System.out.println("Float Min..: "+ fmin);
		// 2. double -> 64 Bit
		double dmax,dmin;
		dmax = 3242343;
		System.out.println("dmax..: "+dmax);
		dmax = 54734859743543798L;
		System.out.println("dmax..: "+dmax);
		dmax = 45435435734897534.5347534753475;
		System.out.println("dmax..: "+dmax);
		dmin = Double.MIN_VALUE;
		System.out.println("Double Min..: "+ dmin);
		

	}// Main Sonu

}// Class Sonu
