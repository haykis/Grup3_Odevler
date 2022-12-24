package aliMustafaZengin;

import java.util.Scanner;

public class Odev5_Soru8 {

	public static void main(String[] args) {
		//Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e ulasincaya kadar
		//sayi istemeye devam edin. Toplam 500’e ulastiginda veya gectiginde
		//sayilarin toplami ve kac sayi girildigini yazdiri (do while dongusu ile)

		
			Scanner scan=new Scanner(System.in);
			System.out.println("Pozitif sayi girin");
			int toplam=0;
			int sayac=0;
			int sayi=1;
			do {
				sayi=scan.nextInt();
				if (sayi > 0) 
				  {
					toplam += sayi;
					sayac++;
				  }
				} 
			while (toplam<=500);
			System.out.println(" Girilen Sayıların Toplamı =" + toplam );
			System.out.println(sayac + " Adet Ssayı Girildi ");
		}

	}


