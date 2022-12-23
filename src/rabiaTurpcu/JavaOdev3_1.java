package rabiaTurpcu;

import java.util.Scanner;

public class JavaOdev3_1 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz");
		
		int bir = scan.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz");
		
		int iki = scan.nextInt();
		
		System.out.println("Ucuncu sayiyi giriniz");
		
		int uc = scan.nextInt();
		
		if(bir>iki && bir>uc) {
			System.out.println(bir + " . Birinci sayi girilen en buyuk sayidir");
		}
		
		else if(iki>bir && iki>uc) {
			System.out.println(iki + " . Ikinci sayi girilen en buyuk sayidir");
			
		}
		
		else  {
			System.out.println(uc + " . Ucuncu sayi girilen en buyuk sayidir");
		}
		

}}
