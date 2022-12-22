package ramazanKombe;

public class Odev5inciHafta2inciSoru {

	public Odev5inciHafta2inciSoru() {
		
	}

	public static void main(String[] args) {
		
		/*InfotechAcademy1234...!’^.+” String ifadesinde,
		a.kac harf
		b.kac rakam
		c.kac ozel karakter oldugunu ekrana yazdıran 
		karakterSay() metodunu yazınız.
		*/
		String str = "InfotechAcademy1234...!’.^+";
		karakterSay(str);
	}
	public static void karakterSay(String str) {
	    int harfSayisi = 0;
	    int rakamSayisi = 0;
	    int ozelKarakterSayisi = 0;

	    for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        if (Character.isLetter(c)) {
	            harfSayisi++;
	        } else if (Character.isDigit(c)) {
	            rakamSayisi++;
	        } else {
	            ozelKarakterSayisi++;
	        }
	    }

	    System.out.println("Harf sayisi: " + harfSayisi);
	    System.out.println("Rakam sayisi: " + rakamSayisi);
	    System.out.println("Ozel karakter sayisi: " + ozelKarakterSayisi);
	}
}
