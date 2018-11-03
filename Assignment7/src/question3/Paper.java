package question3;

public class Paper extends Tool {
	public Paper(int strength) {
		this.setStrength(strength);
		this.type = 'p';
	}

	public boolean fight(Tool t) {
		if (t instanceof Rock) {
			if (this.strength * 2 - t.strength > 0) {
				return true;
			} else {
				return false;
			}
		} else if (t instanceof Scissors) {
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
