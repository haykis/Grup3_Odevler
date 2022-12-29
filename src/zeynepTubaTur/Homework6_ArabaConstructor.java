package zeynepTubaTur;

public class Homework6_ArabaConstructor {

	public static void main(String[] args) {

		Homework6_Araba araba1 = new Homework6_Araba();

		araba1.name = "Mercedes";
		araba1.id = 453465;
		araba1.model = 3;
		araba1.motor = "1.5";
		araba1.vites = "otomatik";
		araba1.yakit = "benzin";

		Homework6_Araba araba2 = new Homework6_Araba();

		araba2.name = "Audi";
		araba2.id = 453466;
		araba2.model = 1;
		araba2.motor = "2.0";
		araba2.vites = "otomatik";
		araba2.yakit = "dizel";

		Homework6_Araba araba3 = new Homework6_Araba();

		araba3.name = "Volkswagen";
		araba3.id = 453467;
		araba3.model = 5;
		araba3.motor = "1.0";
		araba3.vites = "manuel";
		araba3.yakit = "hybrid";

		Homework6_Araba araba4 = new Homework6_Araba("Opel", 453468, 10, "1.5", "manuel", "benzin");

		Homework6_Araba araba5 = new Homework6_Araba("Toyota", 453469, 8, "1.5", "otomatik", "dizel");

	}

}
