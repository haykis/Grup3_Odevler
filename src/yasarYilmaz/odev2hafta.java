package yasarYilmaz;

import java.util.Scanner;

public class odev2hafta {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			// Adınızı Soyadınızı ve Adresinizi Girip Ekrana Yazdırın
			System.out.print("İsminizi Giriniz ");
				String ad = scan.next();
			System.out.print("Soyadınızı Giriniz \r");
				String soyad = scan.next();
			System.out.println("İsminiz          = " + ad);
			System.out.println("Soyisminiz       = " + soyad);
			System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz");

			// Girilen Saati Saniye Olarak Hesaplama
			System.out.println("Saati Girerek Saniye Hesaplama ");
			System.out.print("Saat Giriniz  ");
				Long saat = scan.nextLong();
			System.out.println(saat + " Saat = " + saat*60*60 + " Saniyedir" );

			// Karenin Alan ve Çevresinin Hesaplanması
			System.out.println("Karenin Alan ve Çevresini Hesaplama ");
			System.out.print("Kenar Uzunluğunu Giriniz  ");
				Short kenar = scan.nextShort();
			System.out.println(kenar + " Alan = " + kenar*kenar + "\n Çevre = " + kenar*4 );
			
			// Girilen Mil'i Km ye Çevirme
			System.out.println("Uzunluğu mil girerek km hesaplama ");
			System.out.print("Uzunluğu mil giriniz  ");
				Double mil = scan.nextDouble();
			System.out.println(mil + " mil = " + mil*1.6);
			
		
		
}


}
