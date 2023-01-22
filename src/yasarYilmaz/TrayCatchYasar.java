package yasarYilmaz;
import java.util.Scanner;

public class TrayCatchYasar 
{
	
	public static void main(String[] args) 
	{
		TrayCatchYasar tc_denetle = new TrayCatchYasar();
		tc_denetle.tcSorgula();
	}
	

		public void tcSorgula() 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Tc Numaranızı Giriniz = ");
			String tcNo= scan.nextLine();
//			
			try {
				if (tcNo.length()!=11)
					{
					System.out.println("TC No 11 Rakamdan Oluşur");
				    throw new IllegalArgumentException("TC numarasi 11 Hane olmalidir. ");
					}
				try {
					if (Integer.valueOf(tcNo.substring(10,11)) % 2 != 0)
						{
//						System.out.println("Tc No son Rakam Çift Sayı olmalıdır");
						throw new IllegalArgumentException("TC numarasinin son rakami cift rakam olmalidir. ");
						}
					}
				catch(IllegalArgumentException e) 
					{
					System.out.println("Son Rakam Tek sayı Olamaz");
					e.printStackTrace();
					}
			} 
			catch (IllegalArgumentException e) {
				System.out.println("Tc No Eksik Girildi ");
				e.printStackTrace();
			}
			finally  {
				System.out.println("TC Numaranız =" + tcNo);
				scan.close();
			}
		}
}

	
	

