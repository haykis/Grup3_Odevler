package zeynepTubaTur;

public class Homework6_Product {

	// Soru 1
	// E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri
	// olduguna bakiniz.
	// Bir tane class olusturarak bu ozellikleri kullanan 15 tane urun
	// hazirlayiniz.
	// (5 tanesi kullanicidan veri alinarak , 5 tanesi parametreli
	// constructor kullanilarak, 5 tanesi bos constructor kullanilarak olmali)

	String marka;
	String renk;
	String numara;
	String malzeme;
	String kategori;
	String fiyat;
	String sezon;
	String satışaSunulduğuIlkTarih;
	String urünModelNumarası;

	public Homework6_Product(String isim, String renk, String beden, String malzeme, String cinsiyet, String fiyat,
			String mevsim, String tarih, String modelNo) {

		this.marka = isim;
		this.renk = renk;
		this.numara = beden;
		this.malzeme = malzeme;
		this.kategori = cinsiyet;
		this.fiyat = fiyat;
		this.sezon = mevsim;
		this.satışaSunulduğuIlkTarih = tarih;
		this.urünModelNumarası = modelNo;

	}

	public Homework6_Product() {

	}
}
