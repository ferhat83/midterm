package algorithm;

import java.util.Arrays;

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

//************************************* quickSort
public int [] quickSort(int [] array, int start, int end){
    int [] list = array;
    final long startTime = System.currentTimeMillis();

    int partition = partition(array, start, end);

    if(partition-1>start){
        quickSort(array, start, partition - 1);
    }
    if(partition+1<end) {
        quickSort(array, partition + 1, end);
    }
    final long endTime = System.currentTimeMillis();
    final long executionTime = endTime - startTime;
    this.executionTime = executionTime;
    return list;
}

    public static int partition(int[] array, int start, int end){
        int pivot = array[end];

        for(int i=start; i<end; i++){
            if(array[i]<pivot){
                int temp= array[start];
                array[start]=array[i];
                array[i]=temp;
                start++;
            }
        }

        int temp = array[start];
        array[start] = pivot;
        array[end] = temp;

        return start;
    }

   //*******************************************************heapSort
   public int [] heapSort(int [] array){
       final long startTime = System.currentTimeMillis();
       int [] list = array;

       int size = array.length;

// Build heap
       for (int i = size / 2 - 1; i >= 0; i--)
           heapify(array, size, i);

// One by one extract (Max) an element from heap and
// replace it with the last element in the array
       for (int i=size-1; i>=0; i--) {

//arrA[0] is a root of the heap and is the max element in heap
           int x = array[0];
           array[0] = array[i];
           array[i] = x;

// call max heapify on the reduced heap
           heapify(array, i, 0);
       }
       final long endTime = System.currentTimeMillis();
       final long executionTime = endTime - startTime;
       this.executionTime = executionTime;
       return list;
   }

    // To heapify a subtree with node i
    void heapify(int arrA[], int heapSize, int i) {
        int largest = i; // Initialize largest as root
        int leftChildIdx = 2*i + 1; // left = 2*i + 1
        int rightChildIdx = 2*i + 2; // right = 2*i + 2

// If left child is larger than root
        if (leftChildIdx < heapSize && arrA[leftChildIdx ] > arrA[largest])
            largest = leftChildIdx ;

// If right child is larger than largest so far
        if (rightChildIdx < heapSize && arrA[rightChildIdx ] > arrA[largest])
            largest = rightChildIdx ;

// If largest is not root
        if (largest != i) {
            int swap = arrA[i];
            arrA[i] = arrA[largest];
            arrA[largest] = swap;

// Recursive call to heapify the sub-tree
            heapify(arrA, heapSize, largest);
        }
    }

//*********************************************************bucketSort

    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int i, j;
        int[] bucket = new int[array.length+1];
        Arrays.fill(bucket, 0);

        for (i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        int k=0;
        for (i = 0; i < bucket.length; i++) {
            for (j = 0; j<bucket[i]; j++) {
                array[k++] = i;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    /*********************************************** Shell Sort ******************************************************/

    public int [] shellSort(int [] array){
        int [] list = array;
        final long startTime = System.currentTimeMillis();
        int n = array.length;


        for (int gap = n/2; gap > 0; gap /= 2)
        {

            for (int i = gap; i < n; i += 1)
            {

                int temp = array[i];


                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];

                array[j] = temp;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}