package ramazanKombe;

public class Odev11Muhasebe extends Odev11Personel {
	
	
	    public Odev11Muhasebe(int id) {
		super(id);
		
	}



		double saatlikUcret;
	    String statu;
	    double maas;

	  

	    public void maasHesapla() {
	        maas = saatlikUcret * 8 * 30;
	    }
	

	
	
    }

