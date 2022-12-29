package yasarYilmaz;

import java.util.Scanner;

public class SupurgeAl {

//	E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri olduguna 
//	bakiniz. Bir tane class olusturarak bu ozellikleri kullanan 15 tane urun 
//	hazirlayiniz. (5 tanesi kullanicidan veri alinarak , 5 tanesi parametreli 
//	constructor kullanilarak, 5 tanesi bos constructor kullanilarak olmali)
//	2. Github hessabindan ders6 yi kendi local calisma ortaminiza pull ediniz. Araba 
//	classi icindeki ozellikleri kullanarak Constructor classinda nesne uretiniz
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner scan  = new Scanner(System.in);
		Scanner scans = new Scanner(System.in);
		
		RobotSupurge spr = new RobotSupurge("Xiomi",3,"Var",5,"Var",200,2);
		RobotSupurge spr2 = new RobotSupurge("Samsung",4,"Var",4,"yok",240,1);
		RobotSupurge supurge1 = new RobotSupurge();
		RobotSupurge supurge2 = new RobotSupurge();
		
		spr.supurge();
		System.out.println("--------------------------------------------------------");
		for(int a=1; a<6;a++)
			{
				System.out.println(" İstediğiniz Robot Süpürge Bilgilerini Giriniz "
						+ "\n Marka   Garanti Süresi  Haritalandırma  Şarj Süresi  "
						+ "\n uygulama Kontrol  Hazne Kapasitesi  Ağırlık \n ");
				supurge1.marka = scans.nextLine();
				supurge1.garanti = scan.nextInt();
				supurge1.haritalandirma = scans.nextLine();
				supurge1.sarjsuresi = scan.nextInt();
				supurge1.uygulamakntrl = scans.nextLine();
				supurge1.haznekapasitesi = scan.nextInt();
				supurge1.agirlik = scans.nextInt();
				supurge1.supurge();
				
			}

	
		
		
		
		
		
		
		
	}

}
