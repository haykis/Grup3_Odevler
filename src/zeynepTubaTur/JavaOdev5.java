package zeynepTubaTur;

import java.util.Scanner;

public class JavaOdev5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Soru 1

		System.out.println("e-mail hesabini giriniz:");

		String mail = scan.nextLine();

		System.out.println(mailMethod(mail));

		// Soru 2

		kacHarf("InfotechAcademy1234...!’^.+");

		// Soru 3

		System.out.println("Uslu sayi hesabi icin iki adet integer sayi giriniz: ");

		int tabanSayisi = scan.nextInt();

		int usSayisi = scan.nextInt();

		System.out.println(tabanSayisi + "^" + usSayisi + " : " + usluSayiMethod(tabanSayisi, usSayisi));

		// Soru 4

		System.out.println("5 basamakli bir sayi giriniz: ");

		int sayi = scan.nextInt();

		int toplam = 0;

		for (int i = 0; i < 5; i++) {

			toplam += sayi % 10;

			sayi = sayi / 10;

			System.out.println("Sayi : " + sayi + "\tToplam : " + toplam);

		}

		// Soru 5

		/*
		 * dongu baslatma
		 * 
		 * while (kosul) {
		 * 
		 * islem1 islem2 islem3
		 * 
		 * artima,azaltma }
		 */

		System.out.println("baslangic giriniz :");

		int baslangic = scan.nextInt();

		System.out.println("bitis degeri giriniz :");

		int bitis = scan.nextInt();

		int ciftSayi = baslangic;

		while (bitis >= ciftSayi && ciftSayi >= baslangic) {

			if (ciftSayi % 2 == 0) 

				System.out.println(baslangic + " - " + bitis + " arasindaki cift tamsayilar:" + ciftSayi);

			
			ciftSayi++;
		}

		// Soru 6 	

		System.out.println("Bir sayi giriniz:");

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
	
	
	
	
// Soru 7
	
	
	System.out.println(" pozitif sayi giriniz:" );
	
	int a = 0 ;
	int sayac2 = 0;
	int sayi2 =1;
	
	do 
	{
		sayi = scan.nextInt();
		
		if(sayi2 >0 )
		{	
		a += sayi2 ; 
		sayac2++;
	}
	}
while (sayi2 != 0);
	
	System.out.println(a);
	System.out.println(sayac2);
	
	
	
//soru 9
	
	
	for (int i = 1 ; i<11 ; i++ ) {
		for (int b= 1 ; b<11 ; b++) {
			System.out.println(i*b);
	
		}
	
	System.out.println(" /n  ");
	}
	}

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

