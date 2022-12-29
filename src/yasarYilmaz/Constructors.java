package yasarYilmaz;

import java.util.Scanner;

public class Constructors {
//	2. Github hessabindan ders6 yi kendi local calisma ortaminiza pull ediniz. Araba 
//	classi icindeki ozellikleri kullanarak Constructor classinda nesne uretiniz

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//Product3 u kullanicidan almak icin tanimlandi
		
		Araba arabam = new Araba();
		Araba arabamiz = new Araba("Mercedes",2010,12,"2.4","otomatik","elektrik");
		
		System.out.println(arabamiz.name);
		System.out.println(arabamiz.id);
		System.out.println(arabamiz.model);
		System.out.println(arabamiz.motor);
		System.out.println(arabamiz.vites);
		System.out.println(arabamiz.yakit);
		arabamiz.name="AUDİ";
		System.out.println(arabamiz.name);

		
		
		}

}
