package aliMustafaZengin;

public class Odev7_1_StaticMember {

	
		static int x;
		int y;
		Odev7_1_StaticMember(){
			x+=2;
			y++;
		}
		//CONSRUCTOR
		static int getSquare(){
			return x*x;
		}//METHOD
		
		public static void main(String[] args) {
			
			Odev7_1_StaticMember sm1= new Odev7_1_StaticMember();
			 //X 2 Y 1
			
			Odev7_1_StaticMember sm2= new Odev7_1_StaticMember();
			//X4 Y 1
			
			int z=sm1.getSquare();
		//X16 
			
			System.out.println("-x "+z+ "-y "+sm2.y);//1 //16
			
		
		

	}

}
