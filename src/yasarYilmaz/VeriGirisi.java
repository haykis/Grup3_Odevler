package yasarYilmaz;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;


public class VeriGirisi {
	
//	public static void main(String[] args)
//	{
//		seyahat();
//	}
//	
	public void seyahat()
	{
	
		Scanner vr = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
//		Date date = new Date();
//		System.out.println("Gideceğiniz Tarihi ve Saati Giriniz (yil/ay/gün Saat:Dakika:Saniye) ");
//		String gidistarihi = vr.nextLine();
//		
//		String verilenTarih = "2023/01/05 15:30:00";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM7/dd HH:mm:ss");
//		System.out.println(date);
//		
//		LocalDate date = LocalDate.of(2023, 5, 10);
//		System.out.println(date.toString());
//		System.out.println("Gideceğiniz Tarihi Giriniz  = ");
//		System.out.println("Yılı Giriniz = ");
//		int yil = vr.nextInt();
//		System.out.println("Ayı Giriniz = ");
//		int ay = vr.nextInt();
//		System.out.println("Günü Giriniz = ");
//		int gun = vr.nextInt();
//		System.out.println(LocalDate.of(yil,ay,gun));
//		System.out.println("Gideceğiniz Saati Giriniz  = ");
//		System.out.println("Saati Giriniz = ");
//		int saat = vr.nextInt();
//		System.out.println("Dakikayı Giriniz = ");
//		int dakika = vr.nextInt();
//		System.out.println(LocalTime.of(saat,dakika));
		
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
	
	        LocalDateTime toky = LocalDateTime.of(yil, ay, gun, saat, dk);
	
	        toky = toky.plusHours(10).plusMinutes(20);
	        System.out.println("Kahire'ye inis zamaniniz : "+ toky);
		
		       
		}	
		
		
	}

