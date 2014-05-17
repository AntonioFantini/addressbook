package antoniofantini.addressbook.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import antoniofantini.addressbook.container.Person;

public class Utils {
	private static final String MALE = "Male";
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

	public static Date getDateFromString(String date) throws ParseException {
		if (date == null) {
			return null;
		}
		return sdf.parse(date);

	}

	public static Person parsePersonRow(String row) {
		if (row == null) {
			return null;
		}
		String[] personAttributes = row.split(",");
		if (personAttributes.length < 3)
			throw new RuntimeException(
					"People should have Name, Sex and Date of Birth (dd/mm/yy) attributes, written in this order and separated by commas");
		String name = personAttributes[0].trim();
		String sex = personAttributes[1].trim();
		Date dOB = null;
		try {
			dOB = getDateFromString(personAttributes[2].trim());
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		return new Person(name, sex, dOB);
	}

	public static boolean isMale(Person p) {

		if (p == null || p.getSex() == null)
			return false;
		return MALE.equalsIgnoreCase(p.getSex());
	}

	public static boolean isOlder(Date d1, Date d2) {
		if (d1 == null || d2 == null)
			throw new RuntimeException("please provide valid dates");

		return d1.compareTo(d2) < 0;

	}

	public static int daysOfDifference(Date d1, Date d2) {
		return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}

}
