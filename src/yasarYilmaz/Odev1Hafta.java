package yasarYilmaz;

import java.util.Scanner;

public class Odev1Hafta {
	
	public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("İsminizi Giriniz ");
	String ad = scan.next();
	System.out.println("Soyadınızı Giriniz ");
	String soyad = scan.next();
	System.out.println("İsminiz          = " + ad);
	System.out.println("Soyisminiz       = " + soyad);
	System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz");
	
	
	byte  bytesayi = 25;
	short kisasayi = 119;
	int   tamsayi  =23456550;
	
	System.out.println("Byte    Sayimiz = " + bytesayi);
	System.out.println("Short   Sayimiz = " + kisasayi);
	System.out.println("Integer Sayimiz = " + tamsayi);
	
	System.out.println("Byte  Max = " + Byte.MAX_VALUE   + "\nByte  Min = " + Byte.MIN_VALUE);
	System.out.println("Short Max = " + Short.MAX_VALUE  + "\nShort Min = " + Short.MIN_VALUE);
	System.out.println("Int   Max = " + Integer.MAX_VALUE    + "\nInt   Min = " + Integer.MIN_VALUE);
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Saati Girerek Saniye Hesaplama ");
	System.out.println("Saat Giriniz  ");
	Long saat = scan.nextLong();
	System.out.println(saat + " Saat = " + saat*60*60 + " Saniyedir" );

	
	 System.out.println("xyzasd\bmerhaba");
     System.out.println("x\tmerhaba");
     System.out.println("xasasd\rmerhaba");
     String a="Java";
     System.out.println("merha\b"+a );
     
     
     Scanner scan = new Scanner(System.in);
	 System.out.println("Karenin Alan ve Çevresini Hesaplama ");
	 System.out.println("Kenar Uzunluğunu Giriniz  ");
	 Short kenar = scan.nextShort();
	 System.out.println(kenar + " Alan = " + kenar*kenar + "\n Çevre = " + kenar*4 );
	 
	 
	 
	 Scanner scan = new Scanner(System.in);
		System.out.println("Uzunluğu mil girerek km hesaplama ");
		System.out.println("Uzunluğu mil giriniz  ");
		Double mil = scan.nextDouble();
		System.out.println(mil + " mil = " + mil*1.6);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Prizmanın Enini Giriniz. ");
		Byte en = scan.nextByte();
		System.out.println("Prizmanın Genişliğini Giriniz ");
		Byte genislik = scan.nextByte();
		System.out.println("Prizmanın Yüksekliğini Giriniz ");
		Byte boy = scan.nextByte();
		System.out.println("Prizmanın Hacmi = " + en*genislik*boy);
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("İsminizi Giriniz\r ");
		String ad = scan.next();
		System.out.println("Soyadınızı Giriniz\n ");
		String soyad = scan.next();
		System.out.println("Adresiniz  ");
		String adres = scan.next();
		System.out.println("Ad soyad = " + ad + " "+ soyad);
		System.out.println("Adresiniz  = " + adres);
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
