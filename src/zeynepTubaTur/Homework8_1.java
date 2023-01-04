package zeynepTubaTur;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework8_1 {

	public static void main(String[] args) {

//	Soru1) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir 
//	method yaziniz.
//	 { {1,2,3}, {4,5,6} }

		int carpim = 1;

		int[][] cokBoyutlu = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < cokBoyutlu.length; i++) {

			for (int j = 0; j < cokBoyutlu[0].length; j++) {

				carpim *= cokBoyutlu[i][j];

			}

		}
		System.out.println("Multi dimensional array’in tum elemanlarinin carpimi: " + carpim);

//	 carpim = ( cokBoyutlu[0][0] * cokBoyutlu[0][1] * cokBoyutlu[0][2] *
//			 cokBoyutlu[1][0] * cokBoyutlu[1][1] * cokBoyutlu[1][2] );

		
		
//	Soru2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana 
//	yazdiran bir program yaziniz.
//	{ {1,2,3}, {4,5}, {6} }

		int[][] cokBoyutlu1 = { { 1, 2, 3 }, { 4, 5 }, { 6 } };
		int carpim1 = 1;

		for (int a = 0; a < cokBoyutlu1.length; a++) {

			carpim1 *= cokBoyutlu1[a][cokBoyutlu1[a].length - 1];
		}

		System.out.println("Multi dimensional array’in ic array’lerindeki son elemanlarin carpimi:" + carpim1);

//	 carpim1 = cokBoyutlu1[0][2] * cokBoyutlu1[1][1] * cokBoyutlu1[2][0] ;

		
		
//	 Soru3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin 
//	 toplamini ekrana yazdiran bir program yaziniz. 
//	 arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

		int[][] arr1 = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		int[][] arr2 = { { 10, 11 }, { 7, 8, 9 }, { 12 } };

		int indextop = 0;
		
		for (int a = 0; a < 3; a++) {
			
			for (int b = 0; b < arr1[a].length; b++) {
				
				indextop = 0;

				indextop += arr1[a][b] + arr2[a][b];
				System.out.println(a + " " + b + ".index toplami : " + indextop);
			}
		}

//		sorunun degistirilmemis hali 
//		
//		int[][] arr1 = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
//		int[][] arr2 = { {7,8,9},  {10,11},      {12} };
//		
//		int indextop = 0;
//		
//		System.out.println(arr1[0][0]+ arr2[0][0]);
//		System.out.println(arr1[0][1]+ arr2[0][1]);
//		System.out.println(arr1[1][0]+ arr2[1][0]);
//		System.out.println(arr1[1][1]+ arr2[1][1]);
//		System.out.println(arr1[2][0]+ arr2[2][0]);
//		

//		
//  Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin toplamini birer 
//  birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir 
//  program yaziniz.
//  Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=6  4+5=9  6+7=13==>output:{6,9,13}
//
		int sayilar[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7 } };

		int toplam = 0;

		ArrayList<Integer> yeniDizi = new ArrayList<>();

		for (int i = 0; i < sayilar.length; i++) {

			toplam = 0;

			for (int j = 0; j < sayilar[i].length; j++) {

				toplam += sayilar[i][j];

			}
			yeniDizi.add(toplam);

		}

		System.out.println(yeniDizi);

//			
//			2.Yol
//			
//			int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7}};
//
//			int[] yeni_arr = new int[arr.length];
//
//			for (int i = 0; i < arr.length; i++) {
//				
//			  int total = 0;
//			  for (int j = 0; j < arr[i].length; j++) {
//			    total += arr[i][j];
//			  }
//			  yeni_arr[i] = total;
//			
//			
//			  System.out.println(Arrays.toString(yeni_arr));
//			
//			 
//			  
//  Soru5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin. 

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir cumle giriniz");

		String cumle = scan.nextLine();

		int bosluk;

		String[] yeniArray = cumle.split(" ");

		for (String b : yeniArray) {

			System.out.println(b);
		}

		System.out.println(yeniArray.length);

	}

}
