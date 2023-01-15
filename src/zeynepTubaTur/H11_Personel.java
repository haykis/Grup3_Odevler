package zeynepTubaTur;

public class H11_Personel {

	public int id;
	public String isim;
	public String soyIsim;
	public String adres;
	public String telefon;

//		public void idAtama() {
//			
//  int id_1 = 234523;
//  int id_2 = 234524;
//  int id_3 = 234525;			

	static int i = 223344;

	public int idAtama() {

		this.id = i;
		i++;
		return id;

	}
}
