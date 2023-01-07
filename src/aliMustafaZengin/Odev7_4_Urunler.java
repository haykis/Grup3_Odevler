package aliMustafaZengin;

import java.util.Arrays;
import java.util.Scanner;

public class Odev7_4_Urunler {

	public static void main(String[] args) {

/*Iki farkli class olusturun. 
 * Birinci klasta kullanicidan; bir alisveris sitesinden 5 adet urun
 * u ucretsiz satin alabilme hakki kazandigini soyleyin ve
 *  bu 5 urunu isteyin(main method icinden).
 *   Ikinci class’ da ise bu urunleri bir array adi altinda
 *    listeleyen, nonstatic, String array donuslu,
 *     5 argumanli bir method olusturunuz.
 *      Birinci class’ ta method call uzerinden alacaginiz 
 *      array verisinin elemanlarini tektek yazdirin.
 *       Daha sonra bu arrayin icindeki elemanlari alfabetik siraya
 *        gore yazdirin.
 *         Arrayin 3. Index’indeki elemani istediginiz bir urunle 
 *         degistirin. 
 *         Degistirdiginiz urunun array icinde olup olmadigini
 *          sorgulayin, eger urun arrayin icinde ise
 *           “degisiklik yaptiginiz urun listeye eklenmistir.” 
 * Ibaresini consol’a yazdirin. 
 */
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("5 tane urun kazandiniz urunleri giriniz");
		System.out.println("Bırıncı urunu gırınız?");
		String birinciUrun = scan.nextLine();
		System.out.println("Ikinci urunu gırınız?");
		String ikinciUrun = scan.nextLine();
		System.out.println("Ucuncu urunu gırınız?");
		String ucuncuUrun = scan.nextLine();
		System.out.println("Dorduncu urunu gırınız?");
		String dorduncuUrun = scan.nextLine();
		System.out.println("Besincı urunu gırınız?");
		String besinciUrun = scan.nextLine();
		
		
		Odev7_4_Liste liste = new Odev7_4_Liste();
		
		String arr1[] = liste.Listeleme(birinciUrun,ikinciUrun,ucuncuUrun,dorduncuUrun,besinciUrun);
		
		System.out.println(Arrays.toString(arr1));
		
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		arr1[2]="yeni urun";
		System.out.println(Arrays.toString(arr1));
		
		int a=Arrays.binarySearch(arr1, "yeni urun");
		if (a<0) {
		System.out.println("Aradiginiz urun eklenmedi");
		}
		else {
			System.out.println("Tebrikler aradiginiz urun mevcut "+(a+1)+".sirada");
		}
		
		
	}
		
		

	}


