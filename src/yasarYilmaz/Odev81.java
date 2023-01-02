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
		int[][] diziyazdir = { {1,2,3}, {4,5}, {6} };
		int carp = 1;
		for(int y=0;y<diziyazdir.length;y++)
		{	
			carp *= diziyazdir[y][diziyazdir[y].length-1];
			System.out.println(diziyazdir[y][diziyazdir[y].length-1]);
		}		
		System.out.println("Çarpımları Sonucu = " + carp);
	}
	
	public static void ayniindex()
	{
		int[][] arr1 =  { {1,2}, 
						  {3,4,5}, 
						  {6} } ;
		
		int[][] arr2 =  { {7,8,9}, 
						  {10,11}, 
						  {12} };
		
		int indextop=0;
				
		for (int a=0 ; a<4 ; a++)
		{			
			for (int b=0 ; b<arr1[0].length ; b++)

			{
				indextop = 0;
				System.out.println(arr1[0].length);
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
		for (int y=0; y<3 ; y++)
		{
			
			for (int x=0 ; x<dizim[0].length-1 ; x++)
			{
				System.out.println("y = " + y);
				System.out.println("x = " + x);
				
				satirtop += dizim[y][x]; 
				
			}
			System.out.println(satirtop);
			satirtop = 0;
		}
		
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
	
	public static void main(String[] args) 
	{
//		dizicarpma();
//		diziyaz();
//		ayniindex();
//		indextopla();
//		cumle();
//		stringlist();
		listinteger();
		
		
			
		

	}

}
