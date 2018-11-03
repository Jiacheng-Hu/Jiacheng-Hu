package question1;

import java.io.File;
import java.io.RandomAccessFile;

public class MyIndexOutOfBoundException extends Exception {
	int lowerBound;
	int upperBound;
	int index;

	public MyIndexOutOfBoundException(int[] arr, int index) {
		this.lowerBound = 0;
		this.upperBound = arr.length - 1;
		this.index = index;
	}

	@Override
	public String toString() {
		return "\n Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: "
				+ upperBound;
	}

	public static void main(String[] args) throws MyIndexOutOfBoundException {
		int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try {
			for (int i = 0; i < 11; i++) {
				System.out.println(test[i]);
			}
		} catch (Exception e) {
			throw new MyIndexOutOfBoundException(test, Integer.valueOf(e.getMessage()));
		} finally {
			System.out.println("End");
		}
	}

}
