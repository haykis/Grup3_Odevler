package zeynepTubaTur;

import java.util.ArrayList;
import java.util.List;

public class H11_Isci extends H11_Muhasebe {

	public H11_Isci(String isim, String soyIsim, String adres, String telefon, double saatlikUcret, String statu) {

		super.isim = isim;
		super.soyIsim = soyIsim;
		super.adres = adres;
		super.telefon = telefon;
		super.statu = statu;
	}

	public static void main(String[] args) {

		H11_Isci isci1 = new H11_Isci("Ali", "Kurt", "Almanya", "01753453242", 30.5, "Kidemli Isci");
		isci1.id = isci1.idAtama();
		isci1.maas = isci1.maasHesapla(isci1.saatlikUcret);

		String id1String = String.valueOf(isci1.idAtama());
		String saatlikUcret1String = String.valueOf(30.5);
		String maas1String = String.valueOf(isci1.maasHesapla(30.5));

		List<String> list1 = new ArrayList<>();
		list1.add(isci1.isim);
		list1.add(isci1.soyIsim);
		list1.add(isci1.adres);
		list1.add(isci1.telefon);
		list1.add(isci1.statu);

		list1.add(id1String);
		list1.add(saatlikUcret1String);
		list1.add(maas1String);

		System.out.println(list1);

		
		H11_Isci isci2 = new H11_Isci("Mustafa", "Gok", "Almanya", "017665743", 20, "Tecrubeli Isci");
		isci2.id = isci2.idAtama();
		isci2.maas = isci2.maasHesapla(isci2.saatlikUcret);

		String id2String = String.valueOf(isci2.idAtama());
		String saatlikUcret2String = String.valueOf(20);
		String maas2String = String.valueOf(isci2.maasHesapla(isci2.saatlikUcret));

		List<String> list2 = new ArrayList<>();
		list2.add(isci2.isim);
		list2.add(isci2.soyIsim);
		list2.add(isci2.adres);
		list2.add(isci2.telefon);
		list2.add(isci2.statu);

		list2.add(id2String);
		list2.add(saatlikUcret2String);
		list2.add(maas2String);
		System.out.println(list2);

		
		H11_Isci isci3 = new H11_Isci("Asli", "Mutlu", "Almanya", "017654323", 10, "Tebrubesiz Isci");
		isci3.id = isci3.idAtama();
		isci3.maas = isci3.maasHesapla(isci3.saatlikUcret);

		String id3String = String.valueOf(isci3.idAtama());
		String saatlikUcret3String = String.valueOf(10);
		String maas3String = String.valueOf(isci3.maasHesapla(isci3.saatlikUcret));

		List<String> list3 = new ArrayList<>();
		list3.add(isci3.isim);
		list3.add(isci3.soyIsim);
		list3.add(isci3.adres);
		list3.add(isci3.telefon);
		list3.add(isci3.statu);

		list3.add(id3String);
		list3.add(saatlikUcret3String);
		list3.add(maas3String);

		System.out.println(list3);
	}
}