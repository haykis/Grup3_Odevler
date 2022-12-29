package ramazanKombe;

import java.util.Arrays;
import java.util.Scanner;

public class Odev7_1 {

	
 
//	public String myMethod() {
//		return null;}
//	
//	
//	 public String urun1;
//	 public String urun2;
//	 public String urun3;
//	 public String urun4;
//	 public String urun5;
	 
	 public static void main(String []args) {
		 // kullanicidan urunleri almak icin array olusturma
 String urunler [] = new String [5];
 Scanner scan = new Scanner(System.in);
 
 System.out.println("Tebrikler 5 adet ücretsiz ürün kazandiniz!!!" 
			+"\nLütfen istediginiz ürünlerin ismini giriniz.");
 
 for(int i=0; i<5; i++) {
	 urunler[i] = scan.nextLine();
	 
 }
//urunleri listeleyen methodu cagir

 Odev7.alfListeUrunler(urunler);
 
 String yeniUrun = scan.nextLine();
 
 Odev7.degisimMethod(urunler, yeniUrun);
 


 
 
}
}