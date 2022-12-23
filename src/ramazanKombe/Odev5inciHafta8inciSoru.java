package ramazanKombe;

import java.util.Scanner;

public class Odev5inciHafta8inciSoru {

	public static void main(String[] args) {

		/*
		 * Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e ulasincaya
		 * kadar sayi istemeye devam edin. Toplam 500’e ulastiginda veya gectiginde
		 * sayilarin toplami ve kac sayi girildigini yazdirin.(do while dongusu ile)
		 * 
		 */
		int toplam = 0;
		int sayi = 1;
		int sayac = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen sayi giriniz.");

		do {

			sayi = scan.nextInt();

			if (sayi > 0) {

				toplam += sayi;
				sayac++;
			}

		} while (toplam <= 500);
		{
			System.out.println("Girdiginiz sayilari toplami = " + toplam);
			System.out.println("Girdiginiz sayilar   = " + sayac + "tanedir");
		}

	}
}