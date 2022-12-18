package ramazanKombe;

import java.util.Scanner;

public class Odev2inciHafta {

	public Odev2inciHafta() {

	}

	public static void main(String[] args) {

		String isim = "Ramazan";
		String soyIsim = "Kömbe";
		String adres = "Leverner Str. 49, 32351 Stemwede Deutschland";

		System.out.println(isim + "\t" + soyIsim + "\n" + adres);

		System.out.println("Lütfen adinizi soyadinizi gininiz!");

		Scanner scan = new Scanner(System.in);
		String cevap = scan.nextLine();
		System.out.println("Lütfen adres bilgilerinizi gininiz!");
		String cevap1 = scan.nextLine();

		System.out.println("Lütfen Mile'e cevirmek istediginiz km degerini giriniz.");

		double kmDegeri = scan.nextDouble();
		double mileDegeri = kmDegeri * 1.6;
		System.out.println("Isleminizin sonucu " + mileDegeri + "'dir.");

		System.out.println("Lütfen Saniye'ye cevirmek istediginiz Saat degerini giriniz!");
		long saat = scan.nextLong();
		long saniye = saat * 60 * 60;
		System.out.println("Isleminizin sonucu " + saniye + "'dir.");

		System.out.println("Lütfen alanini ve cevresini hesaplamak istediginiz kare'nin kenar uzunlugunu giriniz.");
		int kenarUzunluk = scan.nextInt();
		int kareAlan = kenarUzunluk * kenarUzunluk;
		int kareCevre = 4 * kenarUzunluk;
		System.out.println("Kare'nin alani " + kareAlan + "'dir." + "\nKare'nin Cevresi " + kareCevre + "'dir.");

		System.out.println(
				"Hacmini hesaplamak istediginiz Dikdortgenler Prizmasinin sirasiyla kisa, uzun kenar ve yükseklik degerlerini giriniz.");
		int kisaKenar = scan.nextInt();
		int uzunKenar = scan.nextInt();
		int yükseklik = scan.nextInt();
		System.out.println("Dikdörtgenler Prizmsinin hacmi\t" + kisaKenar * uzunKenar * yükseklik + "'dir.");

		System.out.println("Lütfen adiniz ve soyadinizi giriniz.");

		Scanner scan1 = new Scanner(System.in);
		String ad = scan.next();
		String soyAd = scan.next();
		System.out.println(
				"Isminiz : " + ad + "\nSoyisminiz : " + soyAd + "\nKursumuza kaydiniz alinmistir,\ntesekkur ederiz.");

	}

}
