package a.part;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {
	private String name;
	private ArrayList<Integer> ratings;

	public Mreview() {

	}

	public Mreview(String name) {
		this.name = name;
		ratings = new ArrayList<Integer>();
	}

	public Mreview(String name, ArrayList<Integer> ratings) {
		this.name = name;
		this.ratings = ratings;
	}

	public void addRating(int r) {
		ratings.add(r);
	}

	public double aveRating() {
		int res = 0;
		for (int r : ratings) {
			res += r;
		}
		return Double.parseDouble(String.format("%.2f", ((double) res / ratings.size())));
	}

	@Override
	public int compareTo(Mreview o) {
		return this.name.compareTo(o.name);
	}

	public boolean equals(Mreview o) {
		if (this.name.length() != o.name.length()) {
			return false;
		} else {
			for (int i = 0; i < this.name.length(); i++) {
				if (this.name.charAt(i) != o.name.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}

	public String getTitle() {
		return this.name;
	}

	public int numRatings() {
		return this.ratings.size();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getTitle());
		sb.append(",average " + this.aveRating() + " out of " + this.numRatings() + " ratings");
		return sb.toString();
	}

}
