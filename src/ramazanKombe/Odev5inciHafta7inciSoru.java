package ramazanKombe;

import java.util.Scanner;

public class Odev5inciHafta7inciSoru {

	/*
	 * 7-Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin
	 * 0’a basmasini soyleyin. Kullanici 0’a bastiginda toplam kac pozitif sayi
	 * girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.(do
	 * while dongusu ile)
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Pozitif sayi girin");

		int a = 0;
		int sayac = 0;
		int sayi = 1;
		do {
			sayi = scan.nextInt();

			if (sayi > 0) {
				a = a + sayi;
			}
			sayac++;
		} 
		while (sayi != 0);
		{
			System.out.println("Girilen sayilarin toplami=" + a);
			System.out.println("Girilen sayilarin sayisi= " + sayac);

		}

	}

}
