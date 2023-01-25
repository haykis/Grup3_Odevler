package zeynepTubaTur;

import java.util.Scanner;

public class H13_1_Kontrol {

	public static void main(String[] args) {

		H13_1_Kontrol knt = new H13_1_Kontrol();

		knt.kontrol();
	}

	public void kontrol() {

		Scanner scan = new Scanner(System.in);

		System.out.println("TC kimlik numaranizi giriniz:");

		String TCNumara = scan.nextLine();

		int sonRakam = Integer.parseInt(TCNumara.substring(TCNumara.length() - 1));

		try {
			if (TCNumara.length() != 11)
				throw new IllegalArgumentException("TC numarasi 11 haneli olmalidir.");

			try {
				if (sonRakam % 2 != 0) {
					throw new IllegalArgumentException("TC numarasinin son rakami cift rakam olmalidir. ");
				}

				else {
					System.out.println("TC numaraniz gecerlidir.");
				}
			}

			catch (IllegalArgumentException e) {
				System.out.println("TC numarasinin son rakami hatalidir.");
				e.printStackTrace();
			}
		}

		catch (IllegalArgumentException e) {
			System.out.println("TC numarasinin hane sayisi hatalidir.");
			e.printStackTrace();
		}

		finally {
			scan.close();
		}
	}
}
