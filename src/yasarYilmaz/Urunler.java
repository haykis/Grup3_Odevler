package yasarYilmaz;

import java.util.Arrays;
import java.util.Scanner;


public class Urunler
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("5 Tane Ürün Almaya Hak Kazandınız. İstediğiniz Ürünleri Giriniz");
		System.out.println("Bırıncı urunu gırınız?");
		String birinciUrun = scan.nextLine();
		System.out.println("Ikinci urunu gırınız?");
		String ikinciUrun = scan.nextLine();
		System.out.println("Ucuncu urunu gırınız?");
		String ucuncuUrun = scan.nextLine();
		System.out.println("Dorduncu urunu gırınız?");
		String dorduncuUrun = scan.nextLine();
		System.out.println("Besincı urunu gırınız?");
		String besinciUrun = scan.nextLine();
		
		
		Liste liste = new Liste();
		
		String arr1[] = liste.Listeleme(birinciUrun,ikinciUrun,ucuncuUrun,dorduncuUrun,besinciUrun);
		
		System.out.println(Arrays.toString(arr1));
		
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		arr1[2]="Laptop";
		System.out.println(Arrays.toString(arr1));
		
		int a=Arrays.binarySearch(arr1, "Laptop");
		if (a<0) 
		{
			System.out.println("Aradiginiz urun eklenmedi");
		}
		else 
		{
			System.out.println("Tebrikler aradiginiz urun mevcut "+(a+1)+".sirada");
		}
		
		
	}
		
}