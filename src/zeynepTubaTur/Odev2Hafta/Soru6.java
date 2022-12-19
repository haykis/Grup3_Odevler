package zeynepTubaTur.Odev2Hafta;

import java.util.Scanner;

public class Soru6 {
	
	
	public static void main(String [] args) {
		
    Scanner scan = new Scanner (System.in);
		
    System.out.println("Lutfen dikdortgenler prizmasinin uzun kenarini giriniz: ");
    
    int a = scan.nextInt();
    
    System.out.println("Lutfen dikdortgenler prizmasinin kisa kenarini giriniz: ");
    
    int b = scan.nextInt();
    
    System.out.println("Lutfen dikdortgenler prizmasinin yuksekligini giriniz: ");
    
    int h = scan.nextInt();
    
    int hacim = a * b * h ;
    
    System.out.println("Dikdortgenler Prizmasinin Hacmi: " + hacim );
    	
		
	}
}









//   uzun kenar * kisa kenar *yukseklik