package ramazanKombe;

import java.util.Scanner;

public class Odev5inciHafta1inciSoru {

	public static void main(String[] args) {

		/*
		 * 1)Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i
		 * olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara gore e
		 * mail kontrolu yapiniz.
		 * 
		 * -@ isareti icermiyorsa “gecersiz email” yazdirin -@gmail icermiyorsa “lutfen
		 * gmail adresinizi girin” yazdirin -@gmail.com ile bitmiyorsa “Yazimda bir
		 * sorun var, maili kontrol ediniz” yazdirin.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("E-Mail adresinizi giriniz: ");
		String email = scanner.nextLine();

		kontrolEmail(email);
	}

	public static void kontrolEmail(String email) {
		if (!email.contains("@")) {
			System.out.println("Gecersiz email");
		} else if (!email.contains("@gmail")) {
			System.out.println("E-Mail adresinizi giriniz:");
		} else if (!email.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		} else {
			System.out.println("Gecersiz email");
		}

	}
}
