package ramazanKombe;

public class Odev8Soru1 {


		/*
		 * Soru1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini
		 ekrana yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} } 
		 
		 *Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin 
		 carpimini ekrana yazdiran bir program yaziniz. { {1,2,3}, {4,5}, {6} } 
		 
		 * Soru 3)Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
		 elemanlarin toplamini ekrana yazdiran bir program yaziniz. arr1 = { {1,2},
		 {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} } 
		 
		 * Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin 
		  toplamini birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan 
		  ve yeni array’I ekrana yazdiran bir program yaziniz.
		  Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=64+5=96+7=13==>output:{6,9,13}
		  
		  Soru5)Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.
		 */
		
	public static void main(String[]args) {
		
		

	
		int[][] array = {{1,2,3}, {4,5,6}};//1.
		int sonuc = arrayCarpma(array);
		System.out.println("Tüm elemanlarin carpimi = "  + sonuc);
		
		
		int[][] array1 = {{1,2,3}, {4,5}, {6}}; //2.
		int sonuc1 = sonEleman(array);
		System.out.println("Son elemanlarin carpimi = "  + sonuc1);
		
		
		
		
		int[][] arr1 = { {1,2}, {3,4,5}, {6} }; //3
		int[][] arr2 = { {7,8,9}, {10,11}, {12} };

		int sonuc2 = ayniIndxTop(array);
	
		
		//1.Soru
		
}
	
	public static int arrayCarpma(int[][] arr) {
	    int carpim = 1;
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {
	            carpim *= arr[i][j];
	        }
	    }
	    return carpim;
	}

	
	//2.Soru
	
	public static int sonEleman(int[][] arr) {
		
		int carpim = 1;
	    int lastIndex = arr.length - 1;
	    for (int i = 0; i < arr[lastIndex].length; i++) {
	        carpim *= arr[lastIndex][i];
	    }
	    return  carpim;
	}
	
	//3. Soru
	
	
	public static int ayniIndxTop(int [][]arr) {
		
		
		int[][] arr1 = { {1,2}, {3,4,5}, {6} }; 
		int[][] arr2 = { {7,8,9}, {10,11}, {12} };
		
		int indexUzunluk  = (arr1.length < arr2.length) ? arr1.length : arr2.length;
		
		for (int i = 0; i < indexUzunluk ; i++) {
            
			
        int uzunluk  = (arr1[i].length < arr2[i].length) ? arr1[i].length : arr2[i].length;
            
            
            for (int j = 0; j < indexUzunluk ; j++) {
                int sonuc2= arr1[i][j] + arr2[i][j];
                
                System.out.println(arr1[i][j] + " + " + arr2[i][j] + " = " +sonuc2); 
            }
            return indexUzunluk;
}
		return indexUzunluk;
		
	}



}
