
public class InsertionSort {
    public static void main(String[] args) {
        int[] initArray = {1, 4, 5, 2, 3, 6};

        /*
         1 4 5 2 3 6
         ...
         1 4 2 5 ..
         1 2 4 5 ..

         */

        for (int arraySize = 1; arraySize < initArray.length; arraySize++) {
            int pointerIndex = arraySize;

            while ( (initArray[pointerIndex - 1] > initArray[pointerIndex] ) && (pointerIndex > 0) ) {

                int temp = initArray[pointerIndex];
                initArray[pointerIndex] = initArray[pointerIndex - 1];
                initArray[pointerIndex - 1] = temp;

                pointerIndex--;
            }
        }

        for (int i: initArray) {
            System.out.print(i + " ");
        }
    }
}