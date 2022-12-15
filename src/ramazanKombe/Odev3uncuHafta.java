package ramazanKombe;

import java.util.Scanner;

public class Odev3uncuHafta {

	public static void main(String[] args) {

//          1-Kullanıcıdan uc tane tam sayı alalım ve maksimum sayıyı bulan 
//			java kodunu yazalım. Not: if else kullanalım..

		Scanner scan = new Scanner(System.in);

		System.out.println("Uc adet sayi giriniz!");

		int sayi1, sayi2, sayi3;

		sayi1 = scan.nextInt();
		sayi2 = scan.nextInt();
		sayi3 = scan.nextInt();

		if (sayi1 >= sayi2 && sayi1 >= sayi3) {

			System.out.println("Girdiginiz en buyuk sayi " + sayi1);
		} else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
			System.out.println("Girdiginiz en buyuk sayi " + sayi2);
		}

		else {
			System.out.println("Girdiginiz en buyuk sayi " + sayi3);
		}

//      2. Kullanıcıdan bir gün girmesini isteyelim.
//      a. Eger girilen gun hafta sonu ise tekrar kontrol edelim
//		Cumartesi ise Cumartesi ve hafta sonu, Pazar ise Pazar ve 
//		hafta sonu yazdıralım.
//		b. Degil ise gün hafta ici yazdıralım.
//		1. Note: equals ile karsilastiralim 
//		2. Nested ternary kullanalım...

		Scanner gunler = new Scanner(System.in);
		System.out.println("Lütfen bir gun yaziniz.");
		String gunAdi = gunler.nextLine();

		String str = gunAdi.equals("cumartesi") || gunAdi.equals("pazar")
				? (gunAdi.equals("cumartesi") ? "günlerden cumartesi ve haftasonu" : "günlerden pazar ve haftasonu")
				: "haftaiçi bir gun yazdiniz";
		System.out.println(str);

//		3-Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
//		baslayan gun isimlerini yazdirin.                     
//		Ornek ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
//	   ilkHarf=S output = “Sali”  (switch case default ile yapalim

		System.out.println("Günlerden birinin ilk harfini giriniz");

		String gunHarf = gunler.nextLine();

		char h = gunHarf.charAt(0);

		switch (h) {
		case 'p':
			System.out.println("Pazartesi,Persembe veya Pazar");
			break;
		case 's':
			System.out.println("Sali");
			break;
		case 'c':
			System.out.println("Carsamba,Cuma ya da Cumartesi");
			break;
		default:
			System.out.println("Yanlis harf girdiniz.");

//		}
//		4-Kullanicidan bir gun alin eger gun “Cuma” ise ekrana 
//		“Muslumanlar icin kutsal
//		gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun”
//		yazdirin. “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” 
//		yazdirin. (switch case default ile yapalim

			Scanner kutsalGunler = new Scanner(System.in);
			System.out.println("Bir gun adi giriniz.");
			String gun = kutsalGunler.nextLine();

			switch (gun) {
			case "cuma":
				System.out.println("Cuma muslumanlar icin kutsal gundur.");
				break;
			case "cumartesi":
				System.out.println("Cumartesi yahudiler icin kutsal gundur.");
				break;
			case "pazar":
				System.out.println("Pazar hiristiyanlar icin kutsal gundur.");
				break;
			default:
				System.out.println("Hafta ici bir gundur,kutsal gun degildir.");

			}

//		5-Kullanicidan bir karakter girmesini isteyin ve girilen karakterin 
//		harf olup olmadigini yazdirin. (D, d, 3, ~, @, !, ...) (ip ucu: ascii 
//		tablosu)

			Scanner karakter = new Scanner(System.in);
			System.out.println("Lütfen bir karakter giriniz.");

			char k = karakter.next().charAt(0);

			String str2 = karakter.nextLine();

			if ((65 <= k && k <= 90) || (97 <= k && k <= 122))
				System.out.println(k + " bir harftir.");
			else
				System.out.println(k + " bir harf değildir");
			int sayiDegeri = k;
			System.out.println("ASCII tablosundaki sayisal degeri=" + sayiDegeri);

//		6-Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine 
//		cevirip yazdirin.  50’den kucukse “D”, 50-60 arasi “C”, 60-80 
//		arasi “B”, 80’nin uzerinde ise “A”.(If, else if, else kullanalim)

			Scanner notDegeri = new Scanner(System.in);
			System.out.println("Lütfen 100 uzerinden bir not giriniz.");
			int n = notDegeri.nextInt();

			if (n < 50) {
				System.out.println("Notunuz D'dir.");
			} else if (n >= 50 && n < 60) {
				System.out.println("Notunuz C'dir.");
			} else if (n >= 60 && n < 80) {
				System.out.println("Notunuz B'dir.");
			} else {
				System.out.println("Notunuz A'dir.");
			}

//		7-Kullanıcıdan 4 basamakli birsayi girmesini isteyin. Girdiği sayi 
//		5’e bölünüyorsa son rakamını control edin. Sonrakamı 0 ise 
//		ekrana “5’e bölünen çift sayı” yazdırın. Sonrakamı 0değilise “5’e
//		bölünen tek sayı” yazdırın. Girdiği password 5’e bölünmüyorsa 
//		ekrana “Tekrar deneyin” yazdırın. (Nested Ternary kullanalim)

			Scanner dortBasamakliSayi = new Scanner(System.in);
			System.out.println("Lütfen dört basamakli bir sayi giriniz.");
			int sayi = dortBasamakliSayi.nextInt();

			String sonuc = (sayi % 5 == 0) ? (sayi % 2 == 0 || sayi % 5 == 0) ? "Sayi 5'e bölünebilen bir cift sayidir."
					: "Sayi 5'e bölünebilen bir tek sayidir." : "Tekrar deneyiniz";

			if (sayi % 5 == 0 && sayi % 2 == 0) {

				System.out.println("Sayi 5'e bolunebilen bir cift sayidir.");
				System.out.println(sayi % 5);
			} else if (sayi % 5 == 0) {
				System.out.println("Sayi 5'e bölünebilen bir tek sayidir.");
				System.out.println(sayi % 5);
			} else {
				System.out.println("Tekrar deneyiniz.");
				System.out.println(sayi % 5);
			}
		}
	}
}
