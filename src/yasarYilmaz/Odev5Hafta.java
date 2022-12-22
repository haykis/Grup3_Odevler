package yasarYilmaz;

import java.util.Scanner;

public class Odev5Hafta {
	
	public static void main(String[] args)
	{
	
	  
	  String mesaj = "infotechAcademy1234...!’^.+";	
	  Scanner scan = new Scanner(System.in);
	  
//    *************************** Girilen Sayının Üssünü Alma *****************************
	  
//	  System.out.println("Üssü Alınacak Sayıyı Griniz ");
// 	  int taban = scan.nextInt();
//	  System.out.println("Üssü Griniz ");
// 	  int us = scan.nextInt();

//    *************************** Maili Kontrol Etme *****************************  	  
	  
//	  System.out.println("Mailininizi Giriniz  "); 
//	  String email = scan.nextLine();
	  
//    *************************** Girilen Sayının Rakamlarını Toplama *****************************  	  
	  
//    System.out.println("Bir sayi giriniz: ");
//    int sayigir = scan.nextInt();
//    rakamlari_topla(sayigir);
//	  mailkontrol(email);
//	  karaktersay(mesaj);
//	  System.out.println(usalma(taban,us));
//	  ciftsayilar();
//	  tambolenler();
//	  carpimtablosu();
//	  usalma(taban,us);
//	  toplam500();
//	  tambolenler()
//	  pozitif();
	  
	  
	
	  
	}
	
//	1)Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i 
//	olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara 
//	gore e mail kontrolu yapiniz.
//	-@ isareti icermiyorsa “gecersiz email” yazdirin
//	-@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin
//	-@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz” 
//	yazdirin.
	
	static void mailkontrol(String mail) 
    	{
			boolean varmied=mail.contains("@");
		    boolean varmigmail=mail.contains("gmail"); 
			boolean varmigmailcom =mail.contains("gmail.com");
			  
			if (!varmied)       System.out.println("email @         içermiyor. Geçersiz email");
	   else if (!varmigmail)	System.out.println("email gmail     içermiyor. Emaili Tekrar Giriniz");
	   else if (!varmigmailcom)	System.out.println("email gmail.com içermiyor. Yazımı Kontrol Ediniz");
	   else    System.out.println("emailiniz de @ gmail ve gmail.com vardır"); 
	
	    }
//	
//	2) ”InfotechAcademy 1234... !’^ .+” String ifadesinde,
//	a.kac harf
//	b.kac rakam
//	c.kac ozel karakter oldugunu ekrana yazdıran 
//	karakterSay() metodunu yazınız.
	
	
	static void karaktersay(String mesajim)
		{
		int harf,karekter,sayi,bosluk;
		char result = ' ';
		harf=0;
		karekter=0;
		sayi=0;
		bosluk=0;
		System.out.println(result);
	
		for(int x=0; x<=mesajim.length()-1;x++)
			{
					 result = mesajim.charAt(x);
				 	 if(Character.isLetter(result))     harf++ ;
				else if(Character.isDigit(result)) 	    sayi++ ;
				else if(Character.isSpaceChar(result))  bosluk++ ;
				else								    karekter++;
				
			}
		System.out.println(" Harf Sayısı           = "   + harf + 
						   "\n Rakam Sayısı          = " + sayi + 
						   "\n Boşluk Sayısı         = " + bosluk + 
						   "\n Özel Karekter Sayisi  = " + karekter );
		}
	
	
	
//	3) Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin. integer 
//	donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun. 
//	Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin. 
//	Islemin sonucunu main method’ dan verilen komutla yazdirin.
	
	
	static int usalma(int taban,int us)
		{
			
			int sonuc = 1;
			 
	        for (;us != 0; --us)  sonuc *= taban;
	        				
//	        int sonuc = Math.pow(taban, us);
			return sonuc;
			
		}
	
	
	
//	4) Kullanıcıdan aldıgınız 5 basamaklı sayının rakamlarının toplamını yazdıran programi for döngüsü ile yazınız.
	
