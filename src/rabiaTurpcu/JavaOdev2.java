package rabiaTurpcu;

import java.util.Scanner;

public class JavaOdev2 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adinizi giriniz");
		String isim = scan.nextLine();
		
		System.out.println("Soyadinizi giriniz");
		String soyisim = scan.nextLine();
		
		System.out.println("Adres giriniz");
		String adres = scan.nextLine();
		
		System.out.println("Ad/Soyad= "+ isim + " " +soyisim + "\nAdres= " + adres);

		
		//Ikinci soru
		
		

		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Mile degeri giriniz");
		
		double mile = scan.nextDouble();
		
		double km = mile* 1.6;
		
		System.out.println("Girdiginiz mile degeri "+ km + " km dir");
		
		//ucuncu soru
		
Scanner scan3 = new Scanner(System.in);
		
		System.out.println("Saat giriniz");
		
		long saat = scan.nextLong();
		
		long saniye = saat*60*60;
		
		System.out.println("Girdiginiz saat "+ saniye + " saniye dir");
		
		//dorduncu soru
		
Scanner scan4 = new Scanner(System.in);
		
		System.out.println("Karenin bir kenar uzunlugunu giriniz");
		
		int kenar = scan.nextInt();
		
		int cevre = kenar *4;
		
		int alan = kenar* kenar;
		
		System.out.println("Bir kenar uzunlugunu girmis oldugunuz karenin cevresi= " + cevre + " cm dir");
		
		System.out.println("Bir kenar uzunlugunu girmis oldugunuz karenin alani= " + alan + "dir");
		
		
		//besinci soru
		
		System.out.println("Dikdortgenler prizmasinin uzun kenarini giriniz");
		
		short uzun = scan.nextShort();
		
		System.out.println("Dikdortgenler prizmasinin kisa kenarini giriniz");
		
		short kisa = scan.nextShort();
		
		System.out.println("Dikdortgenler prizmasinin yuksekligini giriniz");
		
		short yukseklik = scan.nextShort();
		
		int hacim = uzun * kisa * yukseklik ;
		
		System.out.println("Dikdorgenle prizmasinin hacmi " + uzun + kisa + yukseklik + "  mdir ");
		
		//altinci soru
		
		System.out.println("Adinizi giriniz");
		
		String ad = scan.nextLine();
		
		System.out.println("Soyadinizi giriniz");
		
		String soyad = scan.nextLine();
		
		System.out.println("Adiniz= "+ ad + "\nSoyadiniz= "+ soyad );
		
		System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz..");
}
}
