package zeynepTubaTur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H11_Memur extends H11_Muhasebe {

	public H11_Memur(String isim, String soyIsim, String adres, String telefon, double saatlikUcret, String statu) {

		super.isim = isim;
		super.soyIsim = soyIsim;
		super.adres = adres;
		super.telefon = telefon;
		super.saatlikUcret = saatlikUcret;
		super.statu = statu;
		super.id = id;
		super.maas = maas;
	}

	public static void main(String[] args) {

		H11_Memur memur1 = new H11_Memur("Yildiz", "Avci", "Hollanda", "018734532", 20, "Ogretmen");

		memur1.id = memur1.idAtama();

		memur1.maas = memur1.maasHesapla(memur1.saatlikUcret);

		String id1String = String.valueOf(memur1.idAtama());

		String maas1String = String.valueOf(memur1.maasHesapla(memur1.saatlikUcret));

		
		
		H11_Memur memur2 = new H11_Memur("Zeynep", "Bilgi", "Almanya", "0175342564", 25, "Hemsire");

		memur2.id = memur2.idAtama();

		memur2.maas = memur2.maasHesapla(memur2.saatlikUcret);

		String id2String = String.valueOf(memur2.idAtama());

		String maas2String = String.valueOf(memur2.maasHesapla(memur2.saatlikUcret));

		
		
		H11_Memur memur3 = new H11_Memur("Kubra", "Kilic", "Turkiye", "05367654321", 40, "Doktor");

		memur3.id = memur3.idAtama();

		memur3.maas = memur3.maasHesapla(memur3.saatlikUcret);

		String id3String = String.valueOf(memur3.idAtama());

		String maas3String = String.valueOf(memur3.maasHesapla(memur3.saatlikUcret));

		
		List<H11_Memur> list = new ArrayList<>(Arrays.asList(memur1, memur2, memur3));

		
		for (H11_Memur m : list) {
			System.out.println("ISIM:" + m.isim + "\t" + "SOYISIM:" + m.soyIsim + "\t" + "ADRES:" + m.adres + "\t"
					+ "TELEFON:" + m.telefon + "\t" + "SAATLIKUCRET:" + m.saatlikUcret + "\t" + "STATU:" + m.statu
					+ "\t" + "ID:" + m.id + "\t" + "MAAS:" + m.maas);
		}
	}
}