import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] initArray = {38, 27, 43, 3};
        System.out.println("Length of original: " + initArray.length);
        System.out.println("Original array: ");
        printArray(initArray);

//        int[] initArray = {4, 2};

//        int[] left = Arrays.copyOfRange(initArray, 0, 1);
//        int[] right = Arrays.copyOfRange(initArray, 1, initArray.length);
//        for (int i: left) {
//            System.out.println(i + " ");
//        }
//
//        for (int j: right) {
//            System.out.println(j + " ");
//        }
        int[] sortedArray = mergeSort(initArray);

        // print array
        printArray(sortedArray);

        System.out.println("Length of sorted: " + sortedArray.length);
    }

    public static int[] mergeSort(int[] initArray) {

        if (initArray.length == 1) {
            return initArray;
        }

        int mid = initArray.length / 2;
        int[] left = Arrays.copyOfRange(initArray, 0, mid);
        int[] right = Arrays.copyOfRange(initArray, mid, initArray.length);

        int[] sortedLeft = mergeSort(left);
        int[] sortedRight = mergeSort(right);

        printArray(sortedLeft);
        printArray(sortedRight);

        // final array to be filled up with sorted numbers
        int[] combined = new int[initArray.length];

        int index = 0;
        int leftIndex = 0, rightIndex = 0;
        while ( (leftIndex < sortedLeft.length) && (rightIndex < sortedRight.length)) {

            if (sortedLeft[leftIndex] < sortedRight[rightIndex]) {
                combined[index++] = sortedLeft[leftIndex++];
            } else {
                combined[index++] = sortedRight[rightIndex++];
            }
        }

        // add leftover from sorted left
        while (leftIndex < sortedLeft.length) {
            combined[index++] = sortedLeft[leftIndex++];
        }

        // add leftover from sorted right
        while (rightIndex < sortedRight.length) {
            combined[index++] = sortedRight[rightIndex++];
        }

        return combined;

    }

    public static void printArray(int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
