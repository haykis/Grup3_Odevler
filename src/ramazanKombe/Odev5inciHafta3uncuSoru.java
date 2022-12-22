package ramazanKombe;

import java.util.Scanner;

public class Odev5inciHafta3uncuSoru {

	
	/*Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin. integer 
	donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun. 
	Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin. 
	Islemin sonucunu main method’ dan verilen komutla yazdirin.
		public static void main(String[] args) {
	*/
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen taban sayisini girin: ");
        int taban = sc.nextInt();

        System.out.print("Lutfen ussu girin: ");
        int uss = sc.nextInt();

        int sonuc = usluSayiHesapla(taban, uss);
        System.out.println(taban + "^" + uss + " = " + sonuc);
    }

    public static int usluSayiHesapla(int taban, int uss) {
        int sonuc = 1;
        for (int i = 0; i < uss; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }
}


