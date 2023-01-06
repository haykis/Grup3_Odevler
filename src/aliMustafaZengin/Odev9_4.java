package aliMustafaZengin;

import java.util.Scanner;

public class Odev9_4 {

	public static void main(String[] args) {
//		Kullanicidan adini, soy adini isteyin ve onu “Hosgeldin Ad Soyad” seklinde selamlayin.
//		Tc kimlik numarasini talep edin ve kullaniciya tc’ sinin 1. , 4. ve 9. rakamlarini
//      gosterip onaylatin.
//		16 haneli kredi kardi numarasini isteyip ekranda son dort hanesi gorunecek 
//		sekilde yazdirin (** **  ** 5434) .Tum islemleri StringBuilder kullanarak yapiniz. 
//		Bu programin en basinda zamani alin ve islemler tamamlaninca tekrar zaman alin ve 
//		arada gecen sureyi ekrana “Islemler ….. surede tamamlandi.”
//		Ibaresini gosterip programi tamamlayin.
		
		StringBuilder sb1=new StringBuilder();
		Scanner scan=new Scanner(System.in);
		System.out.println("Adinizi girin");
		String ad=scan.nextLine();
		System.out.println("Soyadinizi girin");
		String soyAd=scan.nextLine();
        
		sb1.append(ad+" ").append(soyAd);
		System.out.println("Hosgeldin "+sb1);
		
		System.out.println("Tc Numaranizi girin");
		String tc=scan.nextLine();
		
		
		StringBuilder sb2=new StringBuilder(tc);
		System.out.println("ilk hane "+sb2.subSequence(0,1)+"dorduncu hane "+sb2.subSequence(3,4)+"dokuzuncu hane "+sb2.subSequence(8,9));
		
		System.out.println("16 haneli kredi kardi numarasini girin");
		String kredi=scan.nextLine();
		
		StringBuilder sb3=new StringBuilder(kredi);
		System.out.println(sb3.replace(0, 12, "** **  **"));
		
		
		
		
		
	}

}
