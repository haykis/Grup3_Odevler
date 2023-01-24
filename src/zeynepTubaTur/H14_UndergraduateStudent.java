package zeynepTubaTur;

import java.sql.Date;

public class H14_UndergraduateStudent extends H14_Student {

	String minor;

	public H14_UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}