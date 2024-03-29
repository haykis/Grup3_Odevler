package zeynepTubaTur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework8_2 {

	public static void main(String[] args) {

//		1)Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz

		List<String> harfler = new ArrayList<>();

		harfler.add("A");
		harfler.add("C");
		harfler.add("E");
		harfler.add("F");

		System.out.println(harfler);

//	     2)indexsiz add() methodunu kullanarak, B’yi ekleyiniz.

		harfler.add("B");

//	     index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.

		harfler.add(1, "L");

//	     ArrayList’i ekrana yazdiriniz, list soyle olmali; A, L, C, E, F, B.

		System.out.println(harfler);

//	 	 3)set() methodu kullanarak, E’yi D yapiniz.
//	 	 ArrayList’i ekrana yazdiriniz, list soyle olmali; A, L, C, D, F, B

		harfler.set(3, "D");
		
		System.out.println(harfler);

//	    4)remove() methodu kullanarak, F’yi siliniz.
//	    ArrayList’i ekrana yazdiriniz, list soyle olmali; A, L, C, D, B

		harfler.remove(4);
		
		System.out.println(harfler);

//	    5)sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
//	    ArrayList’i ekrana yazdiriniz, list soyle olmali; A, B, C, D, L

		Collections.sort(harfler);
		
		System.out.println(harfler);

//	    6)contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var 
//	    olmadigini dogrulayiniz

		System.out.println(harfler.contains("L")); // true

		System.out.println(harfler.contains("M")); // false

//	    7)size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.

		System.out.println(harfler.size());

//	    8)clear() methodu kullanarak, list’deki tum elemanlari siliniz.

		harfler.clear();

//	    9)isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz.

		System.out.println(harfler.isEmpty());

	}

}
