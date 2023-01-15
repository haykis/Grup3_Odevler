package zeynepTubaTur;

public class H11_Muhasebe extends H11_Personel {

	public double saatlikUcret;
	public String statu;
	public double maas;

	public double maasHesapla(double saatlikUcret) {

		maas = saatlikUcret * 8 * 30;
		return maas;
	}
}
