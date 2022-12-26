package aliMustafaZengin;

import java.util.Scanner;

public class Odev5_Soru4 {

	public static void main(String[] args) {
		//Kullanıcıdan aldıgınız 5 basamaklı sayının rakamlarının 
		//toplamını yazdıran programi for döngüsü ile yazınız.
		Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen bir 5 basamakli sayi girin: ");
        int sayi = scan.nextInt();

        int toplam = 0;
        for (int i = 0; i < 5; i++) {
            toplam += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Rakamlar toplami: " + toplam+"dir");
	}

}
