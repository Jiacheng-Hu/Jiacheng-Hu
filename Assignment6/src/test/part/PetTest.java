package test.part;

import c.part.Pet;

public class PetTest {
	public static void main(String[] args) {
		Pet pet = new Pet("Spot", "Mary", "Black and White");
		pet.setSex(1);
		System.out.println(pet.toString() + "\n");
	}
}
