/** 
*  The Sorting class provides methods to sort an array using 
*  BubbleSort, SelectionSort, and InsertionSort algorithms. 
*  It prints the array after each pass of the sorting algorithm. 
*/
public class Sorting {
    
    /** 
    * The main method initializes arrays and calls the sorting methods. 
    * 
    * @param args Command line arguments (not used). 
    */
    public static void main(String[] args) {
        int[] array = {6, 3, 11, 4, 9, 8, 17, 7};
        bubbleSort(array);

        int[] array2 = {6, 3, 11, 4, 9, 8, 17, 7};
        selectionSort(array2);

        int[] array3 = {6, 3, 11, 4, 9, 8, 17, 7};
        insertionSort(array3);
    }

    /** 
    * Sorts the given array using the BubbleSort algorithm. 
    * Prints the array after each pass. 
    * @param array The array to be sorted. 
    */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.print("After pass " + (i + 1) + ": ");
            printArray(array);
        }
    }

    /** 
    * Sorts the given array using the SelectionSort algorithm. 
    * Prints the array after each pass. 
    * @param array The array to be sorted. 
    */
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            System.out.print("After pass " + (i + 1) + ": ");
            printArray(array);
        }
    }

    /** 
    * Sorts the given array using the InsertionSort algorithm. 
    * Prints the array after each pass. 
    * @param array The array to be sorted. 
    */
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
            System.out.print("After pass " + i + ": ");
            printArray(array);
        }
    }

    /** 
    * Prints the contents of the given array. 
    * 
    * @param array The array to be printed. 
    */
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
