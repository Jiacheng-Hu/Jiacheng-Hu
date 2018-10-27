package c.part;

import java.util.Calendar;

public class Cat extends Pet implements Boardable {
	private String hairLength;
	private Calendar start = Calendar.getInstance();
	private Calendar end = Calendar.getInstance();

	public Cat() {

	}

	public Cat(String petName, String ownerName, String color, String hairLength) {
		super(petName, ownerName, color);
		this.hairLength = hairLength;
	}

	public String getHairLength() {
		return hairLength;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CAT:" + "\n");
		sb.append(super.getPetName() + " owned by " + super.getOwnerName() + "\n");
		sb.append("Color: " + super.getColor() + "\n");
		sb.append("Sex: " + super.getSex() + "\n");
		sb.append("Hair: " + this.getHairLength());
		return sb.toString();
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
		cur.set(month, day, year);
		return (cur.after(start) && cur.before(end)) || cur.equals(start) || cur.equals(end);
	}
}
