package yasarYilmaz;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class YasHesapla {
//	Kullanicidan dogum tarihini isteyin ve yasini; 
//	a) Gun, ay, yil olarak yasHesapla() static void metodu’ nda, 
//	b) Sade ay olarak ay() non-static void metodu’ nda,
//	c) Sadece gun olarak gun() non-static String donuslu method’ unda
	public static void main(String[] args) 
	{
//		Scanner scan = new Scanner(System.in);
//		String dogumtarihi = ""; 
//		System.out.println("Doğum Tarihinizi Giriniz (Gün.Ay.Yıl)= ");
//		dogumtarihi=scan.nextLine();
//		System.out.println(dogumtarihi);
		
		Date Bugun = new Date();
		DateFormat f = SimpleDateFormat("dd/MM/yy");
		Date tarih = null;
		try { 
			tarih = f.parse("dd/MM/yy");
		} catch (ParseException e ) {
			e.printStackTrace();
		}
		}

	private static DateFormat SimpleDateFormat(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	}


