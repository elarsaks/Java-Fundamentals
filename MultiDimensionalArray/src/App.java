
public class App {

	public static void main(String[] args) {
		int[] oneDimensionalArray = { 12, 49, 922 };
		int[][] multiDimensionalArray = { { 12, 49, 922 }, oneDimensionalArray, {2, 5, 9} };

		//System.out.println(oneDimensionalArray[0]);
		//System.out.println(multiDimensionalArray[1][0]);

		double[][] doubleArray = new double[4][2];
		
		doubleArray[3][1] = 2.6;

		// System.out.println(doubleArray[3][1]);
		
		for(int array=0; array<multiDimensionalArray.length; array++) {
			for(int item=0; item<multiDimensionalArray[array].length; array++) {
				System.out.println(multiDimensionalArray[array][item] + "\t");
			}
			System.out.println();
		}
	}

}
