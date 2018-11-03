package question5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
	@Test
	void testfindMedianSortedArrays() {
		int[] a = {1,3};
		int[] b = {2};
		Solution test = new Solution();
		assertEquals(test.findMedianSortedArrays(a, b),2.0);
	}
}
