package zeynepTubaTur;

import java.util.Scanner;

public class JavaOdev5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Soru 1
//		Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i 
//		olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara 
//		gore e mail kontrolu yapiniz.

//		-@ isareti icermiyorsa “gecersiz email” yazdirin
//		-@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin
//		-@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz” 
//		yazdirin.

		System.out.println("E-mail hesabınızı giriniz:");

		String mail = scan.nextLine();

		System.out.println(mailMethod(mail));

		
		
		// Soru 2

//		 ”InfotechAcademy1234...!’^.+” String ifadesinde,
//		 a.kac harf
//		 b.kac rakam
//		 c.kac ozel karakter oldugunu ekrana yazdıran 
//		 karakterSay() metodunu yazınız.

		kacHarf("InfotechAcademy1234...!’^.+");

		
		
		// Soru 3

//		Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin. integer 
//		donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun. 
//		Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin. 
//		Islemin sonucunu main method’ dan verilen komutla yazdirin.

		System.out.println("Uslu sayi hesabi icin iki adet tamsayi giriniz: ");

		int tabanSayisi = scan.nextInt();

		int usSayisi = scan.nextInt();

		System.out.println(tabanSayisi + "^" + usSayisi + " : " + usluSayiMethod(tabanSayisi, usSayisi));

		
		
		// Soru 4

//		Kullanıcıdan aldıgınız 5 basamaklı sayının rakamlarının toplamını 
//		yazdıran programi for döngüsü ile yazınız.

		System.out.println("5 basamakli bir sayi giriniz: ");

		int sayi = scan.nextInt();

		int toplam = 0;

		for (int i = 0; i < 5; i++) {

			toplam += sayi % 10;

			sayi = sayi / 10;

			System.out.println("Sayi : " + sayi + "\tToplam : " + toplam);
		}

		
		
		// Soru 5

//		Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis 
//		degeri dahil aradalarindaki tum cift tamsayilari while loop kullanarak 
//		ekrana yazdiriniz.

		/*
		 * dongu baslatma
		 * 
		 * while (kosul) {
		 * 
		 * islem1 islem2 islem3
		 * 
		 * artima,azaltma }
		 */

		System.out.println("Baslangic degeri ve bitis degeri dahil aradaki tum cift tamsayilari ogreneceksiniz. "
				           + "\nBaslangic degerı ıcın bır tamsayı giriniz :");

		int baslangic = scan.nextInt();

		System.out.println("Bitis degeri ıcın bır tamsayı giriniz :");

		int bitis = scan.nextInt();

		int ciftSayi = baslangic;

		while (bitis >= ciftSayi && ciftSayi >= baslangic) {

			if (ciftSayi % 2 == 0)

				System.out.println(baslangic + " - " + bitis + " arasindaki cift tamsayilar:" + ciftSayi);

			ciftSayi++;
		}

		
		
		// Soru 6

//		Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac 
//		tane olduklarini ekranda yazdirin.(while dongusu ile)

		System.out.println("Bir sayi giriniz, "
				           + "\n Girdiginiz sayinin tam bolenlerini ve toplam kac tane olduklarini ogreneceksiniz :");

		int girilenSayi = scan.nextInt();

		int tamBolen = 1;

		int sayac = 0;

		while (tamBolen <= girilenSayi) {

			if (girilenSayi % tamBolen == 0) {

				System.out.println(girilenSayi + " nin tam bolenleri: " + tamBolen);

				sayac++;
			}
			tamBolen++;

		}
		System.out.println(girilenSayi + " in " + sayac + "tane tam boleni vardir.");

		
		
//      Soru 7

