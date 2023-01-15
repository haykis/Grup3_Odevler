package yasarYilmaz;

public class Muhasebe extends Personel 
{
	 double saatlikUcret;
	    String statu;
	    double maas;
	    
	    public double maasHesapla(double saatlikUcret ) {
	        double maas=saatlikUcret*8*30;
	        return maas;
	    }


}
