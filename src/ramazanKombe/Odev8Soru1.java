package ramazanKombe;

import java.util.Arrays;
import java.util.Scanner;

public class Odev8Soru1 {

//
//		/*
//		 * Soru1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini
//		 ekrana yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} } 
//		 
//		 *Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin 
//		 carpimini ekrana yazdiran bir program yaziniz. { {1,2,3}, {4,5}, {6} } 
//		 
//		 * Soru 3)Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
//		 elemanlarin toplamini ekrana yazdiran bir program yaziniz. arr1 = { {1,2},
//		 {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} } 
//		 
//		 * Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin 
//		  toplamini birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan 
//		  ve yeni array’I ekrana yazdiran bir program yaziniz.
//		  Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=64+5=96+7=13==>output:{6,9,13}
//		  
//		  Soru5)Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.
//		 */
//		
//	private static final long[] yeni_arr = null;
//
	public static void main(String[]args) {
		
		
		
		String[] arr1 = {"elma", "muz", "kiraz"};
		String[] arr2 = {"elma", "armut", "cilek"};

		boolean sonuc = false;

		for (String str1 : arr1) {
		  for (String str2 : arr2) {
		    if (str1.equals(str2)) {
		      System.out.println("ortak eleman: " + str1);
		      sonuc = true;
		      break;
		    }
		  }
		}

		if (!sonuc) {
		  System.out.println("ortak eleman yok");
		}

		
		
		
		
		
		
		
		
		
		
		
//		
//		Scanner scanner = new Scanner(System.in);//5
//
//		System.out.print("Bir cumle giriniz: ");
//		String sentence = scanner.nextLine();
//
//		String[] words = sentence.split("\\s+");
//
//		System.out.println("Girdiginiz cumlenin eleman sayisi: " + words.length);
//		
//		
//	
//		int[][] array = {{1,2,3}, {4,5,6}};//1.
//		int sonuc = arrayCarpma(array);
//		System.out.println("Tüm elemanlarin carpimi = "  + sonuc);
//		
//		
//		int[][] array1 = {{1,2,3}, {4,5}, {6}}; //2.
//		int sonuc1 = sonEleman(array);
//		System.out.println("Son elemanlarin carpimi = "  + sonuc1);
//		
//		
//		
//		
////		int[][] arr1 = { {1,2}, {3,4,5}, {6} }; //3
////		int[][] arr2 = { {10,11}, {7,8,9},{12} };
////
////		int sonuc2 = ayniIndxTop(array);
//		
//		
//		//4
//		int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7}};
//		int total = 0;
//		int sonuc4 = elemanToplami(array);
//		
//		//System.out.println(Arrays.toString(yeni_arr);
////	
//		
//		//1.Soru
//		
//}
//	
//	private static int elemanToplami(int[][] array) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//	public static int arrayCarpma(int[][] arr) {
//	    int carpim = 1;
//	    for (int i = 0; i < arr.length; i++) {
//	        for (int j = 0; j < arr[i].length; j++) {
//	            carpim *= arr[i][j];
//	        }
//	    }
//	    return carpim;
//	}
//
//	
//	//2.Soru
//	
//	public static int sonEleman(int[][] arr) {
//		
//		int carpim = 1;
//		int lastIndex = arr.length - 1;
//	    for (int i = 0; i < arr.length; i++) {
//	        carpim *= arr[i][lastIndex];
//	    }
//	    return  carpim;
//	}
//	
//	//3. Soru
//	
//	
////	public static int ayniIndxTop(int [][]arr) {
////		
////		
////		int[][] arr1 = { {1,2}, {3,4,5}, {6} }; 
////		int[][] arr2 = { {10,11},{7,8,9},{12} };
////		
////		int indexUzunluk  = (arr1.length < arr2.length) ? arr1.length : arr2.length;
////		
////		for (int i = 0; i < indexUzunluk; i++) {
////            
////            for (int j = 0; j < indexUzunluk ; j++) {
////            	
////                int sonuc2= arr1[i][j] + arr2[i][j];
////                
////                System.out.println(arr1[i][j] + " + " + arr2[i][j] + " = " + sonuc2); 
////            }
////           
////}
////		return indexUzunluk;
//		
//	//}
//	
//	
//	
//	public static void elemanToplami(){
//		int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7}};  //4
//
//		int[] yeni_arr = new int[arr.length];
//
//		for (int i = 0; i < arr.length; i++) {
//			
//		  int total = 0;
//		  for (int j = 0; j < arr[i].length; j++) {
//		   int sonuc4 = total += arr[i][j];
//		  }
//		  yeni_arr[i] = total;
//		
//		
//		  System.out.println(Arrays.toString(yeni_arr));
//		
//		}
//
//		
}

}
