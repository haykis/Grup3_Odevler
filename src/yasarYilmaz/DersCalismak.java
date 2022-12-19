package yasarYilmaz;

import java.util.Locale;
import java.util.Scanner;

public class DersCalismak {

	  public static void main(String[] args)
	  	{
			/*
			 * String str1 = "Rock"; String str2 = "Star"; //Method 1 : Using concat String
			 * str3 = str1.concat(str2); System.out.println(str3); //Method 2 : Using "+"
			 * operator String str4 = str1 + str2; System.out.println(str4);
			 * 
			 * String str_Sample = "RockStar"; //Length of a String
			 * System.out.println("Length of String: " + str_Sample.length());
			 * 
			 * System.out.println("Character at position 5: " + str_Sample.charAt(5));
			 * //Index of a given character System.out.println("Index of character 'S': " +
			 * str_Sample.indexOf('S'));
			 * 
			 * System.out.println("'ROCKSTAR' İle Karşılaştırın: " +
			 * str_Sample.compareTo("rockstar")); //Karşılaştır - Büyük/küçük harf durumunu
			 * yoksay System.out.
			 * println("'ROCKSTAR' İle Karşılaştır - Büyük/Küçük Harf Yoksayıldı: " +
			 * str_Sample.compareToIgnoreCase("ROCKSTAR"));
			 * 
			 * String myString = "Merhaba dunya"; System.out.println(myString.substring(8,
			 * myString.length()));
			 * 
			 * System.out.println("Kucuk harfler : " + myString.toLowerCase());
			 * System.out.println("Bosluklar yok " + myString.trim()); String[] words =
			 * myString.split(" ");
			 * 
			 * String ad = "ÖZGÜR"; System.out.println("Adınız =" +
			 * ad.toLowerCase(Locale.forLanguageTag("TR")));
			 */
		
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Bir Cümle Giriniz ");
		  String cumle = scan.nextLine();
		  System.out.println("Aranan Kelimeyi Giriniz ");
		  String ara = scan.nextLine();
		  if (cumle.contains(ara)) 
			  System.out.println("Aradığınız " + ara + " Kelimesi Var");
		  else 
			  System.out.println("Aradığınız " + ara + " Kelimesi yoktur");
		  String regex = "";
		  String mesaj = "Merhabalar";
		  mesaj=mesaj.replaceAll(regex,"_");
		  System.out.println(mesaj);
		  
			
		
		}
		}


