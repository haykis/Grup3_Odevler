package zeynepTubaTur.Odev2Hafta;

import java.util.Scanner;

public class Soru3 {

	
public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
			
		 System.out.println("Ne kadar kara mili yol gittiginizi yaziniz : ");
		
		Double milDegeri = scan.nextDouble();
		
		Double kiloMetre = milDegeri * 1.6;
		
		System.out.println( milDegeri + " mil gittiginiz yolun km ye cevrilmis hali: " + kiloMetre + " dir.");
		
		
		
}}
