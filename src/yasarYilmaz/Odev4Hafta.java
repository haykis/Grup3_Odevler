package yasarYilmaz;

import java.util.Scanner;

public class Odev4Hafta {

	public static void main(String[] args) {


//Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”  string 
//ifadesini “Java ogrenmek cok guzel.” sekline getirin.
		
		/*
		 * String mesaj="Java ogrenmek123 Cok guzel@"; String regex = "\\d+";
		 * System.out.println(mesaj); System.out.println(mesaj.replaceAll("\\d+"," "));
		*/		
//	lksjdhfalksjfşlsajfşlsajfşlsakfd	
//Soru 2) Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa “Girdiginiz isim a 
//harfi iceriyor” - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor” - ikisi de yoksa
//“Girdiginiz isim a veya Z harfi icermiyor” yazdirin.
		
		//contains()==> belirttigimiz string ifadenin icinde olup olmadigina bakariz.  

		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Adınızı Giriniz  "); String ad = scan.nextLine(); boolean
		 * a_varmi=ad.contains("a"); boolean Z_varmi=ad.contains("Z"); if (!(a_varmi ||
		 * Z_varmi)) System.out.println("Adınız  a veya Z Harfi İçermiyor"); else
		 * System.out.println("Adınız  a veya Z Harfi İçeriyor"); if (a_varmi)
		 * System.out.println("Adınızın içinde  a  harfi vardır"); if (Z_varmi)
		 * System.out.println("Adınızın içinde  Z  harfi vardır");
		 */	 		
		
//Soru 3) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Adınızı Giriniz  "); String ad = scan.nextLine();
		 * System.out.println("Soyadınızı Giriniz  "); String soyad = scan.nextLine();
		 * if (ad.length()>soyad.length())
		 * System.out.println("Adınız  Soyadınız'dan Daha Uzun"); else
		 * System.out.println("Soyadınız  Adınız'dan daha Uzun");
		 */
		 		
		
		
//Soru 4) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin.
//isim-soyisim : O*** K***** 
//kart no : **** **** **** 1234
		 
		//substring ==> girdigimiz indexler arasindaki ifadeleri gormek icin kullaniriz.
			
		 
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Adınızı Giriniz  "); String ad = scan.nextLine();
		 * System.out.println("Soyadınızı Giriniz  "); String soyad = scan.nextLine();
		 * System.out.println("Kredi Kartı Numarasını Giriniz  "); String kredikartno =
		 * scan.nextLine(); System.out.println("Ad Soyad = " + ad.substring(0,1) +
		 * "***  " + soyad.substring(0, 1) + "*****\n" +
		 * "Kredi Kartı Numarası = **** **** **** " +
		 * kredikartno.substring((kredikartno.length()-4),kredikartno.length()));
		 */		 		 		 

//Aşağıdaki sorunun zorluk seviyesi yüksektir. Kısmi çözümlerde kabul edilir. 
//Soru 5) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre 
//basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” 
//yazdirin 
//- Ilk harf buyuk harf olmali 
//- Son harf kucuk harf olmali 
//- Sifre bosluk icermemeli 
//- Sifre uzunlugu en az 8 karakter olmali
		
		
		
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Şifrenizi Giriniz  "); 
		  String sifre = scan.nextLine();
		  
		  int uzunluk = sifre.length(); 
		  char ilkharf = sifre.charAt(0); 
		  char sonharf = sifre.charAt(sifre.length()-1); 
		  char ctrlilk = sifre.toUpperCase().charAt(0);
		  char ctrlson = sifre.toLowerCase().charAt(sifre.length()-1); 
		  // boolean ctrlbosluk = sifre.isBlank(); String ctrlsifre = sifre.replace(" ", "a");
		  boolean ctrlbosluk = sifre.contains(" ");
		  
		  
		  if (uzunluk >= 8) System.out.println("Şifre 8 Karekterli veya Daha Uzun\n ");
		  System.out.println(ilkharf == ctrlilk ? "Şifrenin İlk Harfi Büyüktür-> " +
		  ilkharf: "Şifrenin İlk Harfi Küçüktür-> " + ilkharf );
		  System.out.println(sonharf == ctrlson ? "Şifrenin Son Harfi Küçüktür-> " +
		  sonharf : "Şifrenin Son Harfi Büyüktür-> " + sonharf );
		  
//		  if ( (uzunluk >= 8) && (ilkharf == ctrlilk) && (sonharf == ctrlson) && (sifre == ctrlsifre)) 
//		  System.out.println("\nŞifre Başarı İle Tamamlandı"); else
//		  System.out.println("\nsdfİşlem Başarısız. Tekrar Şifre Giriniz");
//		 
		  if ( (uzunluk >= 8) && (ilkharf == ctrlilk) && (sonharf == ctrlson) && (!ctrlbosluk)) 
			  System.out.println("\nŞifre Başarı İle Tamamlandı"); else
				  System.out.println("\nİşlem Başarısız. Tekrar Şifre Giriniz");
//		
//		System.out.println("ilk Harf =" + ilkharf + "\nSon Harf = " + sonharf + "\nŞifre Uzunluğu = " + uzunluk);
//		System.out.println("Sifre = " + sifre + "\nctrlsifre = " + ctrlsifre);		
		
		
		if (ilkharf == ctrlilk) System.out.println("Şifrenin İlk Harfi Büyüktür " + ilkharf);
		if (sonharf == ctrlson) System.out.println("Şifrenin Son Harfi Küçüktür "  + sonharf);


		
		
	}

}
