package rabiaTurpcu;

import java.util.Scanner;

public class JavaOdev3_6 {
public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Notunuzu giriniz");
		
		byte not = scan.nextByte();
		
		if(not>=80) {
			System.out.println("A");	
			}
		
		else if((80>not) && (not >=60)) {
			
			
			System.out.println("B"); }
		
		else if((60>not)&& (not>=50)) {
			
			System.out.println("C");  }
		
		else  {
			System.out.println("D");
		}
			

}
}
