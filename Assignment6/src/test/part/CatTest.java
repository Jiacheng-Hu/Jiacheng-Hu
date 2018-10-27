package test.part;

import c.part.Cat;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("Tom", "Bob", "Black", "short");
		cat.setSex(3);
		cat.setBoardStart(10, 26, 2018);
		cat.setBoardEnd(12, 26, 2018);
		System.out.println(cat);
		System.out.println(cat.boarding(12, 25, 2018));
	}

}
