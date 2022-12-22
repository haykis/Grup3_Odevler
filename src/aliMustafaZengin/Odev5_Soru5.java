package aliMustafaZengin;

import java.util.Scanner;

public class Odev5_Soru5 {

	public static void main(String[] args) {
		
		//Kullanicidan baslangic ve bitis degerlerini alin.
		//Baslangic degeri ve bitis degeri dahil aradalarindaki  tum cift tamsayilari 
		//while loop kullanarak ekrana yazdiriniz.

		Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen bir  sayi girin ");
        int sayi1 = scan.nextInt();
        
        System.out.print("Lutfen  baska bir sayi girin ");
        int sayi2 = scan.nextInt();
        
        while (sayi1 <=sayi2) {
			if (sayi1 % 2 == 0) {
				
			
			sayi1=sayi1+2;
			   System.out.println(sayi1); 
			}
			   else   {
				
			
			sayi1=sayi1+1;
			   System.out.println(sayi1); 
			   }
        
        
	}

       
}
}
