package ramazanKombe;

import java.util.Scanner;

public class Odev5inciHafta9uncuSoru {

	public Odev5inciHafta9uncuSoru() {
		
	}

	public static void main(String[] args) {
		/*Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore 
		carpim tablosu olusturun. Ornek,kullanici 3 girerse,
		1 2 3
		2 4 6
		3 6 9
		(ic ice for ile) [Zor seviye – Yapamazsaniz onemli deil.]
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen rakam giriniz.");
		int sayi = scan.nextInt();
		int carpim = 1;
		
		for(int a=1; a<= sayi; a++) {
			
			for(int b=1; b<=sayi;b++) {
				System.out.print(a*b+" ");
			}
			
			System.out.print("\n");
			
		
		}
			
		
	}
		
		
}


