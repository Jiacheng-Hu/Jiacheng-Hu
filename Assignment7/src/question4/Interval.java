package question4;

public class Interval {
	private int start;
	private int end;

	public Interval(int start, int end) {

		try {
			if (end < start) {
				throw new Exception();
			}
			this.start = start;
			this.end = end;
		} catch (Exception e) {
			System.out.println(
					"Error: END (" + end + ") integer must be Equal To or Greater Than START (" + start + ") integer ");
		}
	}

	public boolean isOverlappedWith(Interval interval) {

		if (this.start <= interval.start && this.end >= interval.start) {
			return true;
		}
		if (interval.start <= this.start && interval.end >= this.start) {
			return true;
		}
		return false;
	}

	public Interval merge(Interval interval) {
		int newStart = this.start;
		int newEnd = this.end;
		if (this.isOverlappedWith(interval)) {
			if (interval.start < newStart) {
				newStart = interval.start;
			}
			if (interval.end > newEnd) {
				newEnd = interval.end;
			}
		}
		return new Interval(newStart, newEnd);
	}

	public String toString() {
		return "{" + this.start + "," + this.end + "}";
	}
}
