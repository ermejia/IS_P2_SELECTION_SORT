package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.SelectionSort;

public class Printer {
    /**
     * Prints selection sort array
     * @param arr
     */
    void printArray(String[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
