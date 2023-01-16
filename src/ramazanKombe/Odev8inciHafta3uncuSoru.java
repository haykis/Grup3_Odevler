package ramazanKombe;

public class Odev8inciHafta3uncuSoru {

	public Odev8inciHafta3uncuSoru() {
		
	}

	
//Soru 3:
//	iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak
//	bulunuz. Sonucu ekrana yazdiriniz.
//	Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
	
	
	
	public static void main(String[] args) {
		String[] arr1 = {"elma", "muz", "kiraz"};
		String[] arr2 = {"elma", "armut", "cilek"};

		boolean sonuc = false;

		for (String str1 : arr1) {
		  for (String str2 : arr2) {
		    if (str1.equals(str2)) {
		      System.out.println("ortak eleman: " + str1);
		      sonuc = true;
		      break;
		    }
		  }
		}

		if (!sonuc) {
		  System.out.println("ortak eleman yok");
	}

		
		
		//Soru 4:
			//Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak yazdiriniz. 
		
	String ifadeler = "Java ogrenmek cok kolay degil";
	
	String [] str = ifadeler.split(ifadeler);
	
	for(String  each: str) {
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
}
}