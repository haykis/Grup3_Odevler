<<<<<<< HEAD
package yasarYilmaz;

import java.util.ArrayList;
import java.util.Scanner;

public class ArabalarPlakaKontrol 
	{
	
	public static void main(String[] args) 
	{


		
		Scanner scan = new Scanner(System.in);
		String arananPlaka;
		ArrayList<ArabaKayit> arabam = new ArrayList<>();
		arabam.add(new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin"));
		arabam.add(new ArabaKayit("AKL-212",15,2019,"1.3","Manuel","Benzin"));
		arabam.add(new ArabaKayit("PLK-256",21,2021,"1.8","Manuel","Benzin"));
		arabam.add(new ArabaKayit("SVS-980",10,2015,"2.4","Otomatik","Benzin"));
		arabam.add(new ArabaKayit("TUR-542",32,2001,"1.2","Otomatik","Benzin"));
		arabam.add(new ArabaKayit("GHD-452",16,2001,"1.6","Otomatik","Benzin"));
		arabam.add(new ArabaKayit("AKL-342",11,2009,"1.3","Manuel","Benzin"));
		arabam.add(new ArabaKayit("PLK-263",27,2001,"1.8","Manuel","Manual"));
		arabam.add(new ArabaKayit("SVS-990",19,2022,"2.4","Otomatik","Benzin"));
		arabam.add(new ArabaKayit("TUR-572",32,2003,"1.2","Otomatik","Manual"));
		
		System.out.println("Aradığınız Plakayı Giriniz = ");
		arananPlaka=scan.nextLine();
		
			for(ArabaKayit araba:arabam)
		{
			if(araba.getPlaka().equals(arananPlaka))
			{
				System.out.println("Bu Araç Çalıntıdır Lütfen Polise Gidiniz");
				break;
			}
			else 
				{
				System.out.println("Arabanız Çalıntı değildir");
			break;
				}
		}
		
//		ArrayList<Araba> arabalar = new ArrayList<Araba>();
//		arabalar.add(new Araba("34 ABC 123", 120, 5, "Kırmızı", 2018));
		
	
		
//		ArabaKayit araba1 = new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin");
//		ArabaKayit araba2 = new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin");
//		ArabaKayit araba3 = new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin");
//		ArabaKayit araba4 = new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin");
//		ArabaKayit araba5 = new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin");
		
	

		
//		ArrayList<Araba> arabalar = new ArrayList<Araba>();
//		arabalar.add(new Araba("34 ABC 123", 120, 5, "Kırmızı", 2018));
		
//		for(araba aranan : araba) {
			
		}
			
	}
		
		
	



=======
package yasarYilmaz;

import java.util.ArrayList;
import java.util.Scanner;

public class ArabalarPlakaKontrol 
	{
	
	public static void main(String[] args) 
	{


		
		Scanner scan = new Scanner(System.in);
		String arananPlaka;
		ArrayList<ArabaKayit> arabam = new ArrayList<>();
		arabam.add(new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin"));
		arabam.add(new ArabaKayit("AKL-212",15,2019,"1.3","Manuel","Benzin"));
		arabam.add(new ArabaKayit("PLK-256",21,2021,"1.8","Manuel","Benzin"));
		arabam.add(new ArabaKayit("SVS-980",10,2015,"2.4","Otomatik","Benzin"));
		arabam.add(new ArabaKayit("TUR-542",32,2001,"1.2","Otomatik","Benzin"));
		arabam.add(new ArabaKayit("GHD-452",16,2001,"1.6","Otomatik","Benzin"));
		arabam.add(new ArabaKayit("AKL-342",11,2009,"1.3","Manuel","Benzin"));
		arabam.add(new ArabaKayit("PLK-263",27,2001,"1.8","Manuel","Manual"));
		arabam.add(new ArabaKayit("SVS-990",19,2022,"2.4","Otomatik","Benzin"));
		arabam.add(new ArabaKayit("TUR-572",32,2003,"1.2","Otomatik","Manual"));
		
		System.out.println("Aradığınız Plakayı Giriniz = ");
		arananPlaka=scan.nextLine();
		int sayac=0;
		
			for(ArabaKayit araba:arabam)
		{
			if(araba.getPlaka().equals(arananPlaka))
			{
				System.out.println("Bu Araç Çalıntıdır Lütfen Polise Gidiniz");
				sayac++;				
				break;
			}
			
			if(sayac<=arabam.size())
							{
				System.out.println("Arabanız Çalıntı değildir");
				break;
				}
		}
		
//		ArrayList<Araba> arabalar = new ArrayList<Araba>();
//		arabalar.add(new Araba("34 ABC 123", 120, 5, "Kırmızı", 2018));
		
	
		
//		ArabaKayit araba1 = new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin");
//		ArabaKayit araba2 = new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin");
//		ArabaKayit araba3 = new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin");
//		ArabaKayit araba4 = new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin");
//		ArabaKayit araba5 = new ArabaKayit("ALY-352",12,2011,"1.6","Otomatik","Benzin");
		
	

		
//		ArrayList<Araba> arabalar = new ArrayList<Araba>();
//		arabalar.add(new Araba("34 ABC 123", 120, 5, "Kırmızı", 2018));
		
//		for(araba aranan : araba) {
			
		}
			
	}
		
		
	



>>>>>>> branch 'master' of https://github.com/haykis/Grup3_Odevler.git
