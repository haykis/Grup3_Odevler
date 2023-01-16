package zeynepTubaTur;

import java.util.Arrays;

//Iki farkli class olusturun. Birinci klasta kullanicidan; bir alisveris 
//sitesinden 5 adet urunu ucretsiz satin alabilme hakki kazandigini soyleyin 
//ve bu 5 urunu isteyin(main method icinden). Ikinci class’ da ise bu urunleri
//bir array adi altinda listeleyen, nonstatic, String array donuslu, 5 
//argumanli bir method olusturunuz. Birinci class’ ta method call uzerinden 
//alacaginiz array verisinin elemanlarini tektek yazdirin. Daha sonra bu 
//arrayin icindeki elemanlari alfabetik siraya gore yazdirin. Arrayin 3. 
//Index’indeki elemani istediginiz bir urunle degistirin. Degistirdiginiz 
//urunun array icinde olup olmadigini sorgulayin, eger urun arrayin icinde 
//ise “degisiklik yaptiginiz urun listeye eklenmistir.” Ibaresini consol’a 
//yazdirin.

import java.util.Scanner;

public class H7_4Kazan {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Migros online alisveris sitesinden 5 adet urun kazandiniz. ");

		System.out.println("Ucretsiz olarak almak istediginiz 5 tane urun giriniz: ");
		System.out.println("Almak istediginiz 1.urunu giriniz:");
		String urun1 = scan.nextLine();
		System.out.println("Almak istediginiz 2.urunu giriniz:");
		String urun2 = scan.nextLine();
		System.out.println("Almak istediginiz 3.urunu giriniz:");
		String urun3 = scan.nextLine();
		System.out.println("Almak istediginiz 4.urunu giriniz:");
		String urun4 = scan.nextLine();
		System.out.println("Almak istediginiz 5.urunu giriniz:");
		String urun5 = scan.nextLine();

		H7_4Array obje = new H7_4Array();

		obje.liste(urun1, urun2, urun3, urun4, urun5);

		// alfabetik sıraya gore yazdırma

		/*
		 * String myArray[] = {urun1, urun2 ,urun3,urun4,urun5};
		 * 
		 * Arrays.sort(myArray);
		 * 
		 * System.out.println(Arrays.toString(myArray));
		 */

		// urunu degistirme ve arama

		String ArrayList[] = { urun1, urun2, urun3, urun4, urun5 };

		System.out.println("Arrayin icindeki elemanlarin alfabetik siraya gore yazilis sekli:");
		
		Arrays.sort(ArrayList);

		System.out.println(Arrays.toString(ArrayList));

		ArrayList[3] = "karpuz";
		
		System.out.println("3. index' deki elemanin bir urunle degistirilmis hali:");

		System.out.println(Arrays.toString(ArrayList));

		System.out.println(Arrays.binarySearch(ArrayList, "karpuz"));

		if ((Arrays.binarySearch(ArrayList, "karpuz") <= 4)) {

			System.out.println("Degisiklik yaptiginiz urun listeye eklenmistir.");

		}
	}
}