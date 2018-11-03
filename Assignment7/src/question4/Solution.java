package question4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static List<Interval> merge(List<Interval> intervals) {

		List<Interval> originalIntervals = new LinkedList<>();
		for (Interval interval : intervals) {
			originalIntervals.add(interval);
		}

		List<Interval> mergedIntervals = new LinkedList<>();
		Interval analized;
		Interval compared;
		int i = 0;
		int j = 0;

		while (i < originalIntervals.size()) {
			analized = originalIntervals.get(i);
			while (j < originalIntervals.size()) {
				if (i != j) {
					compared = originalIntervals.get(j);
					if (analized.isOverlappedWith(compared)) {
						mergedIntervals.add(analized);
						mergedIntervals.add(compared);
						originalIntervals.add(analized.merge(compared));
						break;
					}
				}
				j++;
			}

			if (!mergedIntervals.isEmpty()) {
				originalIntervals.removeAll(mergedIntervals);
				mergedIntervals.clear();
				i = -1;
			}
			i++;
		}

		return originalIntervals;
	}

	public static void main(String[] args) {

		List<Interval> ranges = new ArrayList<>();

		Interval interval1 = new Interval(1, 3);
		Interval interval2 = new Interval(2, 4);
		Interval interval3 = new Interval(5, 7);
		Interval interval4 = new Interval(6, 8);

		ranges.add(interval1);
		ranges.add(interval2);
		ranges.add(interval3);
		ranges.add(interval4);

		System.out.println(merge(ranges));

	}

}
