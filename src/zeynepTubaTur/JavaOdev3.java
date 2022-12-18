package zeynepTubaTur;

import java.util.Scanner;

public class JavaOdev3 {
	
	public static void main(String[] args) {

		/*
		 * SORU 1: Kullanıcıdan uc tane tam sayı alalım ve maksimum sayıyı bulan java
		 * kodunu yazalım. Not: if else kullanalım...
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("3 tane tamsayi degerini giriniz: ");
		
		int a = scan.nextInt();

		int b = scan.nextInt();

		int c = scan.nextInt();

		System.out.println("a" + a + " b" + b + " c" + c);

		if ((a >= b) && (a >= c)) {
			System.out.println("a maksimum tamsayidir. ");
		}

		else if ((b >= a) && (b >= c)) {
			System.out.println("b maksimum tamsayidir. ");
		}

		else {
			System.out.println("c maksimum tamsayidir. ");
		}

		
		/*
		 * SORU 2: Kullanıcıdan bir gün girmesini isteyelim. a. Eger girilen gun hafta
		 * sonu ise tekrar kontrol edelim Cumartesi ise Cumartesi ve hafta sonu, Pazar
		 * ise Pazar ve hafta sonu yazdıralım. b. Degil ise gün hafta ici yazdıralım. 1.
		 * Note: equals ile karsilastiralim 2. Nested ternary kullanalım...
		 */

		Scanner scan1 = new Scanner(System.in);

		System.out.println("lutfen haftanin gunlerinden bir gun giriniz: ");

		String gun = scan1.nextLine();

		String durum = (gun.equals("cumartesi") || gun.equals("pazar")) ?

				gun.equals("cumartesi") ? "cumartesi ve haftasonudur." : "pazar ve haftasonudur."

				: gun + " hafta ici bir gundur.";

		System.out.println("gun : " + durum);

		

		/*
		 * SORU 3: Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
		 * baslayan gun isimlerini yazdirin. Ornek ilkHarf=P output = “Pazar, Pazartesi
		 * veya Persembe” ilkHarf=S output = “Sali” (switch case default ile yapalim
		 */

		Scanner scan2 = new Scanner(System.in);

		System.out.println("gun isimlerinden birinin ilk harfini giriniz: ");

		char ilkHarf = scan2.next().charAt(0);

		switch (ilkHarf) {

		case 'P':

			System.out.print("Pazar, Pazartesi,Persembe ");
			break;

		case 'S':
			System.out.print("Sali ");

			break;

		case 'C':
			System.out.print("carsamba, cuma, cumartesi ");

			break;

		default:
			System.out.print("gecersiz harf. ");
		}


		/*
		 * SORU 4: Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin
		 * kutsal gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun”
		 * yazdirin. “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin.
		 * (switch case default ile yapalim
		 */

		Scanner scan3 = new Scanner(System.in);

		System.out.println("Lutfen, bildiginiz kutsal gunlerden bir gun giriniz: ");

		String kutsalGun = scan3.next();

		switch (kutsalGun) {

		case "cuma":

			System.out.println("Muslumanlar icin kutsal gundur.");
			break;

		case "cumartesi":

			System.out.println("Yahudiler icin kutsal gundur.");
			break;

		case "pazar":

			System.out.println("Hiristiyanlar icin kutsal gundur.");
			break;

		default:

			System.out.println("Kutsal olmayan bir gun girdiniz. Tekrar deneyiniz...");

		}

		/*
		 * SORU 5: Kullanicidan bir karakter girmesini isteyin ve girilen karakterin
		 * harf olup olmadigini yazdirin. (D, d, 3, ~, @, !, ...) (ip ucu: ascii
		 * tablosu)
		 */

		Scanner scan4 = new Scanner(System.in);

		System.out.println("Lutfen karakter olarak bir harf giriniz: ");

		char harf = scan4.next().charAt(0);

		if (('A' <= harf && harf <= 'Z') || ('a' <= harf && harf <= 'z'))

		{
			System.out.println("Girilen karakter bir harftir.");
		}

		else

		{
			System.out.println(harf + " olarak girdiginiz karakter bir harf degildir.");
		}

		{
			System.out.println("ascii tablosundaki degeri:" + (int) harf);
		}

		
		/*
		 * SORU 6: Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine
		 * cevirip yazdirin. 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”,
		 * 80’nin uzerinde ise “A”.(If, else if, else kullanalim Scanner scan5 = new
		 * Scanner(System.in);
		 */
		Scanner scan5 = new Scanner(System.in);
		
		System.out.println("Lutfen 100 uzerinden notunuzu giriniz : ");

		int not = scan5.nextInt();

		if (not > 80)

			System.out.println(" Notunuz harf sistemine gore: A");

		else if (60 < not && not < 80)

			System.out.println(" Notunuz harf sistemine gore: B");

		else if (50 < not && not < 60)

			System.out.println(" Notunuz harf sistemine gore: C");

		else

			System.out.println(" Notunuz harf sistemine gore: D");

//		tek bir sart saglanacaksa suslu parantez kullanmak zorunda degiliz.

		

		/*
		 * SORU 7: Kullanıcıdan 4 basamakli birsayi girmesini isteyin. Girdiği sayi 5’e
		 * bölünüyorsa son rakamını control edin. Sonrakamı 0 ise ekrana “5’e bölünen
		 * çift sayı” yazdırın. Sonrakamı 0değilise “5’e bölünen tek sayı” yazdırın.
		 * Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın. (Nested
		 * Ternary kullanalim Scanner scan6 = new Scanner(System.in);
		 */
		
		Scanner scan6 = new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli bir sayi giriniz: ");

		int girilenSayi = scan6.nextInt();

		String sonuc = (girilenSayi % 5 == 0)
				? (girilenSayi % 10 == 0) ? "5’e bölünen çift sayı" : " 5'e bölünen tek sayı"
				: "Tekrar deneyin";

		System.out.print("Sonuc: ".concat(sonuc));
	}
}