
// selection sort
public class Sorting {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 3, 7, 9, 2};

        // sort
        int pointer = 0;

        while (pointer < array.length) {
//            printArray(array);
            int indexOfSmallest = pointer;
            for (int i = pointer; i < array.length; i++) {
                if (array[indexOfSmallest] > array[i]) {
                    indexOfSmallest = i;
                }
            }

            if ( indexOfSmallest == pointer) {
                pointer++; // index pointer
                continue; }

            int tempValue = array[indexOfSmallest];
            array[indexOfSmallest] = array[pointer];
            array[pointer] = tempValue;

            pointer++; // index pointer
        }

        printArray(array);


    }

    public static void printArray(Integer[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
