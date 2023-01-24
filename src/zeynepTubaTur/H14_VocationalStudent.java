package zeynepTubaTur;

import java.sql.Date;

public class H14_VocationalStudent extends H14_Student {

	public H14_VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	public void study() {
		super.study();
	}

	@Override
	public void register() {

	}

	public String toString() {
		return "VocationalStudent (no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major
				+ ")";
	}

}
