package zeynepTubaTur.Odev2Hafta;

import java.util.Scanner;

public class Soru5 {
	
	
	public static void main (String []args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz: ");
		
		int a = scan.nextInt();
		
		int kareninCevresi = 4 * a ;
		
		int kareninAlani = a * a ;
		
		System.out.println("Bir kenar uzunlugunu " + a + " olarak girdiginiz,    \n Karenin Cevresi: " + kareninCevresi + " olarak hesaplandi. " + "\n Karenin Alani: " + kareninAlani + " olarak hesaplandi." );
					
		
	}

}

// karenin cevresi : 4a  (kenar uzunlugu a)

// karenin alani : a*a 