package ramazanKombe;

import java.util.Arrays;
import java.util.Scanner;

public class Odev7Urunler {

	 public static void main(String []args) {
	
 Scanner scan = new Scanner(System.in);
 
 System.out.println("Tebrikler 5 adet ücretsiz ürün kazandiniz!!!" 
			+"\nLütfen istediginiz ürünlerin ismini giriniz.");
 System.out.println("Birinci urunu giriniz");
 String urun1 = scan.nextLine();
 System.out.println("Ikinci urunu giriniz");
 String urun2 = scan.nextLine();
 System.out.println("ucuncu urunu giriniz");
 String urun3 = scan.nextLine();
 System.out.println("Dorduncu urunu giriniz");
 String urun4 = scan.nextLine();
 System.out.println("Besinci urunu giriniz");
 String urun5 = scan.nextLine();

 
 Odev7Islem obje = new Odev7Islem();
 
 
 String arr[]= obje.Odev7Islem(urun1,urun2,urun3,urun4,urun5);
 
 System.out.println(Arrays.toString(arr));
	
	
Arrays.sort(arr);

 
 System.out.println(Arrays.toString(arr));
 
 System.out.println("Yeni bir urun giriniz.");
 
 arr[2]= scan.nextLine();

 Arrays.binarySearch(arr,arr[2]= scan.nextLine());
 
 System.out.println(Arrays.toString(arr));
 
 int a = Arrays.binarySearch(arr,"Yeni urun");
 if(a<0) {
	 System.out.println("Urununuz listeye eklenmemistir.");
 }
 else {
	 System.out.println("Urun listeye eklenmistir.");
 
 }
}
}