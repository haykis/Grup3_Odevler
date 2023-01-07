package aliMustafaZengin;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Odev9_2 {

	public static void main(String[] args) {
	
//		Kullanicidan dogum tarihini isteyin ve yasini; 
//		a)	Gun, ay, yil olarak yasHesapla() static void metodu’ nda, 
//		b)	Sade ay olarak ay() non-static void metodu’ nda,
//		c)	Sadece gun olarak gun() non-static String donuslu method’ unda,
//		hesaplayiniz.

		 Scanner scan=new Scanner(System.in);
		 System.out.println("Yıl girin");
		 
		 int yil = scan.nextInt();
		 System.out.println("Ay girin");
		 int ay = scan.nextInt();
		 System.out.println("Gun girin");
		 int gun = scan.nextInt();
		 
		 
	   yasHesapla(yil, gun, ay);
	   
	  // ay(ay);
	   
	  // gun(gun);
	   
	   
	     
	}
	public static void yasHesapla(int yil,int gun ,int ay) {
		
		
		LocalDate dogumTarihi=LocalDate.of(yil, gun, ay);
	     System.out.println("Dogum Tarihiniz:"+dogumTarihi);//Dogum Tarihiniz:2022-02-03

	     
	     
	}
public int ay(int ay) {
	
	Odev9_2 obj1=new Odev9_2();
	
	return ay;
	
	
	
}
public String gun(String gun ) {
	Odev9_2 obj2=new Odev9_2();
	
	return gun;
	
	
}
         
	 
	}
	


