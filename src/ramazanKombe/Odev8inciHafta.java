package ramazanKombe;

import java.util.Arrays;
import java.util.Scanner;

public class Odev8inciHafta {
	/*
	 * 3. 10 kişilik bir sınıftaki öğrencilerin bir dersine ait vize ve final not
	 * bilgileri klavyeden giriş yapılacaktır (Uygun bir dizi tanımlanıp bilgiler
	 * diziye aktarılacak); a. Her öğrencinin ortalamasını bulup ekrana
	 * yazdırınız(ortalama=vize*0.4+final*0.6). b. Vizesi 50 den küçük olan
	 * öğrencilerin final notlarını ekrana yazdırınız. c. Ortalaması 70 den buyuk
	 * olanlar için ekrana “Geçti”, eşit ve ya kucuk olanlar için “Kaldı”
	 * yazdırınız. d. Vizesi 60-70 arası olup Finali 70 den büyük olan öğrencilerin
	 * notlarını ekrana yazdırınız ve kaç adet olduğunu bulup ekrana yazdırınız.
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] notlar = new int[3][2];

		// a. Her öğrencinin ortalamasını bulup ekrana yazdırınız
		// (ortalama=vize*0.4+final*0.6).

//		for (int i = 0; i <10; i++) {
//			
//			System.out.println("Lütfen  vize ve final notlarini giriniz" + " "+( i + 1) + ":");
//		      notlar[i][0] = scan.nextInt();
//		      notlar[i][1] = scan.nextInt();
//		    
//		}
//		for (int i = 0; i < 10; i++) {
//		      double notOrtalamasi = notlar[i][0] * 0.4 + notlar[i][1] * 0.6;
//		      System.out.println((i + 1) +"Ogrenci " + "'nin not ortalamasi: " + notlar);
//	}
		// b. Vizesi 50 den küçük olan öğrencilerin final notlarını ekrana yazdırınız.

//for (int i = 0; i <10; i++) {
//			
//			System.out.println("Lütfen  vize ve final notlarini giriniz" + " "+( i + 1) + ":");
//		      notlar[i][0] = scan.nextInt();
//		      notlar[i][1] = scan.nextInt();

//}
//for (int i = 0; i < 10; i++) {
//    if (notlar[i][0] < 50) {
//      System.out.println((i + 1) +"Ogrenci " + "'nin final notu: " + notlar[i][1]);

		// c. Ortalaması 70 den buyuk olanlar için ekrana “Geçti”, eşit
		// ve ya kucuk olanlar için “Kaldı” yazdırınız.

		// }

//    for (int i = 0; i <10; i++) {
//		
//		System.out.println("Lütfen  vize ve final notlarini giriniz" + " "+( i + 1) + ":");
//	      notlar[i][0] = scan.nextInt();
//	      notlar[i][1] = scan.nextInt();
//	     
//}
//    for (int i = 0; i < 10; i++) {
//    	
//	      double notOrtalamasi = notlar[i][0] * 0.4 + notlar[i][1] * 0.6;
//         
//	      if(i>70) {
//	    	  System.out.println((i + 1) +"Ogrenci " + "gecti : " + notOrtalamasi);  
//	      }
//	      else {
//	    	  System.out.println("Kaldi");
//	      }
//	      System.out.println();

		// d. Vizesi 60-70 arası olup Finali 70 den büyük olan öğrencilerin notlarını
		// ekrana yazdırınız ve kaç adet olduğunu bulup ekrana yazdırınız.

		int sayac = 0;

		for (int i = 0; i < notlar.length; i++) {

			System.out.println("Lütfen  vize ve final notlarini giriniz" + " " + (i + 1) + ":");
			notlar[i][0] = scan.nextInt();
			notlar[i][1] = scan.nextInt();
		}

		for (int j = 0; j < notlar.length; j++) {

			if (notlar[j][0] < 70 && notlar[j][0] > 60 && notlar[j][1] > 70) {
				System.out.println((j + 1) + " Ogrenci " + "'nin final notu: " + notlar[j][1]);
				sayac++;
				System.out.println();
			}

		}
		System.out.println("Sarti saglayan ogrenci sayisi : " + sayac);
	}
}