package aliMustafaZengin;

import java.util.Scanner;

public class Odev6Consructor {

	public static void main(String[] args) {
		
		
		
		//Bos Consructor
		Odev6Product product1=new Odev6Product();
		
		product1.name="Lenovo";
		product1.islemci="i3";
		product1.bellekGb=4;
		product1.depolamaGb=64;
		product1.ekranBoyutu=12.0;
		
		System.out.println("Ilk Urunun Adi:"+product1.name);
		
		//Parametreli Consructor
		Odev6Product product2= new Odev6Product("HP","i5",6,128,14.0);
		System.out.println("Ilk Urunun Adi:"+product2.name);
		
		
		//Veri Girmeli COnsructor
		Scanner scan=new Scanner(System.in);
		Odev6Product product3=new Odev6Product();
		System.out.println("Urunun name ini girin");
		product3.name=scan.nextLine();
		System.out.println("Ucuncu Urunun Adi:" +product3.name);
		
		
		
		
		
		
		
		

	}

}
