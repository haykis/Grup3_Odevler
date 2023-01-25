package zeynepTubaTur;

import java.io.IOException;
import java.util.Scanner;

public class H13_2_KontrolChecked {

	public static void yasKontrol(int yas) throws IOException {

		if (yas < 18) {
			throw new IOException();
		}

		else {
			System.out.println("Yasal yastasiniz.");
		}
	}

	public static void main(String[] args) throws IOException {

		yasKontrol(15);

		System.out.println("Yasiniz 18 den kucuk. " + "Bu kodu calistirmaya devam etmiyor.");
	}
}
