package ramazanKombe;

import java.util.Scanner;

public class Odev5inciHafta4uncuSoru {

	public Odev5inciHafta4uncuSoru() {
	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen bir 5 basamakli sayi girin: ");
        int sayi = sc.nextInt();

        int toplam = 0;
        for (int i = 0; i < 5; i++) {
            toplam += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Rakamlar toplami: " + toplam);
	}

}
