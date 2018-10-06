
public class SadObject extends MoodyObject {

	@Override
	protected String getMood() {
		return "sad";
	}

	@Override
	protected void expressFeeling() {
		System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
	}

	@Override
	public String toString() {
		return "Subject cries a lot";
	}
	
}
