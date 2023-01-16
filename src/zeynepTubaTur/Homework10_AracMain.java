package zeynepTubaTur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Homework10_AracMain {

	public static void main(String[] args) {

		Homework10_Arac urun1 = new Homework10_Arac();

		urun1.setAd_soyad("Ali Kurt");
		urun1.setArac_marka("Mercedes");
		urun1.setPlaka("BE 45 321");
		urun1.setAdres("Almanya");
		urun1.setArac_durumu("Calinti degil");

		Homework10_Arac urun2 = new Homework10_Arac();

		urun2.setAd_soyad("Ayse Bulent");
		urun2.setArac_marka("Audi");
		urun2.setPlaka("34 87 321");
		urun2.setAdres("Turkiye");
		urun2.setArac_durumu("Calinti degil");

		Homework10_Arac urun3 = new Homework10_Arac();

		urun3.setAd_soyad("Tuba Tur");
		urun3.setArac_marka("Toyota");
		urun3.setPlaka("05 15 321");
		urun3.setAdres("Isvicre");
		urun3.setArac_durumu("Calinti degil");

		Homework10_Arac urun4 = new Homework10_Arac();

		urun4.setAd_soyad("Mustafa Yurt");
		urun4.setArac_marka("Hyundai");
		urun4.setPlaka("07 15 321");
		urun4.setAdres("Hollanda");
		urun4.setArac_durumu("Calinti");

		Homework10_Arac urun5 = new Homework10_Arac();

		urun5.setAd_soyad("Merve Gul");
		urun5.setArac_marka("Ford");
		urun5.setPlaka("10 HGF 321");
		urun5.setAdres("Turkiye");
		urun5.setArac_durumu("Calinti");

		List<Homework10_Arac> tumAraclar = new ArrayList<>();

		tumAraclar.add(urun1);
		tumAraclar.add(urun2);
		tumAraclar.add(urun3);
		tumAraclar.add(urun4);
		tumAraclar.add(urun5);

		Scanner scan = new Scanner(System.in);

		System.out.println("Arac plakasini giriniz: ");

		String girilenPlaka = scan.nextLine();

		int calinti = 0;

		for (Homework10_Arac urun : tumAraclar) {

			if (urun.getArac_durumu().equals("Calinti") && urun.getPlaka().equals(girilenPlaka)) {

				System.out.println("Sorguladiginiz arac calintidir.");
				calinti++;
				break;
			}
		}

		if (calinti == 0) {
			System.out.println("Sorguladiginiz arac calinti degildir.");

		}
	}
}