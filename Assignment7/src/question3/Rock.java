package question3;

public class Rock extends Tool {
	public Rock(int strength) {
		this.setStrength(strength);
		this.type = 'r';
	}

	public boolean fight(Tool t) {
		if (t instanceof Scissors) {
			if (this.strength * 2 - t.strength > 0) {
				return true;
			} else {
				return false;
			}
		} else if (t instanceof Paper) {
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
