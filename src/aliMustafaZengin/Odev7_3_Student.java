package aliMustafaZengin;

 class Odev7_3_Student {

	int number;
	String name;
	static String college="ITS";
	
	
	
	
	public Odev7_3_Student(int r, String n,String college) {
		this.number = r;
		this.name = n;
		this.college = college;
	}




	public static void main(String[] args) {
		
		Odev7_3_Student s1 = new Odev7_3_Student(111,"Karan","MIT");
		

		Odev7_3_Student s2 = new Odev7_3_Student(222,"Aryan","Harvard");
		
		System.out.println(s1.number);//111
		
		System.out.println(s2.number);//222
		
	
		System.out.println(s1.name);//Karan
		System.out.println(s2.name);//Aryan
		
		
		System.out.println(s1.college);//Harvard
	
		System.out.println(s2.college);//Harvard
	
		
		

	}

}
