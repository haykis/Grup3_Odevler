package zeynepTubaTur;

public class Homework1 {
	
	public static void main(String[] args) {

	
	// Primitive Data Types : byte, short, integer, long,  float, double, char, boolean. 

byte variables1 = 18;
System.out.println(variables1);
	
byte variables2 = 90;
System.out.println(variables2);
	
byte variables3 = 100;
System.out.println(variables3);

	
short sayi1;
sayi1= 20;
System.out.println(sayi1);
	
short sayi2;
sayi2 = 30;
System.out.println(sayi2);
	
short sayi3;
sayi3= 20;
System.out.println(sayi1);
	
	
int en, boy , yukseklik;
en = 300;
boy = 400;
yukseklik = 200; 
	
System.out.println("en= "+ en + " boy=" + boy + " yukseklik=" + yukseklik);
	 
	
long ev= 1500000000 ;
long araba = 60000000;
long tatil = 50000;
	
System.out.println("ev= " + ev + " araba= " + araba + " tatil= " + tatil);
	
	
	
float buyukSayi= 10.5f;
float ortancaSayi= 8.5f;
float kucukSayi= 6.5f;

System.out.println("buyukSayi= " + buyukSayi + " ortancaSayi= " + ortancaSayi + " kucukSayi= " + kucukSayi);


double dsayi1=0.1, dsayi2=0.2, dsayi3=0.3;

System.out.println("dsayi1: " + dsayi1 + "  dsayi2: " + dsayi2  +  "  dsayi3: " + dsayi3 );



char A= 'A';
char B= 'B';
char C= 'C';
System.out.println("A= " +'A' + "  B= " +'B'+ "  C= " +'C' );


char g= 'X';
System.out.println("char g nin degeri= " + g);    

char h= 65;
System.out.println("h nin degeri=" + h);




boolean f= true;
System.out.println("f nin degeri= " + f );
  
boolean i=9>10;
System.out.println("i nin degeri= " + i );

boolean n=5>=5;
System.out.println("n:" + n);




// Max. and Min. values of the Primitive Data Types

byte maxDegerByte = Byte.MAX_VALUE; 
System.out.println("ByteMaxDegerimiz: " + maxDegerByte );

byte minDegerByte = Byte.MIN_VALUE;
System.out.println("ByteMinDegerimiz: " + minDegerByte);



short ustDegerShort = Short.MAX_VALUE;
System.out.println("ustDeger_short= " + ustDegerShort);

short altDegerShort = Short.MIN_VALUE;
System.out.println("altDeger_short= " + altDegerShort);

 


int maxDegerInt1 = Integer.MAX_VALUE;
System.out.println("intMax: " + maxDegerInt1);

int minDegerInt1 = Integer.MIN_VALUE;
System.out.println("intMin: " + minDegerInt1);



long maxDegerLong = Long.MAX_VALUE;
System.out.println("longMax:" + maxDegerLong);

long minDegerLong = Long.MIN_VALUE;
System.out.println("longMin:" + minDegerLong);



System.out.println("F-max:" + Float.MAX_VALUE); 
System.out.println("F-Min:" + Float.MIN_VALUE);



System.out.println("D.Max: " + Double.MAX_VALUE);
System.out.println("D.Min: " + Double.MIN_VALUE);


System.out.println("D.Min: " + Double.MIN_VALUE);



//System.out.println(Char.MAX_VALUE);
//System.out.println(Char.MIN_VALUE);


//System.out.println(Boolean.MAX_VALUE);
//System.out.println(Boolean.MIN_VALUE);

// char ve boolean icin max ve min degerlerini yazdiramiyoruz. 


}
}
