package com.muhammet.temeloperatorler.mantik;

public class Runner {

	public static void main(String[] args) {
		// ve , veya 
		// && , ||
		int s1=23,s2=3,s3=-123;
		// s3 en k���k say� m�d�r? -> true-Evet
		// s3<s1 1.durum
		// s3<s2 2.durum
		// 1 ve 2. durum ayn� anda sa�lamal�
		System.out.print("s3 En k���k say� m�d�r? ");
		System.out.println(s3<s1 && s3<s2);
		// s2 en b�y�k say� de�ildir.
		System.out.println(s2<s1 || s2<s3);// Bug-> Mant�k hatas�
		// s2 ortadaki say� m�d�r?
		System.out.println(s2>s3 && s2<s1);
	}//Method Sonu

}// Class Sonu
