package zeynepTubaTur;

import java.util.ArrayList;
import java.util.List;

public class Homework8_3 {

	public static void main(String[] args) {

//		Soru 1:
//		Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop 
//		kullanarak bulunuz. Sonucu ekrana yazdiriniz.

		Integer[] sayilar = { 1, 2, 3, 4, 5 };

		int carpim = 1;

		for (Integer a : sayilar) {

			carpim *= a;

		}

		System.out.println(carpim);

		
//		Soru 2:
//		Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each loop 
//		kullanarak bulunuz. Sonucu ekrana yazdiriniz.

		List<Integer> kareler = new ArrayList<>();
		kareler.add(1);
		kareler.add(3);
		kareler.add(5);

		int toplam = 0;

		for (int b : kareler) {

			int kare = b * b;

			toplam += kare;

		}

		System.out.println(toplam);

	}

}
