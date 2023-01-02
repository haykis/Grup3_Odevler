package aliMustafaZengin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Odev8_3 {

	public static void main(String[] args) {

//		Soru 1:
//			Bir integer array olusturunuz ve bu array’deki tum sayilarin
		//carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

		int [] new1= {2,4,6,8};
		int multi=1;
		for (int w : new1) {
			multi=multi*w;
		}
		System.out.println(multi);//384
		
		
//			Soru 2:
//			Bir integer list olusturunuz ve bu list’deki tum sayilarin
		//karesinin toplamini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
           
		List<Integer> yeni=new ArrayList<Integer>();
		yeni.add(3);
		yeni.add(4);
		yeni.add(5);
		System.out.println(yeni);//[3, 4, 5]
		int sum=0;
		for (Integer w : yeni) {
			sum=sum+(w*w);
		}
		System.out.println(sum);//50
		
		
//			Soru 3:
//			iki String array olusturunuz ve bu array’lerdeki ortak elemanlari
		//For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
//			Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz.
		
	String [] arr1= {"Ali", "Veli","Deli"};
	String [] arr2= {"Ahmet", "Can", "Deli","Ali"};
		
		for (String w : arr1) {
			for (String k : arr2) {
				
			if(w.equalsIgnoreCase(k)){
				System.out.println(w);
			}
			else {
				System.out.println("Ortak Eleman Yok");
			}
			
		}}
		
	
//
//			Soru 4:
//			Bir String olusturunuz, bu String’deki character’leri
		//for-each loop kullanarak yazdiriniz. ipucu: split()
		
	String cow="Mustafa";
	
	
	String [] ass= cow.split("");
	System.out.println(Arrays.toString(ass));//[M, u, s, t, a, f, a]
for (String string : ass) {
		System.out.println(string);
	}
	System.out.println(" ");
	

}
}