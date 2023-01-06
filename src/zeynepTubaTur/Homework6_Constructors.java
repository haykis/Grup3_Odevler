package zeynepTubaTur;

import java.util.Scanner;

public class Homework6_Constructors {

	// Soru 1
	// E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri
	// olduguna bakiniz.
	// Bir tane class olusturarak bu ozellikleri kullanan 15 tane urun
	// hazirlayiniz.
	// (5 tanesi kullanicidan veri alinarak , 5 tanesi parametreli
	// constructor kullanilarak, 5 tanesi bos constructor kullanilarak olmali)

	public static void main(String[] args) {

		// Bos Constructor kullanilarak urun hazirlanmasi

		Homework6_Product ayakkabi1 = new Homework6_Product();

		ayakkabi1.marka = "Camper";
		ayakkabi1.renk = "Siyah";
		ayakkabi1.numara = "43";
		ayakkabi1.malzeme = "%100 deri";
		ayakkabi1.kategori = "Erkek";
		ayakkabi1.fiyat = "89,95 EUR";
		ayakkabi1.sezon = "Kislik";
		ayakkabi1.satışaSunulduğuIlkTarih = "4 Ağustos 2022";
		ayakkabi1.urünModelNumarası = "K300444-003";

		System.out.println("1.urunun markasi:" + ayakkabi1.marka + "\n1.urunun rengi:" + ayakkabi1.renk
				+ "\n1.urunun numarasi:" + ayakkabi1.numara + "\n1.urunun malzemesi: " + ayakkabi1.malzeme
				+ "\n1.urunun kategorisi:" + ayakkabi1.kategori + "\n1.urunun fiyati: " + ayakkabi1.fiyat
				+ "\n1.urunun sezonu:" + ayakkabi1.sezon);

		Homework6_Product ayakkabi2 = new Homework6_Product();

		ayakkabi2.marka = "Adidas";
		ayakkabi2.renk = "Beyaz ve pembe";
		ayakkabi2.numara = "38 1/3";
		ayakkabi2.malzeme = "Sentetik saya,kauçuj taban";
		ayakkabi2.kategori = "Kadin";
		ayakkabi2.fiyat = "42,95 EUR";
		ayakkabi2.sezon = "Yazlik";
		ayakkabi2.satışaSunulduğuIlkTarih = "23 Haziran 2022";
		ayakkabi2.urünModelNumarası = "GB2421";

		// Parametreli Constructor kullanilarak urun hazirlanmasi

		Homework6_Product ayakkabi3 = new Homework6_Product("Disney", "Lila", "23", "plastik", "Kiz cocuk", "80 EUR",
				"Kislik", "14 Aralık 2021", "B09NM8FT");

		Homework6_Product ayakkabi4 = new Homework6_Product("Birkenstock", "Mercan seftali", "37", "EVA",
				"Unisex Yetişkin", "96,95 EUR", "Yazlik", "13 Temmuz 2018", "BK129443\n");

		// Kullanicidan veri alinarak urun hazirlanmasi

		Scanner scan = new Scanner(System.in);

		Homework6_Product ayakkabi5 = new Homework6_Product();

		System.out.print("Satin almak istediginiz ayakkabi markasini giriniz: ");

		ayakkabi5.marka = scan.nextLine();

		System.out.print("Satin almak istediginiz ayakkabi rengini giriniz: ");

		ayakkabi5.renk = scan.nextLine();

		System.out.print("Satin almak istediginiz ayakkabi numarasini giriniz: ");

		ayakkabi5.numara = scan.nextLine();

		System.out.print("Satin almak istediginiz ayakkabi malzemesini giriniz: ");

		ayakkabi5.malzeme = scan.nextLine();

		System.out.print("Satin almak istediginiz ayakkabi kategorisini(Kadin-Erkek-Cocuk) giriniz: ");

		ayakkabi5.kategori = scan.nextLine();

		System.out.print("Satin almak istediginiz ayakkabi fiyatini giriniz: ");

		ayakkabi5.fiyat = scan.nextLine();

		System.out.print("Satin almak istediginiz ayakkabi sezonunu(Kislik-Yazlik) giriniz: ");

		ayakkabi5.sezon = scan.nextLine();

	}
}