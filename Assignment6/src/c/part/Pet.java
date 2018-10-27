package c.part;

public class Pet {

	public static final int MALE = 1;
	public static final int FEMALE = 2;
	public static final int SPAYED = 3;
	public static final int NEUTERED = 4;

	private String petName;
	private String ownerName;
	private String color;
	protected int sex;

	public Pet() {

	}

	public Pet(String petName, String ownerName, String color) {
		this.petName = petName;
		this.ownerName = ownerName;
		this.color = color;
	}

	public String getPetName() {
		return this.petName;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public String getColor() {
		return this.color;
	}

	public void setSex(int sexid) {
		this.sex = sexid;
	}

	public String getSex() {
		switch (this.sex) {
		case MALE:
			return "Male";
		case FEMALE:
			return "Female";
		case SPAYED:
			return "Spayed";
		case NEUTERED:
			return "Neutered";
		}
		return "";
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getPetName() + " owned by " + this.getOwnerName() + "\n" + "Color:" + this.color + "\n" + "Sex:"
				+ this.getSex());
		return sb.toString();
	}

}
