package ramazanKombe;

import java.util.Scanner;

public class Odev5inciHafta6inciSoru {

	public Odev5inciHafta6inciSoru() {

	}

	public static void main(String[] args) {
		/*
		 * 6) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac
		 * tane olduklarini ekranda yazdirin.(while dongusu ile)
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayi giriniz");

		int bolunenSayi = scan.nextInt();

		int bolen = 1;

		int sayac = 0;
		
		while (bolunenSayi >= bolen) {

			if (bolunenSayi % 2 == 0) {
				System.out.println(bolen++);
				
				sayac++;
			}

			bolen++;
		}

	}

}
