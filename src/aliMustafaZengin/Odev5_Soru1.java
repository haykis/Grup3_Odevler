package aliMustafaZengin;

import java.util.Scanner;

public class Odev5_Soru1 {

	public static void main(String[] args) {
		/*1)Kullanicidan e mail hesabini girmesini isteyiniz.
		 *  Bu e mail’ i olusturacaginiz method' a arguman olarak gonderip
		 *   asagidaki kurallara gore e mail kontrolu yapiniz.
		   
		
		-@ isareti icermiyorsa “gecersiz email” yazdirin
		-@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin
		-@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz” yazdirin.

*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen e mail adresinizi girin");	
		String stra=scan.nextLine();
		
		mailKontrol(stra);
		
		
	}
		public static void mailKontrol(String stra) {
			
			
			
			if(!stra.contains("@")) {
				System.out.println("gecersiz email");}
			else if(!stra.contains("@gmail")) { 
				System.out.println("lutfen gmail adresinizi girin");}
			else if(!stra.contains("@gmail.com")) {
				System.out.println("Yazimda bir sorun var, maili kontrol ediniz");}
			else {
				System.out.println("Yazim Dogru");}
			
			
			
		
	}


}