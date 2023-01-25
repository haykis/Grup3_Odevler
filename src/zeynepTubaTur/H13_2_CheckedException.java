package zeynepTubaTur;

//  Bir adet checked, bir adet de unchecked manuel exception 
//  olusturun. Bu exception’ larinizi calistiracak OZGUN bir kodlama 
//  yapin. Checked exception’ inizda throws, unchecked exception’ 
//  inizda try-catch-finally kullanin.


public class H13_2_CheckedException extends Exception {

	public H13_2_CheckedException() {

		super();
	}

	public H13_2_CheckedException(String mesaj) {

		super(mesaj);
	}

}
