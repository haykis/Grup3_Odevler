package zeynepTubaTur;

import java.sql.Date;

public class H14_PhdStudent extends H14_GraduateStudent {

	boolean qualifyingExamTaken;

	public H14_PhdStudent(int no, String name, int year, Date dob, String major, String thesis, String advisor,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, thesis, advisor);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		super.study();

		System.out.println("H14_Student' den gelen study(); metodu.");
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		super.register();

		System.out.println("H14_Student' den gelen register() medodu.");
	}

	@Override
	public void writeThesis() {
		// TODO Auto-generated method stub
		super.writeThesis();

		System.out.println("H14_GraduateStudent' den gelen writeThesis() metodu.");
	}

	@Override
	public void meetWithAdvisor() {
		// TODO Auto-generated method stub
		super.meetWithAdvisor();

		System.out.println("H14_GraduateStudent' den gelen meetWithAdvisor() metodu.");
	}

	public void writePaper() {

	}

}
