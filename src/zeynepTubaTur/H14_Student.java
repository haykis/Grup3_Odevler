package zeynepTubaTur;

import java.sql.Date;

public abstract class H14_Student {

	int no;
	String name;
	int year;
	Date dob;
	String major;

	public H14_Student(int no, String name, int year, Date dob, String major) {
		super();
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}

	public void study() {

	}

	public abstract void register();

	@Override
	public String toString() {
		return "Student (no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + ")";
	}

}
