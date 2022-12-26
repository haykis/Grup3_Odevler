package ramazanKombe;

import java.util.Scanner;

public class Odev6Telefon {

	public static void main(String[] args) {



	Odev6Obje urun1 = new Odev6Obje("Samsung", "Galaxy", "Rosa", 512, 600, 78);

	System.out.println(urun1.marka + " " + urun1.model + " " + urun1.renk + " " + urun1.hafiza + " " + urun1.fiyat
			+ " " + urun1.stok);

	Odev6Obje urun2 = new Odev6Obje("Samsung", "Galaxy", "Gold", 128, 500, 100);

	System.out.println(urun2.marka + " " + urun2.model + " " + urun2.renk + " " + urun2.hafiza + " " + urun2.fiyat
			+ " " + urun2.stok);

		Odev6Obje urun3 = new Odev6Obje("Lenovo", "Legion", "Siyah", 256, 400, 200);

	System.out.println(urun3.marka + " " + urun3.model + " " + urun3.renk + " " + urun3.hafiza + " " + urun3.fiyat
			+ " " + urun3.stok);

	Odev6Obje urun4 = new Odev6Obje("Iphone", "13 Promax", "Rosa", 512, 900, 80);

	System.out.println(urun4.marka + " " + urun4.model + " " + urun4.renk + " " + urun4.hafiza + " " + urun4.fiyat
			+ " " + urun4.stok);
	Odev6Obje urun5 = new Odev6Obje("Huawei", "PLite", "Rosa", 128, 160, 56);

	System.out.println(urun5.marka + " " + urun5.model + " " + urun5.renk + " " + urun5.hafiza + " " + urun5.fiyat
				+ " " + urun5.stok);

		Odev6Obje urun = new Odev6Obje();

		urun.marka = "Samsung";
		urun.model = "Galaxy";
		urun.renk = "Rosa";
		urun.hafiza = 512;
		urun.fiyat = 600;
		urun.stok = 78;

		System.out.println(urun.marka + " " + urun.model + " " + urun.renk + " " + urun.hafiza + " " + urun.fiyat+ urun.stok);

		// Kullanicidan veri alma

		Scanner scan = new Scanner(System.in);

		Odev6Obje urun6 = new Odev6Obje();

		System.out.println("Urunun markasini giriniz: ");

		urun6.marka = scan.next();
		System.out.println("Urunun modelini giriniz: ");

		urun6.model = scan.next();

		System.out.println("Bir renk belirtiniz: ");
		urun6.renk = scan.next();

		System.out.println("Hafiza belirtiniz: ");
		urun6.hafiza = scan.nextInt();

		System.out.println("Fiyat giriniz: ");
		urun6.fiyat = scan.nextDouble();

		System.out.println("Stok durumunu belirtiniz: ");
		urun6.stok = scan.nextInt();

	}

}