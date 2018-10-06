
public class HappyObject extends MoodyObject {

	@Override
	protected String getMood() {
		return "happy";
	}

	@Override
	protected void expressFeeling() {
		System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
	}

	@Override
	public String toString() {
		return "Subject laughs a lot";
	}

}
