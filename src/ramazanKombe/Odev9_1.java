package ramazanKombe;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Odev9_1 {
	
	
	static Scanner scan = new Scanner(System.in);
​
	    public static void method () {
	​
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
	​
	        LocalDateTime toky = LocalDateTime.of(yil, ay, gun, saat, dk);
	​
	        toky = toky.plusHours(10).plusMinutes(20);
	        System.out.println("Kahire'ye inis zamaniniz : "+ toky);
	​
	​
	/*
	        LocalTime ldt = LocalTime.now(ZoneId.of("Japan"));
	        LocalTime ldt2 = LocalTime.now(ZoneId.of("Egypt"));
	        System.out.println(ldt2.getHour() - ldt.getHour());
	*/
	    }
		
		    public static void main(String[] args) {
	        VeriGiris.method();
	    }

}
