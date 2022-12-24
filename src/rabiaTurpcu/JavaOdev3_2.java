package rabiaTurpcu;

import java.util.Scanner;

public class JavaOdev3_2 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir gun giriniz");
		
		
		String gun = scan.nextLine();
		
		String weekend = gun.equals("cumartesi") || gun.equals("pazar") ? (gun.equals("cumartesi")  ?  "Cumartesi ve haftasonu" : "pazar ve haftasonu")             
				
				:"Haftaici bir gun girdiniz";
		
		System.out.println(weekend);
		
}
}
