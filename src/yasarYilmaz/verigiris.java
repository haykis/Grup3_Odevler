package yasarYilmaz;

import java.util.Scanner;

public class verigiris {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("İsminizi Giriniz ");
		String ad = scan.next();
		System.out.println("Soyadınızı Giriniz ");
		String soyad = scan.next();
		System.out.println("İsminiz          = " + ad);
		System.out.println("Soyisminiz       = " + soyad);
		System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz");
}


}