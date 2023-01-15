package zeynepTubaTur;

public class H11_1 {
	
//	1-Inheritance nedir ?
	
//	Inheritance: Kelime anlami olarak miras demektir. Classlar arasi irtibat kurar. 
//	Zaten var olan classlarin(super/parent) uzerine ek olarak alt classlar(sub/child) olusturuluyor.
//	Inheritance sayesinde ust classin kendi metodlarina ve degiskenlerine alt classlardan ulasilabilir.
//	Geneli kapsayan uyeler parent classdir. Daha spesifik olanlar child classlardir.
//	Bir child classinin bir tane parent classi olur. Bir parent classin birden fazla child classi olabilir. 
//	Child classlarin birbirleriyla baglantisi yoktur. 
	
//			2-Bir Class’a Parent Class olusturmak icin Syntax nedir?
	
//	Extends keyword unu kullaniyoruz. Child Class + extends + Parent Class
	
//			3-Hangi access modifier’lar inherit edilebilir ?
	
//	Public ve protected access modifier lar sorunsuz bir sekilde inherit edilebilir.
//	Private ve default access modifier lar sartlara baglidir.
//	
//	Private --> primitive data ve objelerine, setter, getter araci metodlari ile ulasilir. (encapsulation)
//	Default --> farkli paketlerde oldugunda inherit edilemez. Ayni paket icersindeyse ulasilabilir.
	
	
//			4-super() ile this()’in farki nedir?
	
//	super() --> Bir ust classdan, icerisinde arguman olmayan bos constructori, calistirir.
//	this() ---> Bulundugu class icerisinden, icerisinde arguman olmayan bos constructori, calistirir.
	
//			5-super() ile super.’nin farki nedir?
	
//	super. --> Ust classlardan variable lari yada metodlari cagirir.
//	       --> constructor lari cagirmak icin kullanilmaz.
//	       
//	super() --> Ust classlardan constructor lari cagirmak icin kullanilir. 
	
//			6-this() ile this’in farki nedir?
	
//	this() -->  Icinde bulunulan class’dan constructor cagirmak icin kullanilir.
//	this   -->  Icinde bulunulan class’dan variable ve method cagirmak icin kullanilir.
//	            Parent class’dan variable cagirmak icin de kullanilabilir. Fakat tavsiye edilmez. 
//	            Cunku, child ve parent class’larda ayni 
//	            isimli iki variable varsa, “this” parent class’dan variable cagiramaz.
	
//			7-super. ile this.’nin farki nedir?
	
	
//			8-super() ve this() bulunduklari constructor’da ilk sirada olmalidir.      True 
	
//			9-super() ve this() bir constructor’da sadece 1 kere kullanilabilir.       False
	
//			10-super() ve this() birlikte ayni constructor’da kullanilabilir.          False

}