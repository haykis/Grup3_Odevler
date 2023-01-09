package yasarYilmaz;

public class ArabaKayit {
	
	private String plaka;
	private int id;
	private int model;
	private String motor;
	private String vites;
	private String yakit;
	
		public ArabaKayit() {    }
	
		public ArabaKayit(String plaka, int id, int model, String motor, String vites, String yakit) 
		{
				this.plaka  = plaka;
				this.id    = id;
				this.model = model;
				this.motor = motor;
				this.vites = vites;
				this.yakit = yakit;
//				System.out.println(plaka);
//				System.out.println(id);
//				System.out.println(model);
//				System.out.println(motor);
//				System.out.println(vites);
//				System.out.println(yakit);
				
		}

		public String getPlaka() {
			return plaka;
		}

		public void setPlaka(String plaka) {
			this.plaka = plaka;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getModel() {
			return model;
		}

		public void setModel(int model) {
			this.model = model;
		}

		public String getMotor() {
			return motor;
		}

		public void setMotor(String motor) {
			this.motor = motor;
		}

		public String getVites() {
			return vites;
		}

		public void setVites(String vites) {
			this.vites = vites;
		}

		public String getYakit() {
			return yakit;
		}

		public void setYakit(String yakit) {
			this.yakit = yakit;
		}
		
		

}
