package aliMustafaZengin;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Odev9_1 {

	public static void main(String[] args) {
//		Tokyo-Kahire arasi ucak seferi duzenleyen bir hava yolu sirketi icin bilet
//		satis programina ek program yazmaniz istendi.Kalkis Tokyo ve inis Kahire
//		sehridir. Sartlar; Kullanicidan seyahat tarihi ve saati istenecek,
//		Tokyo saatiyle kalkis saati ve tarihi, Kahire saatiyle inis saati ve tarihi
//		verilecek. (Kullanicidan istenilen bilgileri “VeriGirisi” adiyla 
//		olusturulmus class’ tan alinip “Sonuc” adiyla olusturulmus class icinde
//		olusturacaginiz static bir method’ tan kullaniciya sunulacaktir.)

		Scanner scan=new Scanner(System.in);
		 System.out.println("Yıl girin");
		 
		 int yil = scan.nextInt();
		 System.out.println("Ay girin");
		 int ay = scan.nextInt();
		 System.out.println("Gun girin");
		 int gun = scan.nextInt();
		 System.out.println("Saat girin");
		 int saat = scan.nextInt();
		 System.out.println("Dakika girin");
		 int dk = scan.nextInt();
		 
		 LocalDateTime tokyo=LocalDateTime.of(yil, gun, ay, saat, dk);
		 System.out.println(tokyo);//2022-02-02T16:55
		 
		 LocalDateTime kahire=tokyo.plusHours(10);
		 System.out.println(kahire);//2022-02-03T02:55
		 
	}

}
