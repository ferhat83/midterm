package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
//******************************************************************************8
    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_idx])
                    min_idx = j;

                // Swap the found minimum element with the first
                // element
                int temp = array[min_idx];
                array[min_idx] = array[i];
                array[i] = temp;
            }
        }

            final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
//********************************************************8
    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here

        {
            int n = array.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (array[j] > array[j+1])
                    {

                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
        }

        return list;
    }

//**********************************************8
    public void mergesort(int[] input) {
        mergesort(input, 0, input.length - 1);

        final long startTime = System.currentTimeMillis();
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

    }

    private static void mergesort(int[] input, int start, int end) {

// break problem into smaller structurally identical problems
        int mid = (start + end) / 2;
        if (start < end) { mergesort(input, start, mid);
            mergesort(input, mid + 1, end); }
// merge solved pieces to get solution to original problem
        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];
        while (first <= mid && last <= end) {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        while (first <= mid) {
            tmp[i++] = input[first++];
        }
        while (last <= end) {
            tmp[i++] = input[last++];
        } i = 0; while (start <= end) {
            input[start++] = tmp[i++];
        }




    }

//*************************************

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
   //*******************************************************
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

//*********************************************************
    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
   //*******************************************************
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
