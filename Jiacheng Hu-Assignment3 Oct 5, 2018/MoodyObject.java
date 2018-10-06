
public abstract class MoodyObject {
	
	protected abstract String getMood();
	protected abstract void expressFeeling();
	
	public void queryMood(){
		System.out.println("I feel "+getMood()+" today!");
	}
	
}
