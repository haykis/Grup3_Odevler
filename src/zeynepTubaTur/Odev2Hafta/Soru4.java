package zeynepTubaTur.Odev2Hafta;

import java.util.Scanner;

public class Soru4 {

	
	public static void main(String[] args ) {  
			
		System.out.println("Gunde kac saat ders calistiginizi giriniz:");
		
		Scanner scan = new Scanner(System.in);
	 
		Long hour = scan.nextLong();
		
		Long second = hour * 60 * 60;
		
		System.out.println("Gundelik calistiginiz " + hour + " saatin "  + second +  " saniyeye cevrildigini onceden hesaplamis miydiniz? ");
		

	
	
	}
}