	static void rakamlari_topla(int sayi)
		{
	        int toplam = 0;
	         
	        while(sayi > 0) {
	            toplam += sayi % 10;
	            sayi /= 10;  // sayi = sayi / 10;
	        }
	        System.out.println("Girilen sayinin rakamlarının toplamı = " + toplam);		
//		Scanner veri = new Scanner(System.in);
//		System.out.println("5 Basamaklı Sayı Giriniz ");
//		int sayial = veri.nextInt();
		
		}
	
	
	
//	5) Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis 
//	degeri dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.
	
	static void ciftsayilar()
		{
			Scanner scan = new Scanner(System.in);
			int bas,son;
			System.out.println("Başlangıç Sayısını Giriniz ");
			bas = scan.nextInt();
			System.out.println("Bitiş Sayısını Giriniz ");
			son = scan.nextInt();
			while (son>bas)
				{
					if ((son % 2) == 0 ) System.out.println(son);
					son -=1;
				}
			
		}
	
	
//	6) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac 
//	tane olduklarini ekranda yazdirin.(while dongusu ile)
	
	static void tambolenler()
	{
		Scanner scan = new Scanner(System.in);
		int sayigir;
		int adet=0;
			System.out.println("Bir Sayı Giriniz ");
			sayigir = scan.nextInt();
			int sayi = sayigir;
				while (sayi>1)
				{
					if ((sayigir % sayi) == 0 ) 
						{
							adet++;
							System.out.println(sayi);
						}
					sayi--;
				}
			System.out.println(adet + "Tane Bölen Sayı Vardir");

	}
	
	
//	7) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 
//	0’a basmasini soyleyin. 
	
//	static void pozitif()
	{
//		Scanner scan = new Scanner(System.in);
//		int sayi=1;
//		int toplam = 0;
//		boolean ctrl=true;
//		while (sayi!=0)
//			{
//				System.out.println("Pozitif Sayı Giriniz ");
//				sayi=scan.nextInt();
//				toplam += sayi;
//				
//			}
//		System.out.println("Girilen Pozitif Sayilarin Toplamı =" + toplam);
		

//		Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif 
//		sayilarin toplaminin kac oldugunu yazdirin.(do while dongusu ile)
		
		static void pozitif()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Pozitif sayi girin");
			int toplam=0;
			int sayac=0;
			int sayi=1;
			do {
				sayi=scan.nextInt();
				if (sayi > 0) 
				  {
					toplam += sayi;
					sayac++;
				  }
				} 
			while (sayi!=0);
			System.out.println(" Girilen Sayıların Toplamı =" + toplam );
			System.out.println(sayac + " Adet Ssayı Girildi ");
		}
	
	
//	8) Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e 
//	ulasincaya kadar sayi istemeye devam edin. Toplam 500’e ulastiginda 
//	veya gectiginde sayilarin toplami ve kac sayi girildigini yazdirin.(do while 
//	dongusu ile)
		
		static void toplam500()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Pozitif sayi girin");
			int toplam=0;
			int sayac=0;
			int sayi=1;
			do {
				sayi=scan.nextInt();
				if (sayi > 0) 
				  {
					toplam += sayi;
					sayac++;
				  }
				} 
			while (toplam<500);
			System.out.println(" Girilen Sayıların Toplamı =" + toplam );
			System.out.println(sayac + " Adet Ssayı Girildi ");
		}
		
		
		
		
//	9 Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore 
//	carpim tablosu olusturun. Ornek,kullanici 3 girerse,
//	1 2 3
//	2 4 6
//	3 6 9
//	(ic ice for ile) [Zor seviye – Yapamazsaniz onemli değil.]
		
		static void carpimtablosu()
			{
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Pozitif sayi girin");
			
			System.out.println("Bir sayı Giriniz ");
			int sayi = scan.nextInt();
			for (int x=1;x<=sayi;x++) 
				{
					for (int y=1;y<=sayi;y++) 
					{
						System.out.print(x*y + " ");
					}
				System.out.println("\n");
				}
			}
		
		
}