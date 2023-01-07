package aliMustafaZengin;


import java.util.Scanner;

public class Odev9_3 {

	public static void main(String[] args) {
//		Kullanicidan; Dersin adi, Vize1 notu, Vize2 notu, Final notu, 3 adet de 
		//sozlu sinav notlarini alin. Bu notlari asagidaki sartlara gore 
		//tek bir method’ ta varargs kullanarak donem sonu not ortalamasi olarak gosteriniz.
//		Sartlar;
//		I.	Vizelerin ortalamasinin %30’ u
//		II.	Final notunun %50’ si
//		III.	Sozlu sinavlarin ortalamasinin %20’ si

		
	name(null, null);
		
	}
	
	public static void name(String ders, double ...a) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dersin adini giriniz");
		String dersAdi=scan.nextLine();
		
		System.out.println("Vize 1 notu giriniz");
		double vize1=scan.nextDouble();
		
		System.out.println("Vize 2 notu giriniz");
		double vize2=scan.nextDouble();
		
		System.out.println("Final notu giriniz");
		double finalNotu=scan.nextDouble();
		
		System.out.println("Sozlu1 notu giriniz");
		double sz1=scan.nextDouble();
		
		System.out.println("Sozlu2 notu giriniz");
		double sz2=scan.nextDouble();
		
		System.out.println("Sozlu3 notu giriniz");
		double sz3=scan.nextDouble();
		
		double notOrtalamasi=((vize1+vize2)/2)*0.30+finalNotu*0.50+((sz1+sz2+sz3)/3)*0.20;
		
		System.out.println(dersAdi+"adli dersin not ortalamasi:"+notOrtalamasi);
		
		
		
	}
	

}
