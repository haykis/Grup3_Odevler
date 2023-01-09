package ramazanKombe;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Odev9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  
	  
	  /*2-Kullanicidan dogum tarihini isteyin ve yasini; a) Gun, ay, yil olarak
	  yasHesapla() static void metodu’ nda, b) Sade ay olarak ay() non-static void
	  metodu’ nda, c) Sadece gun olarak gun() non-static String donuslu method’
	  unda, hesaplayiniz.
	 */
		
		
	  //a// // 
		
		
		Scanner sc = new Scanner(System.in); 
		
	  System.out.println("Geben Sie Ihr Geburtstag 'TT' Tag ein: "); 
	  int day =sc.nextInt();  
	  System.out.println("Geben Sie Geburtsmonat ein: "); 
	  int month = sc.nextInt(); 
	  System.out.println("Geben Sie Geburtsjahr ein: ");
	   int year = sc.nextInt();  
	   
	   LocalDate birthDate = LocalDate.of(year,month, day); 
	   
	   LocalDate currentDate = LocalDate.now(); 
	   
	   long ageInDays = currentDate.toEpochDay() - birthDate.toEpochDay(); 
	   
	   int ageInYears = (int) (ageInDays / 365);  
	   int ageInMonths = (int) (ageInDays/30); 
	   int ageInDays1 = (int) (ageInDays % 365 % 30); 
	   
	  System.out.println("Ihr Alter: " + ageInYears + " als Jahr, "  + ageInMonths
	  + " als Monat ," + ageInDays + " als Tage.");
	  
		
		  Scanner sc1 = new Scanner(System.in);
		  
//		   DateTimeFormatter formatter =
//		  DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
//		  String formattedDate =dogumGunu.format(formatter);
		  
		  System.out.println("Dogum tarihinizi giriniz (yil ay gun): "); 
		  int yil= sc1.nextInt(); int ay = sc1.nextInt(); int gun = sc1.nextInt();
		  
		  LocalDate dogumGunu = LocalDate.of(yil, ay, gun); 
		  LocalDate guncelTarih = LocalDate.now();
		  Period age = Period.between(dogumGunu, guncelTarih); 
		  System.out.println( "Yasiniz " + age.getYears() + " yil, " +
		  age.getMonths() + " ay, ve " + age.getDays() + " gündür."); 
		  System.out.println("Yasini " + age.getYears() + " yil."); 
		  System.out.println("Yasini " + age.getMonths()+"aydir."); 
		  System.out.println("Yasini " + age.getDays() + " gündür.");
		 	}
	
	
	
	
	  public void calculateAndPrintMonth() {
	    // Kullanıcıdan doğum tarihini alın
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Doğum tarihinizi (gg/aa/yyyy) girin: ");
	    String birthdate = scanner.nextLine();

	    // Ayı ayırlama ve integer'a çevirme
	    String month = birthdate.substring(0, 2);
	    int monthAsInt = Integer.parseInt(month);

	    // Ayı yazdırma
	    System.out.println("Doğum ayınız: " + monthAsInt);
	  }
	


	    
	


	 
	
}


