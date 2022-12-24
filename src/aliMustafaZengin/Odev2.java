package aliMustafaZengin;

import java.util.Scanner;

public class Odev2 {
	public static void main(String[] args) {
		
		
		

	
				
				/*1.Üç String değişkeni oluşturun, ilki adınız içindir; ikincisi soyadınız içindir;
				üçüncüsü adresiniz içindir. Bunları konsolda şu şekilde yazdırın;
				ilk satırda ad ve soyad, ikinci satırda ise adres yer alacaktır.
				*/
				
			String ad = "Mustafa";
			String soyad= "Zengin";
			String adres= "Hauptstrasse 21 Zurich";
			
			System.out.println(ad+" "+soyad+"\n"+adres);
			
			/*2.Type a program which converts the mile to kilometer. Mile value will be entered by user.
		 (Use double)
		Hint 1: km = mile x 1.6
		Hint 2: To get double, use nextDouble()
		*/
			Scanner scan=new Scanner(System.in);
			System.out.println("Km olarak elde etmek istediginiz degeri mil olarak giriniz");
			double mil = scan.nextDouble();
			double km=mil*1.6;
			System.out.println(km);
			
			/*3.Type a program which converts the hours to seconds. Hours value will be entered by user. (Use long)
		Hint 1: second = hour x 60 x 60
		Hint 2: To get long, use nextLong()
		*/
			
			System.out.println("Saniye olarak elde etmek istediginiz degeri saat olarak giriniz");
			long saat=scan.nextLong();
			long saniye=saat*60*60L;
			System.out.println(saniye);
			
			/*Kullanicidan karenin bir kenar uzunlugunu alin ve
			 *  karenin cevresini ve alanini hesaplayip yazdirin.
			 */
			System.out.println("Cevresini ve alanini hesaplamak istediginiz karenin kenar uzunlugunu giriniz");
			double kenar=scan.nextDouble();
			double alan=kenar*kenar;
			double cevre=4*kenar;
			System.out.println("Karenin alani:"+alan+"\nKarenin cevresi:"+cevre);
			
			/*Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini 
			 * isteyip prizmanin hacmini hesaplayip yazdirin.
			 */
			System.out.println("uzun kenari girin");
			double uzun=scan.nextDouble();
			System.out.println("kisa kenarini girin");
			double kisakenar=scan.nextDouble();
			System.out.println("yuksekligini girin");
			double yukseklik=scan.nextDouble();
			
			double hacim=uzun*kisakenar*yukseklik;
			System.out.println(hacim);
			
			/*Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin.
			 * Isminiz : Okan
		       Soyisminiz : Kaplan
		       Kursumuza katiliminiz alinmistir, tesekkur ederiz
			 */
			
			System.out.println("isminizi girin");
			scan.nextLine(); // java dummy 
			String isim=scan.nextLine();
			
			System.out.println("soyisminizi girin");
			String soyisim=scan.nextLine();
			
			
			
			System.out.println("isminiz:"+isim+"\nsoyisminiz:"+soyisim+"\nKursumuza katiliminiz alinmistir, tesekkur ederiz");
			
			
			
			
	}

		}
