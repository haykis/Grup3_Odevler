package yasarYilmaz;

import java.util.Scanner;

public class Odev3HaftaCevaplar {

	public static void main(String[] args) {

		/*		
		 Scanner verigir = new Scanner(System.in);

	        System.out.println("Girilen 3 Sayıdan En Büyüğünü Bulan program. \n 3 Adet Sayi Giriniz ");
	        int num1 = verigir.nextInt();
	        int num2 = verigir.nextInt();
	        int num3 = verigir.nextInt();
	     if ((num1>num2) && (num1>num3)) {
	    	 System.out.println("En Büyük Sayı = " + num1);
	     }
	     else if ((num2>num1) && (num2>num3)) {
	    	 System.out.println("En Büyük Sayı = " + num2);
	     }
	     else System.out.println("En Büyük Sayı = " + num3);

		 */

		// ************************************************************************************		 

		/*
		 Scanner getday = new Scanner(System.in);

			System.out.println("Haftanın  Bir Gününü Giriniz.");
			String day = getday.nextLine();
System.out.println(day.equals("cumartesi")||day.equals("pazar") ? 
( day.equals("cumartesi") ? "cumartesi ve haftasonu":(day.equals("pazar") ? "pazar ve haftasonu": "haftaiçi")) : "haftaiçi" );

		 */
		//************************************************************************************		 

		/*
		 Scanner getday = new Scanner(System.in);
		 System.out.println("Haftanın Günlerinden İlk Harfi Girilenleri Yazdırma ");
		 String day = getday.nextLine();
		 	switch(day) 
		 	 {
		 		case "p":
		 			System.out.println("Pazartesi\n Pazar \n Pazar");
		 			break;
		 		case "s":
		 			System.out.println("Salı");
		 			break;
		 		case "c":
		 			System.out.println("Çarşamba \n  Cuma  \n  Cumartesi");
		 			break;
		 		default:
		 			System.out.println("Yanlış Harf Girdiniz");
		 	 }
		 */
		//************************************************************************************		 
		/*
		 Scanner getday = new Scanner(System.in);
		 System.out.println("3 Kutsal Kitaba Göre Kutsal Günleri Giriniz ");
		 String day = getday.nextLine();
		 	switch(day) 
		 	 {
		 		case "cuma":
		 			System.out.println(day +" Müslümanların Mübarek Günü");
		 			break;
		 		case "cumartesi":
		 			System.out.println(day + " Hristiyanların Mübarek Günü");
		 			break;
		 		case "pazar":
		 			System.out.println(day + " Yahudilerin Mübarek Günü");
		 			break;
		 		default:
		 			System.out.println(" Yanlış Gün Girdiniz");
		 	 }
		 */
		//************************************************************************************

		/*		 
		    Scanner keys= new Scanner(System.in);
			 	System.out.println("bir karakter giriniz");
		        String str= keys.nextLine();
		        char ch=str.charAt(0);
			        if ( (ch>=65 && ch<=90)|| (ch>=97 && ch<=122) ) 	           
			            System.out.println(ch+ " bir harftir.");
			        else 
			        	System.out.println(ch+" bir harf değildir");
			        int i3= ch;
			        System.out.println(i3);


		 */

		/*		
		//************************************************************************************		

		    Scanner notlar = new Scanner(System.in);
				System.out.println("Notunuzu Giriniz ");
			    int puan = notlar.nextInt();
				    if (puan>80) System.out.println("Notunuz  A");
		            else if (puan>60) System.out.println("Notunuz  B");
		            else if (puan>50) System.out.println("Notunuz  C");
		            else System.out.println("Notunuz  D");

		 */	
		//************************************************************************************

		Scanner sayi = new Scanner(System.in);
		System.out.println("lütfen 4 basamaklı bir sayı giriniz!!");
		int rakam= sayi.nextInt();
		String str= rakam % 5 == 0  ? 
				(rakam % 2==0 ? "5'e Bölünen Çift Sayı" : "5'e Bölünen Tek Sayı" ): "Tekrar Sayi Giriniz ";
		System.out.println(str);

	}

}





