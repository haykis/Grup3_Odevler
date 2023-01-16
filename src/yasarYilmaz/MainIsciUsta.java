package yasarYilmaz;

public class MainIsciUsta {

	public static void main(String[] args)
	{
		double ustaMaasi = 10000.0;
		double isciMaasi = 8500.0;
		UstaBasi maasUsta = new UstaBasi();
		System.out.println(maasUsta.hesapla(ustaMaasi));
		
		IsciMaas maasIsci = new IsciMaas();
		System.out.println(maasIsci.hesapla(isciMaasi));

		
	}

	
	
}
