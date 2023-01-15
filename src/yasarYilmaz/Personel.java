package yasarYilmaz;
/*
Personel classina class seviyesinde id,isim,soyisim,address ve 
telefon datalarinin deklerasyonunu yapin. Id atamasi, idAtama() 
methodunda olusturacaginiz programla yapilacak olup her calisana 
farkli bir id verilecektir. Id’ ler 6 basamakli bir sayi olarak 
tanimlanacaktir.  
Muhasebe classina saatlikUcret, statu ve maas datalarinin 
deklerasyonunu yapin. maasHesapla() methodu olusturun. Maas 
hesaplamak icin (maas=saatlikUcret*8*30) formulunu kullanin. 
Formuldeki 8 rakami gunluk calisma saatini, 30 ise bir aydaki otuz 
is gununu temsil etmektedir.
Parent (Super) classlardaki veriable’ lari kullanarak Isci classindan 3
adet isci olusturun. Olusturulan iscilerin tum bilgilerini array liste 
aktarin ve daha sonra consol’ a yazdirin.
Parent (Super) classlardaki veriable’ lari kullanarak Memur 
classindan 3 adet memur olusturun. Olusturulan memurlarin tum 
bilgilerini array liste aktarin ve daha sonra consol’ a yazdirin.

*/
public class Personel 
{
	private int id;
	private String isim;
	private String soyisim;
	private String adres;
	private String statu;
	private String telefon;
	
	static int id_no =100000;
	
	public  void Personel() {}
	
//	public void Personel(String id,String isim,String soyisim,	String adres,String statu,String telefon)
//	{
//		super.id = id;
//		super.isim = isim;
//		super.soyisim = soyisim;
//		super.adres = adres;
//		super.statu = statu;
//		super.telefon = telefon;
//		
//	}

	public int idAtama() 
	{
		
		this.id = id_no;
		id_no++;
		return id_no; 
	}

}

