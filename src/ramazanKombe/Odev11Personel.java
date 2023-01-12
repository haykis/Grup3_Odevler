package ramazanKombe;

import java.util.Random;

public class Odev11Personel {
	
	 static int i = 100000;
	 
	 public int idAtama(int id) {
		 
		 Random rand = new Random();
		    int i = rand.nextInt(1000000);
		 
	            this.id = i;
	            i++;
	            
	            return id;
	        }
	 
	/*•	Personel classina class seviyesinde id,isim,soyisim,address ve telefon datalaarinin deklerasyonunu yapin. 
		Id atamasi, idAtama() methodunda olusturacaginiz programla yapilacak olup her calisana farkli bir id verilecektir.
		Id’ ler 6 basamakli bir sayi olarak tanimlanacaktir.  
	*/
	
	private int id;
    private String isim;
    private String soyisim;
    private String adres;
    private String telefon;

    public Odev11Personel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public void setId(int id) {
		this.id = id;
	}

    
   
    }
    
    
    
    
