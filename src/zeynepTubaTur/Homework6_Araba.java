package zeynepTubaTur;

public class Homework6_Araba {

	// Soru 2
	// Github hessabindan ders6 yi kendi local calisma ortaminiza pull ediniz. Araba
	// classi icindeki ozellikleri kullanarak Constructor classinda nesne uretiniz.

	public Homework6_Araba() {
		// Bu parametresiz constructor
	}

	public Homework6_Araba(String name, int id, int model, String motor, String vites, String yakit) {
		// Bu parametreli constructor
		this.name = name;
		this.id = id;
		this.model = model;
		this.motor = motor;
		this.vites = vites;
		this.yakit = yakit;
	}

	// Araba classinin ozellikleri
	String name; // marka
	int id; // ilan numarasi
	int model; // kac yasinda
	String motor; // 1.0 ---- 1.5 ---- 2.0
	String vites; // otomatik , manuel
	String yakit; // hybrid - benzin- dizel

}