//		Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 
//		0’a basmasini soyleyin. 
//		Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif 
//		sayilarin toplaminin kac oldugunu yazdirin.(do while dongusu ile)

		System.out.println("Toplamak uzere pozitif sayilar gırınız: "
				          + "\n Islemi bitirmek icin 0’a basabılırsınız.");

		int topla = 0;
		int sayac2 = 0;
		int gırılenSayı = 1;

		do {
			gırılenSayı = scan.nextInt();
			if (gırılenSayı > 0) {

				topla += gırılenSayı;
				sayac2++;
			}
		}

		while (gırılenSayı != 0);
		{
			System.out.println("Sayilarin toplamı kaçtır? : " + topla);
			System.out.println("Kac tane sayı gırılmıştır? : " + sayac2);
		}

		
		
//     Soru 8
		
//	   Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e 
//	   ulasincaya kadar sayi istemeye devam edin. Toplam 500’e ulastiginda 
//	   veya gectiginde sayilarin toplami ve kac sayi girildigini yazdirin.(do while 
//	   dongusu ile)

		System.out.println("Toplama yapabilmek icin sayilar giriniz: "
				+ "\nsayıların toplamı 500’e ulaşıncaya kadar sayı girmeniz gerekiyor. "
				+ "\nToplam 500’e ulastığınızda veya gectiğinizde sayıların toplamını ve kac sayı girdiginizi ögreneceksiniz :");

		int toplama = 0;
		int adet = 0;
		int sayılar = 1;

		do {
			sayılar = scan.nextInt();

			if (sayılar > 0) {

				toplama = toplama + sayılar;
				adet++;
			}
		} while (toplama <= 500);
		{
			System.out.println("Girdiginiz sayilarin toplami: " + toplama);
			System.out.println("Girdiginiz sayilarin adeti: " + adet);
		}

		
		
//     Soru 9

//	   Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore 
//	   carpim tablosu olusturun. Ornek,kullanici 3 girerse,
//	   1 2 3
//	   2 4 6
//	   3 6 9
//	  (ic ice for ile) (Zor seviye )

		System.out.println("Girdiğiniz rakama göre çarpım tablosu oluşturulacaktır. "
				           + "\nPozitif bir rakam giriniz: ");

		int z = scan.nextInt();

		for (int x = 1; x <= z; x++) {

			for (int y = 1; y <= z; y++) {

				System.out.print(x * y + " ");

			}

			System.out.println("\n");

		}
	}

	
//     Soru 1, 2, 3 un Method kisimlari 
	
	// Soru 1
	

	public static String mailMethod(String email) {

		String sonuc = "";

		if (!email.contains("@")) {

			sonuc = "gecersiz email";

		}

		else if (!email.contains("@gmail")) {

			sonuc = "lutfen gmail adresinizi girin";
		}

		else if (!email.endsWith("@gmail.com")) {

			sonuc = "Yazimda bir sorun var, maili kontrol ediniz";

		} else {
			sonuc = "Dogru bir mail girdiniz!";
		}

		return sonuc;
	}

	
	
	// Soru 2

	public static void kacHarf(String ifade) {

		int harf = 0, rakam = 0, karakter = 0;

		for (int i = 0; i < ifade.length(); i++) {

			if ((ifade.charAt(i) >= 65 && ifade.charAt(i) <= 90) || (ifade.charAt(i) >= 97 && ifade.charAt(i) <= 122)) {
				harf++;

			} else if (ifade.charAt(i) >= 48 && ifade.charAt(i) <= 57) {
				rakam++;

			} else if ((ifade.charAt(i) >= 33 && ifade.charAt(i) <= 47 || ifade.charAt(i) >= 58 && ifade.charAt(i) <= 64
					|| ifade.charAt(i) >= 91 && ifade.charAt(i) <= 96
					|| ifade.charAt(i) >= 123 && ifade.charAt(i) <= 126)) {
				karakter++;
			}

		}

		System.out.println("harf sayisi = " + harf + "\nrakam sayisi = " + rakam + "\nkarakter sayisi = " + karakter);
	}

	
	
	// Soru 3

	public static int usluSayiMethod(int tabanSayisi, int usSayisi) {

		int sonuc = (int) Math.pow(tabanSayisi, usSayisi); // Math.pow(2, 3); // 2^3
		return sonuc;

	}
}
     