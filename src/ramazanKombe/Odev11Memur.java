package ramazanKombe;

import java.util.ArrayList;

public class Odev11Memur extends Odev11Muhasebe{


	 
	 private static int id;


		public Odev11Memur() {
			super(id);
		}

	/*
	 * • Muhasebe classina saatlikUcret, statu ve maas datalarinin deklerasyonunu
	 * yapin. maasHesapla() methodu olusturun. Maas hesaplamak icin
	 * (maas=saatlikUcret*8*30) formulunu kullanin. Formuldeki 8 rakami gunluk
	 * calisma saatini, 30 ise bir aydaki otuz is gununu temsil etmektedir.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * •	Parent (Super) classlardaki veriable’ lari kullanarak Memur classindan 
	 * 		3 adet memur olusturun. 
	 * 		Olusturulan memurlarin tum bilgilerini array liste aktarin ve daha sonra 
	 * 		consol’a yazdirin.
	 * 
	 * 
	 * 
	 * 
	 */
 public static <Isci> void main(String[] args) {
	 ArrayList<Odev11Memur> MemurList = new ArrayList<Odev11Memur>();
	 Odev11Memur Memur1 = new Odev11Memur();
	 
	 	Memur1.getId();
        Memur1.setIsim("Ayse");
        Memur1.setSoyisim("Kaya");
        Memur1.setAdres("178. sok no:29");
        Memur1.setTelefon("444-444-5551");
        Memur1.saatlikUcret = 20.00;
        Memur1.statu = "sef";
        Memur1.maasHesapla();
        MemurList.add(Memur1);
        		
        		
        Odev11Memur Memur2 = new Odev11Memur();
        Memur2.getId();
        Memur2.setIsim("Asli");
        Memur2.setSoyisim("Katip");
        Memur2.setAdres("75.sok no: 75");
        Memur2.setTelefon("444-444-5552");
        Memur2.saatlikUcret = 20.00;
        Memur2.statu = "memur";
        Memur2.maasHesapla();
        MemurList.add(Memur2);
        
        Odev11Memur Memur3 = new Odev11Memur();
        Memur3.getId();
        Memur3.setIsim("Atahan");
        Memur3.setSoyisim("Kilic");
        Memur3.setAdres("79. sok no:70");
        Memur3.setTelefon("444-444-5553");
        Memur3.saatlikUcret = 20.00;
        Memur3.statu = "sekreter";
        Memur3.maasHesapla();
        MemurList.add(Memur3);

       
        for (Odev11Memur memur : MemurList) {
            System.out.println("Isci ID: " + memur.getId());
            System.out.println("Isci isim: " + memur.getIsim());
            System.out.println("Isci soyisim: " + memur.getSoyisim());
            System.out.println("Isci adres: " + memur.getAdres());
            System.out.println("Isci telefon: " + memur.getTelefon());
            System.out.println("Isci saatlik ücret: " + memur.saatlikUcret);
            System.out.println("Isci statu: " + memur.statu);
           
 
        }
      
 }
}

