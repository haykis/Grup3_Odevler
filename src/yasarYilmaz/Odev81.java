package yasarYilmaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Odev81 {
	
	
	
/*
	
*/	
	public static void dizicarpma()
	{
		int[][] dizicarp = {{1,2,3},{4,5,6}};
		for(int y=0;y<3;y++)
			System.out.println("Diz elemanlarının Çarpımı = " +
								dizicarp[0][y] * dizicarp[1][y]);
	}
	
	public static void diziyaz()
	{
		int[][] diziyazdir = { {1,2,3}, {4,5}, {6} ,{3,2},{4,7,9,8}};
		int carp = 1;
		for(int y=0;y<diziyazdir.length;y++)
		{	
			int koor =diziyazdir[y].length-1;
			carp *= diziyazdir[y][koor];
			System.out.println(carp);    //diziyazdir[y][diziyazdir[y].length-1]);
		}		
		System.out.println("Çarpımları Sonucu = " + carp);
	}
	
	public static void ayniindex()
	{
		int[][] arr1 =  { {1,2,4,3}, 
						  {3,4,5}, 
						  {6,8} } ;
		
		int[][] arr2 =  { {10,11},
						  {7,8,9},
						  {12} };
		
		int indextop=0;
		
		int ctrl=0;		
		for (int a=0 ; a<3 ; a++)
		{			
			int knta = arr1[a].length;
			int kntb = arr2[a].length;
			
			if (knta>kntb) ctrl= arr1[a].length;
					else ctrl= arr2[a].length;
			for (int b=0 ; b<ctrl-1 ; b++)

			{
				indextop = 0;
//				System.out.println(arr1[0].length);
				indextop += arr1[a][b] + arr2[a][b];
				System.out.println(a + " " + b + ". indis Toplamı = " + indextop);
			}
		}
		
//		for(int y=0;y<arr1.length;y++)
//		{	
//			for (int x=0;x<arr1[y].length;x++)
//			{
//				System.out.println(arr1.length);
//				System.out.println(" y = " +arr1[y][arr1[y].length-1]);
//				System.out.println(" x = " + x);
//				System.out.println("arr1 = " + arr1[y][arr1[y].length-1] + "  ");
//				System.out.println("arr2 = " + arr2[y][x] +  "  ");
//			}
//			
//			
//		}
	}
		
	public static void indextopla()

	{
		int[][] dizim = {{1,2,3},{4,5},{6,7}};
		int satirtop = 0;
		int[] yenidizi = new int[dizim.length];
		for (int y=0; y<3 ; y++)
		{
			satirtop=0;
			for (int x=0 ; x<dizim[y].length ; x++)
			{
				System.out.println("y = " + y);
				System.out.println("x = " + x);
				
				satirtop += dizim[y][x]; 
				yenidizi[y] = satirtop;
				
			}
			System.out.print(satirtop + "  ");
			
			satirtop = 0;
		}
		System.out.println();
		for (int s:yenidizi)
			System.out.print(s + "   ");
		
	}
	
	public static void cumle()
	{
		Scanner scan = new Scanner(System.in);
		int bosluk = 0;
		System.out.println("Bir Cümle Giriniz ");
		String cumle = scan.nextLine();
		for (int say=0 ; say<cumle.length(); say++)
		{
			char ch=cumle.charAt(say);
			if (ch == ' ') bosluk++;
			
			
		}   
		
		System.out.println("Boşluk Sayısı = " + bosluk);
	}
	
	public static void stringlist()
	{
		 	boolean l,m;
			ArrayList<String> word = new ArrayList<String>();
		    word.add("A");
		    word.add("C");
		    word.add("E");
		    word.add("F");
		    for (int i = 0; i < word.size(); i++) 
		      System.out.print(word.get(i) + " ");
		    System.out.println();
		    word.add("B");
		    word.add(0,"L");
		    word.set(2, "D");
		    for (String i : word) 
		        System.out.print(i);
		    word.remove("F");
		    System.out.println();
		    for (String i : word) 
		        System.out.print(i);
		    System.out.println();
		    Collections.sort(word);
		    word.sort(null);
		    l=word.contains("L");
		    m=word.contains("M");
		    if (l) System.out.println("Word dizisinde L harfi var");
		    if (!m) System.out.println("Word dizisinde M harfi yok");
		    System.out.println("Word Dizisinin eleman Sayısı = " + word.size());
		    word.clear();
		    if(word.isEmpty()) System.out.println("Word Listesi Boşaltılmıştır");
	}
	
	public static void listinteger()
	{
		List<Integer> digit = new ArrayList<>();
		digit.add(5);
		digit.add(3);
		digit.add(7);
		digit.add(9);
		digit.add(2);
		for(int a:digit) System.out.println(digit);
	}
	
	public static void dizicarp()
	{
		List<Integer> digit = new ArrayList<>();
		digit.add(1);
		digit.add(2);
		digit.add(1);
		digit.add(1);
		digit.add(2);
		int carp = 1;
		int kare = 1;
		int karetop = 0;
		
		for(int dig:digit)
		{
			kare = dig * dig;
			carp *= dig;
			karetop += kare;
		}
		System.out.println("dizideki Sayıların Çarpımı = " + carp +
				   "\nSayıların Karelerinin Toplamı = " + karetop);
	}

	public static void ortakeleman()
	{
		List<String> ad1 = new ArrayList<>();
		List<String> ad2 = new ArrayList<>();
		int sayac = 0;
		ad1.add("Yasar"); ad1.add("Yahya"); ad1.add("Yasin");
		ad2.add("Yaşar"); ad2.add("Yahya");	ad2.add("Yasiin");
		for(String ad:ad1)
			for(String add:ad2)
				if(ad.equals(add)) 
				{
					sayac++;
					System.out.println(add);
				}
		if(sayac == 0) System.out.println("Ortak eleman Yoktur");
	}
	
	public static void karekterler()
	{
	
		
		String mesaj = "Java Tester Kursumuz Bize Gelecekte Güzel İmkanlar Sağlayacaktır";
		String[] str = mesaj.split("");
		for(String chr : str) 
		System.out.println(chr);
		System.out.println(" ");

		
	}	
		
		
	
	
	
	public static void main(String[] args) 
	{
//		dizicarpma();
//		diziyaz();
//		ayniindex();
//		indextopla();
//		cumle();
//		stringlist();
//		listinteger();
//		dizicarp();
//		ortakeleman();
		karekterler();
		
		
		
		
		
			
		

	}

}
