public class SelectionSort {
    public static void main(String[] args) {
        int[] initArray = {1, 1, 4, 5, 2, 1, 3, 6, 4};

        // first for loop is for the filling the index
        for (int indexPointer = 0; indexPointer < initArray.length; indexPointer++) {

            int indexOfSmallestNumber = indexPointer; // track the position of the smallest number

            for (int i = indexPointer + 1; i < initArray.length; i++) {

                // if the next value is smaller than my current smallest
                if ( initArray[i] < initArray[indexOfSmallestNumber] ) {
                    // need to update my tracker for the position of the new smallest number
                    indexOfSmallestNumber = i;
                }

            }

            // perform the swapping of the indexes
            int temp = initArray[indexOfSmallestNumber]; // value of smallest number
            initArray[indexOfSmallestNumber] = initArray[indexPointer];
            initArray[indexPointer] = temp;
        }


        // after sort, print final array order
        for (int i:initArray) {
            System.out.print(i + " ");
        }

    }
}
