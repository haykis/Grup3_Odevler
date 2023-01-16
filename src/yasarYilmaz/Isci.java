package yasarYilmaz;

import java.util.ArrayList;

public class Isci extends Muhasebe {

	
	 private static int id;

	public Isci() 
	{
		super(id);
	}
	
	public static  void main(String[] args) 
	{
		 ArrayList<Isci> isciList = new ArrayList<>();
		 
		 	Isci isci1 = new Isci();
		 
		 	isci1.idAtama(id);
	        isci1.setIsim("Kemal");
	        isci1.setSoyisim("Dolu");
	        isci1.setAdres("123. sok no:2");
	        isci1.setTelefon("555-555-5551");
	        isci1.saatlikUcret = 15.50;
	        isci1.statu = "isci";
	        isci1.maasHesapla();
	        
	        isciList.add(isci1);
	        		
	        		
	        Isci isci2 = new Isci();
	        isci2.idAtama(id);
	        isci2.setIsim("Ali");
	        isci2.setSoyisim("Can");
	        isci2.setAdres("45.sok no: 5");
	        isci2.setTelefon("555-555-5552");
	        isci2.saatlikUcret = 17.00;
	        isci2.statu = "usta";
	        isci2.maasHesapla();
	        
	        isciList.add(isci2);
	        
	        Isci isci3 = new Isci();
	        isci3.idAtama(id);;
	        isci3.setIsim("Ahmet");
	        isci3.setSoyisim("Demir");
	        isci3.setAdres("789. sok no:7");
	        isci3.setTelefon("555-555-5553");
	        isci3.saatlikUcret = 18.50;
	        isci3.statu = "ustabasi";
	        isci3.maasHesapla();
	        
	        isciList.add(isci3);

	       
	        for (Isci isci : isciList) 
	        {
	            System.out.println("Isci ID: " + isci.getId());
	            System.out.println("Isci isim: " + isci.getIsim());
	            System.out.println("Isci soyisim: " + isci.getSoyisim());
	            System.out.println("Isci adres: " + isci.getAdres());
	            System.out.println("Isci telefon: " + isci.getTelefon());
	            System.out.println("Isci saatlik ücret: " + isci.saatlikUcret);
	            System.out.println("Isci statu: " + isci.statu);
	        }
	}
}
