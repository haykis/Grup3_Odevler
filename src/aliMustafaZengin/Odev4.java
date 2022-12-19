package aliMustafaZengin;

import java.util.Scanner;

public class Odev4 {
public static void main(String[] args) {
	
		
//		Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”  string ifadesini 
//“Java ogrenmek cok guzel.” sekline getirin.
		
/*	String ilkDeger= "Java ogrenmek123 Cok guzel@";
		String IstenenDeger=ilkDeger.replace("123", "").replace('@', '.').replace('C', 'c');
		//"Java ogrenmek cok guzel."
        System.out.println(IstenenDeger);
        
//Soru 2) Kullanicidan isim isteyin. 
        //Eger - isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor” - 
        //isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor” 
        //ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin.
        
        System.out.println("Bir isim giriniz");
        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();
        
        if(isim.contains("a")) {
        	
        	if(isim.contains("Z")&&isim.contains("a")) {
        		System.out.println("Girdiginiz isim hem  a harfi  hem Z iceriyor");	
        	}
        	else {
        		System.out.println("sadeve a iceriyor");
        	}
        	}
        
        else if(isim.contains("Z")) {
        	if(isim.contains("Z")&&isim.contains("a")) {
        		System.out.println("Girdiginiz isim hem  a harfi  hem Z iceriyor");	
        	}
        	else {
        		System.out.println("sadeve a iceriyor");}
        	
        	
        	
        }
       
        else {
        	System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        	
        }
        
//Soru 3) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        
        System.out.println("isminizi girin");
        String isim1=scan.nextLine();
        
        System.out.println("Soyisminizi girin");
        String soyisim1=scan.nextLine();
        
        if(isim1.length()>soyisim1.length()) {
        	System.out.println("Uzun olan veri " +isim1+ " olarak girilen degerdir");}
        
        	else if (soyisim1.length()>isim1.length()) {
        		System.out.println("Uzun olan veri "+soyisim1+" olarak girilen degerdir");}
        		else {
        			System.out.println("girilen iki degerin uzunlugu esittir");
        		}
        		
        		
        		
//Soru 4) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve
//asagidaki gibi yazdirin.
//isim-soyisim : O** K** 
//kart no : ** ** ** 1234
     
Scanner scan1=new Scanner(System.in);
		System.out.println("Lutfen Adinizi Girin");
        String ad=scan1.nextLine();
        
        System.out.println("Lutfen Soyadinizi Giriniz");
        String soyad=scan1.nextLine();
        
        
        System.out.println("Lutfen kart numaranizi giriniz");
        String kartNo=scan1.nextLine();
        
        String yeniIsim=ad.replaceAll(ad.substring(1,ad.length()), "*");
        String yeniSoyIsim=soyad.replaceAll(soyad.substring(1), "**");
        String yeniKartNo=kartNo.replaceAll(kartNo.substring(0, kartNo.length()-4),"****");
        
        System.out.println(yeniIsim+" "+ yeniSoyIsim+"\n"+yeniKartNo);
        
 
 */
		
       // Soru 5) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
        //“Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin 

        //- Ilk harf buyuk harf olmali 
        //- Son harf kucuk harf olmali (![a,z])
        //- Sifre bosluk icermemeli  (!"")
        //- Sifre uzunlugu en az 8 karakter olmali (length)

        
        Scanner scan2= new Scanner(System.in);
        System.out.println("Lutfen Kosullari Saglayan Bir Sifre Giriniz");
        String sifre=scan2.nextLine();
        
        //ilk harf buyuk olma kosulu
        boolean ilkHarf=sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z';
        boolean sonHarf=sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z';
        boolean boslukDurumu=!sifre.contains(" ");
        boolean sifreUzunlugu=sifre.length()>=8;
        
        boolean ilkAsama=ilkHarf&&sonHarf;
        boolean ikinciAsama=boslukDurumu&&sifreUzunlugu;
                
        
      
        if((ilkAsama&&ikinciAsama)){
        	System.out.println("Sifre basari ile tanimlandi");
        }
        else {
        	System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }
        
         
	}

}


