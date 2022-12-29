package ramazanKombe;

public class Odev6Obje {

	/*
	 * 1. E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri
	 * olduguna bakiniz. Bir tane class olusturarak bu ozellikleri kullanan 15 tane
	 * urun hazirlayiniz. (5 tanesi kullanicidan veri alinarak , 5 tanesi
	 * parametreli constructor kullanilarak, 5 tanesi bos constructor kullanilarak
	 * olmali)
	 */


	public String marka;
	public String model;
	public int hafiza;
	public String renk;
	public double fiyat;
	public int stok;

	// Parametreli constructor
	
	public Odev6Obje(String marka, String model, String renk, int hafiza, double fiyat, int stok) {
		super();
		this.marka = marka;
		this.model = model;
		this.hafiza = hafiza;
		this.renk = renk;
		this.fiyat = fiyat;
		this.stok = stok;
	}

	public Odev6Obje(String marka, String model) {
	};
	

	

	public Odev6Obje() {
		
		System.out.println("Buras calisti");
		
		
		this.marka = marka;
		this.model = model;
		this.hafiza = hafiza;
		this.renk = renk;
		this.fiyat = fiyat;
		this.stok = stok;

	}

}
