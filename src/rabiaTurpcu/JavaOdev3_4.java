package rabiaTurpcu;

import java.util.Scanner;

public class JavaOdev3_4 {

public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir gun giriniz");
		
		String day = scan.nextLine();
		
		switch (day) {
		
		case "cuma":
			System.out.println("Muslumanlar icin kutsal gun");
			break;
			
		case "cumartesi":
			System.out.println("Yahudiler icin kutsal gun");
			break;
			
		case "pazar":
			System.out.println("Hiristiyanlar icin kutsal gun");
			break;
			
			default:
				
				System.out.println("Siradan bir gun..");
				
			
		}
	}

}
