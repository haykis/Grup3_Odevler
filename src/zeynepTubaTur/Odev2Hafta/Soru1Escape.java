package zeynepTubaTur.Odev2Hafta;

public class Soru1Escape {

	public static void main (String[] args) {
		
		
		 System.out.println("KIRKLAR\bELI");                                         //	   \b -->  arada bosluk birakmadan birlesik yazdi Backspace ekler diyor ama console da gormedim.
		 System.out.println("---------------------------");		
		 
		  
		 System.out.println("IYIYIM\tMUSAITIM");                                     //	   \t -->  tab kadar boşluk ekler.
		 System.out.println("---------------------------");		
		 
		 
		 System.out.println("MERHABA\rNASILSIN?");                                   //	    \r -->  carriage return ekler. (satir basi)
		 System.out.println("---------------------------");		
		 
		 
		 System.out.println("BUGUN HAVA YAGMURLU.\nYANINA SEMSIYE ALMALISIN");       //	    \n -->  bir satir asagi atlar.
	     System.out.println("---------------------------");		 
		
	     
		 System.out.println("\"Buraya gelir misin\" dedi.");                         //	    \" -->  tirnak isareti yapmaya yarar.
		 System.out.println("---------------------------");	
		 
		 
		 System.out.println("selam\fgunaydin");                                      //     \f  -->  form feed ekler. sag tarafi siler.
		 System.out.println("---------------------------");	
		 
		 System.out.println("selam\'selam");                                         //     \'  -->  ' karakteri ekler.
		 System.out.println("---------------------------");	 
		 
		 
	     System.out.println("selam\"selam");                                        //      \"  -->   " karakteri ekler
	     System.out.println("---------------------------");	
	     
	     
	     System.out.println("selam\\selam");                                        //      \\  -->   \ ters slash karakteri ekler
	     System.out.println("---------------------------");	
		 
		 
		 int a = 4;
	        int b = 2;

	        boolean islem1 = a < b; // a, b'den küçük mü?
	        boolean islem2 = a > b; // a, b'den büyük mü?
	        boolean islem3 = a <= b; // a, b'den küçük veya eşit mi?
	        boolean islem4 = a >= b; // a, b'den büyük veya eşit mi?
	        boolean islem5 = a == b; // a, b'ye eşit mi?
	        boolean islem6 = a != b; // a, b'ye eşit değil mi?
		 
	        System.out.println("İşlem1: "+islem1+"\nİşlem2: "+islem2+"\nİşlem3: "+islem3+"\nİşlem4: "+islem4+"\nİşlem5: "+islem5+"\nİşlem6: "+islem6);
		 
		 
	
	
// Ne oldugunu anlayamadigim karakterler :

//      \0   somlandirma karakteri
//	    \a   bip sesini cikartan karakter
//	    \v   dikey tab      
//	    \f   sayfa ilerleme ne demek?

	      
	      
//	 System.out.println("TUBA\0TUBA"); 
	      
//   System.out.println("TUBA\aTUBA");
	
//   System.out.println("TUBA\vTUBA");
	      
	      
	}
}
