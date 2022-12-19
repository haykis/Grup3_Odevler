package ramazanKombe;

import java.util.Scanner;

public class Odev4uncuHafta {

	public static void main(String[] args) {
//
//    Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”  string 
//	   ifadesini “Java ogrenmek cok guzel.” sekline getirin
//
		String ifade = ("Java ogrenmek123 Cok guzel@");

		ifade = ifade.toLowerCase();
		ifade = ifade.replaceAll("[^a-zA-Z\\s]", "");
        ifade = (ifade.substring(0, 1).toUpperCase()) + (ifade.substring(1)); 
        System.out.println(ifade);
         
         
		// Soru 2) Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa
		// harfi iceriyor” - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi
		// iceriyor” - ikisi de yoksa
		// “Girdiginiz isim a veya Z harfi icermiyor” yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen isminizi yaziniz : ");
		String isim = scan.next();

		Boolean sonuc = (isim.contains("a"));
		Boolean sonuc1 = (isim.contains("z"));

		if (sonuc == true) {

			System.out.println("Isminizde a  harfi vardir.");
		} else if (sonuc1 == true) {
			System.out.println("Isminizde z harfi vardir.");
		} else if (sonuc1 == true && sonuc == true) {
			System.out.println("Isminizde a ve z harfi vardir.");

		} else {
			System.out.println("Isminizde a ve z  harfi yoktur.");
		}

		// Soru 3) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun
		// oldugunu
		// yazdirin.

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Lütfen adinizi giriniz.");
		String ad = scan1.next();
		System.out.println("Lütfen soyadinizi giriniz.");
		String soyAd = scan1.next();

		int a = (ad.length());
		int s = (soyAd.length());

		if (a > s) {
			System.out.println("Adiniz soy adinizdan daha uzundur.");

		} else if (a == s) {
			System.out.println("Adiniz ve soyadiniz esit uzunluktadir.");

		}

		else {
			System.out.println("Soyadnizdan adinizdan daha uzundur.");

		}
//	  Soru 4) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi 
//	  yazdirin.
//	  isim-soyisim : O*** K***** 
//	  kart no : **** **** **** 1234

		Scanner scan2 = new Scanner(System.in);

		System.out.print("Adinizi giriniz : ");
		String name = scan2.nextLine();

		System.out.print("Soy adinizi giriniz : ");
		String surName = scan2.nextLine();

		char adIlkHarf = name.toUpperCase().charAt(0);
		char soyAdIlkHarf = surName.toUpperCase().charAt(0);

		String maskeliAd = adIlkHarf + name.substring(1).replaceAll(".", "*");
		String maskeliSoyAd = soyAdIlkHarf + surName.substring(1).replaceAll(".", "*");

		System.out.print("Lütfen 16 haneli kredi karti numaranizi giriniz : ");
		String kartNo = scan2.nextLine();

		System.out.println("isim-soyisim : " + maskeliAd + maskeliSoyAd);

		String maskeliKartNo = "**** **** **** " + kartNo.substring(kartNo.length() - 4);

		System.out.println("kart no : " + maskeliKartNo);

		// soru 5: kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari
		// sagliyorsa
		// "sifre basari ile tanimlandi" eger saglamazsa "Islem basarisiz, Lutfen yeni
		// sifre giriniz" yazdirin.
		// - ilk harf buyuk olmali
		// -son harf kucuk harf olmali
		// -sifre bosluk icermemeli
		// -sifre uzunlugu en az 8 karakter olmali

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen parolanizi giriniz.");
		String parola = sc.nextLine();

		int parolaUzunluk = parola.length();

		if ((parolaUzunluk >= 8) && (Character.isUpperCase(parola.charAt(0)))
				&& (Character.isLowerCase(parola.charAt(parola.length() - 1))) 
				&& (!parola.contains(" "))) {
			System.out.println("Sifre basari ile tanimlandi.");
		} else {
			System.out.println("Islem basarisiz, Lutfen yeni sifre giriniz.");
		}
	}
}
