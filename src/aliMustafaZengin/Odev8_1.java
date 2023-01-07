package aliMustafaZengin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Odev8_1 {

	public static void main(String[] args) {
		
//		Soru1 ) Asagidaki multi dimensional array’in tum
		//elemanlarinin carpimini ekrana yazdiran bir 
//	method yaziniz.
//	 { {1,2,3}, {4,5,6} }
		
		int arr[][]={ {1,2,3}, {4,5,6} };
		int multiple=1;
		for (int[] w : arr) {
			for (int k : w) {
				multiple=multiple*k;
			}
			
		}
		System.out.println(multiple); //720
		
//	Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki
		//son elemanlarin carpimini ekrana 
//	yazdiran bir program yaziniz.
//	{ {1,2,3}, {4,5}, {6} }
		int[][] diziyazdir = { {1,2,3}, {4,5}, {6} };
		int carp = 1;
		for(int y=0;y<diziyazdir.length;y++)
		{	
			carp *= diziyazdir[y][diziyazdir[y].length-1];
			System.out.println(diziyazdir[y][diziyazdir[y].length-1]);
		}		
		System.out.println("Çarpımları Sonucu = " + carp);//90

		
		
		
		
//	Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde
	//ayni index’e sahip elemanlarin 
//	toplamini ekrana yazdiran bir program yaziniz. 
//	arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8}, {10,11,12}, {12} }
		
		int [][] arr11= { {1,2}, {3,4,5}, {6} };
		int [][] arr22={ {7,8}, {10,11,12}, {12} };
		
		int topla=0;
	for (int i = 0; i < arr22.length; i++) {
		for (int j = 0; j <arr11[i].length; j++) {
			topla=topla+arr22[i][j]+arr11[i][j];
		}
		
	}
	System.out.println(topla);//81
	
//	Soru4) Asagidaki multidimensional array’in ic array’lerindeki
	//tum elemanlarin toplamini birer 
//	birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve 
	//yeni array’I ekrana yazdiran bir 
//	program yaziniz.
//	Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=6 4+5=9 6+7=13==>output:{6,9,13}
	
	int sayilar [][] = {{1,2,3}, {4,5}, {6,7}};
	
	int toplam=0;
	
	ArrayList<Integer> yeniDizi = new ArrayList<Integer>();
	
	
	
	for(int i=0; i<sayilar.length; i++) {
		toplam=0;
		for(int j=0; j<sayilar[i].length; j++) {
			
			toplam += sayilar[i][j];	
		}
	    
		yeniDizi.add(toplam);

		}
		
	System.out.println(yeniDizi);//[6, 9, 13]


//	Soru5)Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

	String str1="Java ogrenmek kolay";
	
	String [] dizi= str1.split(" ");
	System.out.println(Arrays.toString(dizi));//[Java, ogrenmek, kolay]
	System.out.println(dizi.length);//3
	
	
	
	
	
	}

}
