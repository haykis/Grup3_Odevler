package aliMustafaZengin;

import java.util.Scanner;

public class Odev5_Soru3 {

	public static void main(String[] args) {
	
	/*	Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin.
	 *  integer donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun.
	 *   Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin.
	 *    Islemin sonucunu main method’ dan verilen komutla yazdirin.
		
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir Sayi Girin");
		int x=scan.nextInt();
		
		System.out.println("Sayinin Kacinci Kuvvetini Istersiniz girin");
		int y=scan.nextInt();
		
		
	int deger=usAlmaMethodu(x, y);
	System.out.println(deger);
		
		
		
		

	}
	
	public static int usAlmaMethodu(int x , int y) {
		
	int sonuc=1;
		for (int i = 1; i <= y; i++) {
            sonuc *= x;
        }
		return sonuc;
		
		
		//int sonuc=(int)Math.pow(x, y);
        //return sonuc;
		
		
 		
	}

}
