package zeynepTubaTur;

import java.sql.Date;

public class H14_MasterStudent extends H14_GraduateStudent {

	public H14_MasterStudent(int no, String name, int year, Date dob, String major, String thesis, String advisor) {
		super(no, name, year, dob, major, thesis, advisor);
		// TODO Auto-generated constructor stub
	}

	public void study() {
		super.study();
	}

	public void register() {
		super.register();
	}

	public void writeThesis() {
		super.writeThesis();

		System.out.println("H14_GraduateStudent' den gelen writeThesis() metodu.");
	}

	public void meetWithAdvisor() {
		super.meetWithAdvisor();

		System.out.println("H14_GraduateStudent' den gelen meetWithAdvisor() metodu.");
	}
}
