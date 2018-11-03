package question4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SolutionTest {
	@Test
    public void mergeIntervalListTest() {
                List<Interval> ranges = new ArrayList<>();

       Interval interval1 = new Interval(1, 3);
       Interval interval2 = new Interval(2, 4);
       Interval interval3 = new Interval(5, 7);
       Interval interval4 = new Interval(6, 8);

       ranges.add(interval1);
       ranges.add(interval2);
       ranges.add(interval3);
       ranges.add(interval4);
       
		assertEquals("[{1,4}, {5,8}]",Solution.merge(ranges).toString());
    
    }
}
