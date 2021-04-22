package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.SelectionSort;

public class SelectionSort {
    /**
     * @param array
     */
    public static void selectionSort( String[] array )
    {
        /**
         *  One by one move boundary of unsorted subarray
         */
        for ( int j=0; j < array.length-1; j++ )
        {
            /**
             * Find the minimum element in unsorted array
             */
            int min = j;
            for ( int k=j+1; k < array.length; k++ )
                if ( array[k].compareTo( array[min] ) < 0 ) min = k;

            /**
             *  Swap the found minimum element with the first
             *  element
             */
            String temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }

    }
}
