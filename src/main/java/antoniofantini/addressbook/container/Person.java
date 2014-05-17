package antoniofantini.addressbook.container;

import java.util.Date;

public class Person {

	private String fullName;
	private String sex;
	private Date dOB;

	public Person() {
		super();
	}

	public Person(String fullName, String sex, Date dOB) {
		super();
		this.fullName = fullName;
		this.sex = sex;
		this.dOB = dOB;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getdOB() {
		return dOB;
	}

	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}

}
