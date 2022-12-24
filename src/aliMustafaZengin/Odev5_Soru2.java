package aliMustafaZengin;

public class Odev5_Soru2 {

	public static void main(String[] args) {
		
	/*	”InfotechAcademy1234…!’^.+” String ifadesinde,
		a.	kac harf
		b.	kac rakam
		c.	kac ozel karakter oldugunu ekrana yazdıran 
		karakterSay() metodunu yazınız.
		
		*/

		
		String str1="InfotechAcademy1234...!'^.+";
		karakterSay(str1);
		


	}
	
	
	public static void karakterSay(String str1) {
		
		int harf = 0;
	    int rakam = 0;
	    int karakter= 0;
	    
	      
	    
	    
	    for (int i = 0; i < str1.length(); i++) {
			char a=str1.charAt(i);
			if(Character.isLetter(a)) {
				harf++;
			}
			else if(Character.isDigit(a)) {
				rakam++;
			}
			else {
				karakter++;
			}
			
		}
	    
	    System.out.println("Harf sayisi: " + harf);
	    System.out.println("Rakam sayisi: " + rakam);
	    System.out.println("Ozel karakter sayisi: " + karakter);

		
		
		
	}
	
	
	
}

