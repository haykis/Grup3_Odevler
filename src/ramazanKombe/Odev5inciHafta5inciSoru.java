package ramazanKombe;

import java.util.Scanner;

public class Odev5inciHafta5inciSoru {

	public Odev5inciHafta5inciSoru() {

		
		/* Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis 
		 degeri dahil aradalarindaki tum cift tamsayilari while loop kullanarak 
		 ekrana yazdiriniz.
	*/
	}

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		System.out.print("Başlangıç değerini girin: ");
		int baslangic = scann.nextInt();
		System.out.print("Bitiş değerini girin: ");
		int bitis = scann.nextInt();

		while (baslangic <= bitis) {
			if (baslangic % 2 == 0) {
				System.out.println(baslangic);
			}
			baslangic++;
		}
	}

}
