package yasarYilmaz;

import java.util.Scanner;

public class SupurgeAl {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		Scanner scans = new Scanner(System.in);
		
		String ad = "supurge";
		String bad="   ";

		RobotSupurge spr = new RobotSupurge("Xiomi",3,"Var",5,"Var",200,2);
		RobotSupurge supurge1 = new RobotSupurge();
		spr.supurge();
		System.out.println("--------------------------------------------------------");
		for(int a=1; a<6;a++)
			{
				System.out.println(ad);
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
