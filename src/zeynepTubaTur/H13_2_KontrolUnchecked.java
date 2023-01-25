package zeynepTubaTur;

public class H13_2_KontrolUnchecked {

	public static void konumHesapla(int konumNo) {

		if (konumNo == 0) {

			try {
				throw new ArithmeticException("Konum numarasi 0 olamaz");
			}

			catch (ArithmeticException e) {
				System.out.println("Hatali bir giris yaptiniz.");
				e.printStackTrace();
			}

			finally {
				System.out.println("Kodlar burdan calismaya devam ediyor...");
			}
		}

		else {
			System.out.println("Konum hesaplaniyor." + konumNo);
		}
	}

	public static void main(String[] args) {

		konumHesapla(0);

		System.out.println("Kodlarin devami...");

	}
}