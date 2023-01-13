package ramazanKombe;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev10PlakaSorgula {

	    private ArrayList<Odev10CalintiAraclar> CalintiAraclar;

	    public Odev10PlakaSorgula() {
	    	CalintiAraclar = new ArrayList<>();

	        // Burada, 10 adet aracın özelliklerini listeye ekledim.
	        
	        CalintiAraclar.add(new Odev10CalintiAraclar("06 ZT 1234", "Ford", "Fiesta", 2018));
	        CalintiAraclar.add(new Odev10CalintiAraclar("06 AB 1990", "Toyota", "Camry", 2019));
	        CalintiAraclar.add(new Odev10CalintiAraclar("07 ACH 639", "Honda", "Civic", 2020));
	        CalintiAraclar.add(new Odev10CalintiAraclar("34 KL 1234", "Ford", "Mustang",2016));
	        CalintiAraclar.add(new Odev10CalintiAraclar("06 MM 1988", "Ford", "Focus",2010));
	        CalintiAraclar.add(new Odev10CalintiAraclar("09 NK 6987", "Opel", "Zafira",2007));
	        CalintiAraclar.add(new Odev10CalintiAraclar("01 LL 0101", "Mazda", "3",2018));
	        CalintiAraclar.add(new Odev10CalintiAraclar("06 KO 3698", "Mercedes", "C180", 2009));
	        CalintiAraclar.add(new Odev10CalintiAraclar("06 KI 3654", "Mercedes", "A180", 2010));
	        CalintiAraclar.add(new Odev10CalintiAraclar("03 MK 3647", "Opel", "Corsa", 2001));
	        
	    }

	    public boolean checkPlaka(String plaka) {
	        for (Odev10CalintiAraclar a : CalintiAraclar) {
	            if (a.getPlaka().equals(plaka)) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    
	    public static void main(String[] args) {
	    	Odev10PlakaSorgula Sorgu = new Odev10PlakaSorgula();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.print("Sorgulanmasi istenilen arac plakasini giriniz: ");
	            String plaka = sc.nextLine();

	            if (Sorgu.checkPlaka(plaka)) {
	                System.out.println("Çalınti arac!!!!!");
	            } else {
	                System.out.println("İşlem tamam. Devam edebilirsiniz.");
	            }
	        }
	    }
	}


