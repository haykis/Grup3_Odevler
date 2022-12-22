package aliMustafaZengin;

import java.util.Scanner;

public class Odev5_Soru6 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
		//olduklarini ekranda yazdirin.
		//(while dongusu ile)
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir  sayi girin ");
        int sayi1 = scan.nextInt();
        
      for (int i = 1; i <=sayi1; i++) {
    	  
    	  if(sayi1%i==0) {
    		  System.out.print(i+" ");
		
	}
        	
        }

	}

}
