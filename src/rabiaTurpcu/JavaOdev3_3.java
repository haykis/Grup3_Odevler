package rabiaTurpcu;

import java.util.Scanner;

public class JavaOdev3_3 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gun isimlerinden birinin bas harfini giriniz p/s/c/");
		
		char day = scan.next().charAt(0);
		
		switch (day) {
		
		case 'p':
			System.out.println("Pazartesi,Persembe,Pazar");
			
			break;
			
		case 'c' :
			System.out.println("Carsamba,Cuma,Cumartesi");
			break;
			
		case 's' :
			System.out.println("Sali");
			break;
			
			default :
				System.out.println("Yanlis harf girisi yaptiniz");
		
		
		
		
		}
		
}
}