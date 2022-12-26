package zeynepTubaTur;

	
	import java.util.Scanner;
	
	public class JavaOdev2 {

		public static void main(String[] args) {

	// 1.SORU: Java’da kacis karakterleri (Escape) 

			System.out.println("KIRKLAR\bELI");                                         // \b --> arada bosluk birakmadan birlesik yazdi Backspace ekler diyor ama
												                                        // console da gormedim.
			System.out.println("---------------------------");

			System.out.println("IYIYIM\tMUSAITIM");                                     // \t --> tab kadar boşluk ekler.
			System.out.println("---------------------------");

			System.out.println("MERHABA\rNASILSIN?");                                   // \r --> carriage return ekler. (satir basi)
			System.out.println("---------------------------");

			System.out.println("BUGUN HAVA YAGMURLU.\nYANINA SEMSIYE ALMALISIN");       // \n --> bir satir asagi atlar.
			System.out.println("---------------------------"); 

			System.out.println("\"Buraya gelir misin\" dedi.");                         // \" --> tirnak isareti yapmaya yarar.
			System.out.println("---------------------------");

			System.out.println("selam\fgunaydin");                                      // \f --> form feed ekler. sag tarafi siler.
			System.out.println("---------------------------");

			System.out.println("selam\'selam");                                         // \' --> ' karakteri ekler.
			System.out.println("---------------------------");

			System.out.println("selam\"selam");                                         // \" --> " karakteri ekler
			System.out.println("---------------------------");

			System.out.println("selam\\selam");                                         // \\ --> \ ters slash karakteri ekler
			System.out.println("---------------------------");

	// Ne oldugunu anlayamadigim karakterler :

//	      \0   somlandirma karakteri
//		    \a   bip sesini cikartan karakter
//		    \v   dikey tab      
//		    \f   sayfa ilerleme ne demek?

//		 System.out.println("TUBA\0TUBA"); 

	//   System.out.println("TUBA\aTUBA");

	//   System.out.println("TUBA\vTUBA");

			
			
	// 2. SORU : Create three String variables, first is for your first name; 
//			     second is for your lastname; third is for your address. Print 
//				 them on the console like; the first and the last name will be in 
//				 the first line, and the address will be in the second line.

			String firstName = "Tuba";

			String lastName = "Tur";

			String address = " Fontane strasse 20 ";

			System.out.println(firstName + " " + lastName + "\n" + address);

			
	// 3. SORU: Type a program which converts the mile to kilometer. Mile 
//			    value will be
//			    entered by user. (Use double)
//			    Hint 1: km = mile x 1.6
//			    Hint 2: To get double, use nextDouble()

			Scanner scan = new Scanner(System.in);

			System.out.println("Ne kadar kara mili yol gittiginizi yaziniz : ");

			Double milDegeri = scan.nextDouble();

			Double kiloMetre = milDegeri * 1.6;

			System.out.println(milDegeri + " mil gittiginiz yolun km ye cevrilmis hali: " + kiloMetre + " dir.");

			
	// 4. SORU: Type a program which converts the hours to seconds. Hours 
//			    value will be entered by user. (Use long)
//			    Hint 1: second = hour x 60 x 60
//			    Hint 2: To get long, use nextLong()

			System.out.println("Gunde kac saat ders calistiginizi giriniz:");

			Scanner scan1 = new Scanner(System.in);

			Long hour = scan1.nextLong();

			Long second = hour * 60 * 60;

			System.out.println("Gundelik calistiginiz " + hour + " saatin " + second
					+ " saniyeye cevrildigini onceden hesaplamis miydiniz? ");

			
	// 5. SORU: Kullanicidan karenin bir kenar uzunlugunu alin ve karenin 
//			    cevresini ve alanini hesaplayip yazdirin.

			Scanner scan2 = new Scanner(System.in);

			System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz: ");

			int k = scan2.nextInt();

			int kareninCevresi = 4 * k;

			int kareninAlani = k * k;

			System.out.println("Bir kenar uzunlugunu " + k + " olarak girdiginiz," + "\nKarenin Cevresi: " + kareninCevresi
					+ " olarak hesaplandi." + "\n Karenin Alani: " + kareninAlani + " olarak hesaplandi.");

			
	// 6. SORU: Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini 
//			    ve yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin 

			Scanner scan3 = new Scanner(System.in);

			System.out.println("Lutfen dikdortgenler prizmasinin uzun kenarini giriniz: ");

			int uzun = scan3.nextInt();

			System.out.println("Lutfen dikdortgenler prizmasinin kisa kenarini giriniz: ");

			int kisa = scan3.nextInt();

			System.out.println("Lutfen dikdortgenler prizmasinin yuksekligini giriniz: ");

			int yukseklik = scan3.nextInt();

			int hacim = uzun * kisa * yukseklik;

			System.out.println("Dikdortgenler Prizmasinin Hacmi: " + hacim);

			
	// 7. SORU: Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin.
//			    Isminiz : Okan
//			    Soyisminiz : Kaplan
//			    Kursumuza katiliminiz alinmistir, tesekkur ederiz

			Scanner scan4 = new Scanner(System.in);

			System.out.println("Lutfen adinizi giriniz: ");

			String first_Name = scan4.nextLine();

			System.out.println("Lutfen soyadinizi giriniz: ");

			String last_Name = scan4.nextLine();

			System.out.println("Isminiz : " + first_Name + "\nSoyisminiz : " + last_Name
					+ "\nKursumuza katiliminiz alinmistir, tesekkur ederiz.");
		}
	}