package zeynepTubaTur;

import java.util.Scanner;

public class JavaOdev4 {

	public static void main(String[] args) {

//		Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”  string 
//	            ifadesini “Java ogrenmek cok guzel.” sekline getirin.

		
		String ifade = "Java ogrenmek123 Cok guzel@";

		ifade = ifade.replace("123", "").replace("C", "c").replace("@", ".");

		System.out.println(ifade);

		
		
//      Soru 2) Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa “Girdiginiz isim a 
//		        harfi iceriyor” - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor” - ikisi de yoksa
//		        “Girdiginiz isim a veya Z harfi icermiyor” yazdirin. 

		
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir isim giriniz: ");

		String isim = scan.next();

		if (isim.contains("a") || isim.contains("A"))

			System.out.println("Girdiginiz isim 'a' harfi iceriyor.");

		else if (isim.contains("Z") || isim.contains("z"))

			System.out.println("Girdiginiz isim 'Z' harfi iceriyor.");

		else

			System.out.println("Girdiginiz isim 'a' veya 'Z' harfi icermiyor.");

		// Buyuk A kucuk z yi tanimiyor.
		
		

//      Soru 3) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu 
//		        yazdirin.

		
		Scanner scan1 = new Scanner(System.in);

		System.out.println("Lutfen isminizi giriniz: ");

		String isim1 = scan1.nextLine();

		System.out.println("Lutfen soyisminizi giriniz: ");

		String soyIsim = scan1.nextLine();

		int i = isim1.length();

		System.out.println("Ismin uzunlugu: " + i);

		int s = soyIsim.length();

		System.out.println("Soyismin uzunlugu: " + s);

		if (i > s)

			System.out.println("Isminizin karakter sayisi, soyisminizin karakter sayisindan daha fazladir.");

		else

			System.out.println("Soyisminizin karakter sayisi, isminizin karakter sayisindan daha fazladir.");

		
		
//      Soru 4) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi 
//		        yazdirin.
//		        isim-soyisim : O*** K***** 
//		        kart no : **** **** **** 1234

		
		Scanner scan2 = new Scanner(System.in);

		System.out.println("Lutfen isminizi giriniz: ");

		String name = scan2.nextLine();

		System.out.println("Lutfen soyisminizi giriniz: ");

		String surname = scan2.nextLine();

		System.out.println("Lutfen kredi karti iban bilgisini giriniz: ");

		String iban = scan2.nextLine();

		name = (name.charAt(0) + name.substring(1).replaceAll("\\S", "*")).toUpperCase();

		surname = (surname.charAt(0) + surname.substring(1).replaceAll("\\S", "*")).toUpperCase();

		iban = iban.substring(0, iban.length() - 4).replaceAll("\\S", "*") + iban.substring(iban.length() - 4);

		System.out.println("isim-soyisim: " + name + " " + surname + "\nkart-no: " + iban);

		
		
//		Aşağıdaki sorunun zorluk seviyesi yüksektir. Kısmi çözümlerde kabul edilir.

//		Soru 5) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre 
//		        basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” 
//		        yazdirin.
//		        - Ilk harf buyuk harf olmali 
//		        - Son harf kucuk harf olmali 
//		        - Sifre bosluk icermemeli 
//		        - Sifre uzunlugu en az 8 karakter olmali	

		
		Scanner scan3 = new Scanner(System.in);

		System.out.println("Lutfen sifrenizi giriniz:");

		String password = scan3.nextLine();

		if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
			if (password.charAt(password.length() - 1) >= 'a' && password.charAt(password.length() - 1) <= 'z') {
				if (!password.contains(" ")) {
					if (password.length() >= 8) {
						System.out.println("Sifre basari ile tanimlandi.");
					}
				}
			}
		} else {
			System.out.println("Islem basarisiz, lutfen yeni bir sifre girin.");
		}
		;
	}

}
