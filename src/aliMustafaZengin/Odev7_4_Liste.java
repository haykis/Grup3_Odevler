package aliMustafaZengin;

import java.util.Arrays;

public class Odev7_4_Liste {
	
	public static void main(String[] args) {
		/*Ikinci class’ da ise bu urunleri bir array adi altinda
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
 * 
*/
		
	}
	
	Odev7_4_Urunler  malzeme = new Odev7_4_Urunler();
	
	public String[]  Listeleme(String birinciUrun,String ikinciUrun,String ucuncuUrun,String dorduncuUrun,String besinciUrun) 
	
	{
		
		String arr1[] = new String[5];
		
		arr1[0]= birinciUrun;
		arr1[1]=ikinciUrun;
		arr1[2]=ucuncuUrun;
		arr1[3]=dorduncuUrun;
		arr1[4]=besinciUrun;
		
		
		
	
	return arr1;	
		
	
	}
	
		
			
		
	
	}

