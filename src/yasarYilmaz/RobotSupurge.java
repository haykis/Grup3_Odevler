package yasarYilmaz;

public class RobotSupurge 
	{
/**
	
System.out.println(ad);
System.out.println(ad + " Mesaj" + soyad)
	
RobotSupurge(String marka,int garanti,int sarjsuresi);	
RobotSupurge(String haritalandirma,int agirlik);

	
*/
		public String marka;
		public int garanti;
		public String haritalandirma;
		public int sarjsuresi;
		public String uygulamakntrl;
		public int haznekapasitesi;
		public int agirlik;
	
	RobotSupurge() { };
		
	RobotSupurge(String marka,int garanti,String haritalandirma,int sarjsuresi,String uygulamakntrl,int haznekapasitesi,int agirlik)
		{
			this.marka = marka;
			this.garanti = garanti;
			this.haritalandirma = haritalandirma;
			this.sarjsuresi = sarjsuresi;
			this.uygulamakntrl = uygulamakntrl;
			this.haznekapasitesi = haznekapasitesi;
			this.agirlik = agirlik;			
		}
	
	public void supurge()
		{
			System.out.println("Marka              = " + this.marka + 
							   "\nGaranti          = " + this.garanti +
							   "\nHaritalalandırma = " + this.haritalandirma +
							   "\nŞarj Süresi      = " + this.sarjsuresi +
							   "\nUygulama Kontrol = " + this.uygulamakntrl +
							   "\nHazne Kapasitesi = " + this.haznekapasitesi +
							   "\nAğırlık          = " + this.agirlik);
		}
	
	
	
	
}