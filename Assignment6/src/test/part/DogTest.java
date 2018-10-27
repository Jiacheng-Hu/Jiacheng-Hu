package test.part;

import c.part.Dog;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Spot", "Susan", "White", "Medium");
		dog.setSex(3);
		dog.setBoardStart(10, 26, 2018);
		dog.setBoardEnd(12, 26, 2018);
		System.out.println(dog.toString());
		System.out.println(dog.boarding(8, 27, 2018) + "\n");
	}

}
