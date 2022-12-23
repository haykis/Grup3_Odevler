package rabiaTurpcu;

import java.util.Scanner;

public class JavaOdev3_7 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("4 basamakli bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		
		
		String dortbasamakli = sayi % 5==0 ? ( sayi % 2==0? "Bu sayi 5 e bolunebilen cift sayidir " : "Bu sayi 5 bolunebilen tek sayidir") 
				                                            : "Bu sayi 5 e tam bolunemez" ;
		
		System.out.println(dortbasamakli);
		
		

}}
