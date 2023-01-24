package zeynepTubaTur;

import java.sql.Date;

public class H14_GraduateStudent extends H14_Student {

	String advisor;
	String thesis;

	public H14_GraduateStudent(int no, String name, int year, Date dob, String major, String thesis, String advisor) {

		super(no, name, year, dob, major);

		this.advisor = advisor;
		this.thesis = thesis;
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		super.study();
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub

	}

	public void writeThesis() {

	}

	public void meetWithAdvisor() {

	}

}

