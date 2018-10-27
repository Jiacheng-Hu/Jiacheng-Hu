package c.part;

import java.util.Calendar;

public class Dog extends Pet implements Boardable {

	private String size;
	private Calendar start = Calendar.getInstance();
	private Calendar end = Calendar.getInstance();

	public Dog() {

	}

	public Dog(String petName, String ownerName, String color, String size) {
		super(petName, ownerName, color);
		this.size = size;
	}

	public String getSize() {
		return this.size;
	}

	public String toString() {

		String str = "DOG:\n" + super.toString() + "\nSize: " + getSize();
		return str;
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		start.set(month, day, year);
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		end.set(month, day, year);
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		Calendar cur = Calendar.getInstance();
		cur.set(year, month, day);
		return start.before(cur) && end.after(cur) || cur.equals(start) || cur.equals(end);
	}

}
