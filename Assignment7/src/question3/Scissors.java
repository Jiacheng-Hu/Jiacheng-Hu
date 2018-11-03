package question3;

public class Scissors extends Tool {

	public Scissors(int strength) {
		this.setStrength(strength);
		this.type = 's';
	}

	public boolean fight(Tool t) {
		if (t instanceof Paper) {
			if (this.strength * 2 - t.strength > 0) {
				return true;
			} else {
				return false;
			}
		} else if (t instanceof Rock) {
			if (this.strength / 2 - t.strength > 0)
				return true;
			else {
				return false;
			}
		} else {
			if (this.strength - t.strength > 0) {
				return true;
			} else {
				return false;
			}
		}
	}
}
