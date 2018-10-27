package test.part;

import a.part.Mreview;

public class MreviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mreview mreview = new Mreview("Kill Bill");
		mreview.addRating(5);
		mreview.addRating(4);
		mreview.addRating(5);
		System.out.println(mreview.toString());
	}

}
