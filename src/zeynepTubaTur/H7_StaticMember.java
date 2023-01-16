package zeynepTubaTur;


	/*
	 * 3) Asagida verilmis olan sayifalardaki kodlari inceleyin, sonuclari tahmin edin, 
	 * daha sonra bu kodlari eclipse’ te yazarak dogru sonucu consol’ a yazdirin. 
	 * Tahmininiz ile gercek sonucu karsilastirin. 
	 * Yalnis tahmin yaptiysaniz sebebini kendi kendinize bulmaya calisin, 
	 * bulamazsaniz grup toplantinizda arkadaslarinizla ve mentorlerinizle birlikte inceleyiniz. 
	 */

public class H7_StaticMember{
	
	static int x;
	int y;
	
	H7_StaticMember(){
		
		x+=2;
		y++;
	}
	static int getSquare() {
		
		return x*x;
	}
	public static void main (String[] args) {
		
		H7_StaticMember sm1 = new H7_StaticMember();
		
		H7_StaticMember sm2 = new H7_StaticMember();
		
		int z = sm1.getSquare();
		
		System.out.print("-x"  + z + "-y" + sm2.y);
	}
}
