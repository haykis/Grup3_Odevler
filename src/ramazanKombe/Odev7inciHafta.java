package ramazanKombe;

public class Odev7inciHafta {

	
//	static int x;
//	int y;
//	
//	Odev7inciHafta(){
//		
//		x+=2;
//		y++;
//		
//	}
//	
//	static int getSquer() {
//		
//		return x*x;
//	}
//	
//	public static void main(String[]args) {
//		
//		Odev7inciHafta sm1 = new Odev7inciHafta();
//		Odev7inciHafta sm2 = new Odev7inciHafta();
//		
//		int z = sm1.getSquer();
//		
//		System.out.println("-x"+ z + "-y" + sm2.y);
//		
//	} 
	
//	int count = 0;
//	Odev7inciHafta(){
//		count++;
//		System.out.println(count);
//	}
//	 
//	public static void main(String[]args) {
//	Odev7inciHafta c1 = new Odev7inciHafta ();
//	Odev7inciHafta c2 = new Odev7inciHafta ();
//	Odev7inciHafta c3 = new Odev7inciHafta ();
//	}
	
	int number;
	String name;
	static String college= "ITS";
	

	public Odev7inciHafta(int r, String n,String college) {
		
		this.number = r;
		this.name = n;
		this.college = college;
		
	}
	public static void main(String[]args) {
		
		Odev7inciHafta s1 = new Odev7inciHafta(111,"Karan","MIT");
		System.out.println(s1.college);
		Odev7inciHafta s2 = new Odev7inciHafta(222,"Ayran","Harwerd");
		
		System.out.println(s1.number);
		System.out.println(s2.number);
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s1.college);
		System.out.println(s2.college);
	}
}
	


