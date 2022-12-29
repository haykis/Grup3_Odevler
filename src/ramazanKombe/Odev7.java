package ramazanKombe;

import java.util.Arrays;
import java.util.Scanner;

public class Odev7 {

	// Urunleri alfabetik siralayan bir method olusturma

	public static void alfListeUrunler(String[] urunler) {

		Arrays.sort(urunler);

		System.out.println("Urunler: ");

		System.out.println(Arrays.toString(urunler));

	}

	// 3. indexteki elemani degistirmek icin method

	public static void degisimMethod(String[] urunler, String yeniUrun) {
		
		Arrays.sort(urunler);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yeni bir urun giriniz.");
		urunler[3] = scan.nextLine();
		
		System.out.println(Arrays.toString(urunler));
	}



}
