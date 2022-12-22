package aliMustafaZengin;

import java.util.Scanner;

public class Odev5_Soru9 {

	public static void main(String[] args) {
		
//Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim tablosu olusturun.
		//Ornek,kullanici 3 girerse,
		//1 2 3
		//2 4 6
		//3 6 9
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi=scan.nextInt();
		int carpim=1;
		for (int i = 1; i <=sayi; i++) {
			for (int j = 1; j <=sayi; j++) {
		
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		

	}

}
