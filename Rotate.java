public class Rotate {
	public static int[][] rotateArray(int[][] array) {
		int[][] newArray = new int[array.length][array[0].length];
		
        for(int r = 0; r < array.length; r++) {
			int[] temp = array[r];
            for(int c = 0; c < array[0].length; c++) {
				newArray[c][array[0].length - r - 1] = temp[c];
			}
		}
	    return newArray;
    }
}
