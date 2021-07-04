package com.muhammet.temeloperatorler.mantik;

public class Runner {

	public static void main(String[] args) {
		// ve , veya 
		// && , ||
		int s1=23,s2=3,s3=-123;
		// s3 en küçük sayı mıdır? -> true-Evet
		// s3<s1 1.durum
		// s3<s2 2.durum
		// 1 ve 2. durum aynı anda sağlamalı
		System.out.print("s3 En küçük sayı mıdır? ");
		System.out.println(s3<s1 && s3<s2);
		// s2 en büyük sayı değildir.
		System.out.println(s2<s1 || s2<s3);// Bug-> Mantık hatası
		// s2 ortadaki sayı mıdır?
		System.out.println(s2>s3 && s2<s1);
	}//Method Sonu

}// Class Sonu
