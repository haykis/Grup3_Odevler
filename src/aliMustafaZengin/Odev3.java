package aliMustafaZengin;

import java.util.Scanner;

public class Odev3 {

		public static void main(String []args) {
			//fggdgd
			
			//1.Kullanıcıdan uc tane tam sayı alalım ve maksimum sayıyı bulan java kodunu yazalım.
			//Not: if else kullanalım…
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Birinci tam sayiyi giriniz");
			int birinciSayi= scan.nextInt();
			
			System.out.println("Ikinci tam sayiyi giriniz");
			int ikinciSayi= scan.nextInt();
			
			System.out.println("Ucuncu tam sayiyi giriniz");
			int ucuncuSayi= scan.nextInt();
			
			if(birinciSayi>ikinciSayi&&birinciSayi>ucuncuSayi) {
				System.out.println("en buyuk sayi : "+ "birincisayidir");
			}
			else if(ikinciSayi>birinciSayi&&ikinciSayi>ucuncuSayi) {
				System.out.println("en buyuk sayi : "+ "ikincisayidir");
			}
			else if(birinciSayi==ikinciSayi&&ikinciSayi==ucuncuSayi) {
				System.out.println("girilen sayilar esittir");	
			}
			else {
				System.out.println("en buyuk sayi : "+ "ucuncuyayidir");
			}
			
			//2.Kullanıcıdan bir gün girmesini isteyelim. 
			//a.Eger girilen gun hafta sonu ise tekrar kontrol edelim 
			//Cumartesi ise Cumartesi ve hafta sonu, Pazar ise Pazar ve hafta sonu yazdıralım.
			//b. Degil ise gün hafta ici yazdıralım. 
			//1. Note: equals ile karsilastiralim 2. Nested ternary kullanalım…
			
			Scanner scan1=new Scanner(System.in);
			System.out.println("Lutfen haftanin gunlerinden bir gun giriniz");
			String gun=scan1.nextLine();
		
			
			String str = gun.equals("pazar")|| gun.equals("cumartesi") ? gun.equals("cumartesi")? "ctesi ve hsonu" : "pazar ve haftasonu"
							: "hici" ;

					
				System.out.println(str);
				
				//3.Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve
				//o harfle baslayan gun isimlerini yazdirin.
				//Ornek ilkHarf=P output = “Pazar, Pazartesi veya Persembe” ilkHarf=S output = “Sali”
				//(switch case default ile yapalim)
				 
				
				
				Scanner scan2=new Scanner(System.in);
				System.out.println("Lutfen haftanin gunlerinde birinin ilk harfini kucuk harfle girin");
				char ilkHarf=scan2.next().charAt(0);
				
				switch(ilkHarf) {
				
				case 'p' :
					System.out.println("“Pazar, Pazartesi veya Persembe”");
					break ;
				case 's','S' :
					System.out.println("Sali");
					break;
				case 'c' :
					System.out.println("Carsamba , Cuma veza Cumartesi");
					break;
				default: 
					System.out.println("Lutfen gecerli bir hafta gunu giriniz");
				}
				
				
				//4.Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal gun” yazdirin.
				//“Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
				//“Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin.
				//(switch case default ile yapalim)
				  
				Scanner scan3= new Scanner(System.in);
				  System.out.println("Dinlere gore kutsal 3 gunu ogrenmek icin lutfen cuma , cumartesi ya da pazar gununu giriniz");
				  String kutsalGun=scan3.nextLine();
				  
				  switch(kutsalGun) {
				  
				  case "cuma" :
					  System.out.println("Muslumanlar icin kutsal gun");
					  break ;
				  case "cumartesi":
					  System.out.println("Yahudiler icin kutsal gun");
					  break ;
				  case "pazar" :
					  System.out.println("Hiristiyanlar icin kutsal gun");
					  break ;
				default:
					 System.out.println("lutfen cuma , cumartesi ya da pazar olarak girdiginize emin olun");
					  
				  }
				  
				  //5.Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin.
				  //(D, d, 3, ~, @, !, ...) (ip ucu: ascii tablosu)
				  
				  Scanner scan4=new Scanner(System.in);
				  System.out.println("Lutfen bir karakter girin");
				  char karakter=scan4.next().charAt(0);
				  
				  if('a'<=karakter&& karakter<='z'|| 'A'<=karakter && karakter<='Z')
				  
						  {
					  System.out.println("harftir");
				  }
				  else {
					  System.out.println("harf degildir");
					  		 }
				  //6.Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
				  //50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”.
				  //(If, else if, else kullanalim)
				  
	              Scanner scan5=new Scanner(System.in);
	              System.out.println("Lutfen bir not girin");
	              double not=scan5.nextInt();
	              
	              if (not<50) {
	            	  System.out.println("D");
	              }
	              else if(not>=50&& not<60) {
	            	  System.out.println("C");
	              }
	              else if(not>=60&& not<80) {
	            	  System.out.println("B" );}
	              else {
	            		  System.out.println("A" );
	            	  }
	              
	              
	             // 7- Kullanıcıdan 4 basamakli birsayi girmesini isteyin. 
	              //Girdiği sayi 5’e bölünüyorsa son rakamını control edin.
	              //Sonrakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
	              //Sonrakamı 0değilise “5’e bölünen tek sayı” yazdırın. 
	              //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
	              //(Nested Ternary kullanalim)
	              
	              System.out.println("Lutfen 4 basamakli bir sayi girin");
	              short sayim=scan5.nextShort();
	              
	              String str1= (sayim%10==0||sayim%10==5)? sayim%10==0?"5 e bolunen cift sayi":"5 e bolunen tek sayi" : "Tekrar deneyin" ;
	              System.out.println(str1);
	              
	             
	              
	          
	            	  }
	              
	              
		}


