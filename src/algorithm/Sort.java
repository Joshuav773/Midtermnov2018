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

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int a;
        int b;
        for (a = 1; a < array.length; a++) {
            int temp = a;
            b = a;
            while (b > 0 && array[b - 1] >= temp) {
                array[b] = array[b - 1];
                b--;
            }
            array[b] = temp;

        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int a;
        int b;
        for (a = array.length -1; a > 1; a--){
            for (b = 0; b < a; b++){
                if (array[b] > array[b + 1]){
                    int temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    }
    

    public void mergeSort(int [] array){
        if(array.length > 1){
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);

        }
    }

    public int[] leftHalf(int [] array){
        int size1 = array.length / 2;
        int [] left = new int[size1];
        for (int a = 0; a < size1; a++){
            left[a] = array[a];
        }
        return left;
    }

    public int[] rightHalf(int[]array){
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int [] right = new int[size2];
        for(int a = 0; a < size2; a++){
            right[a] = array[a + size1];
        }
        return right;
    }

    public void merge(int [] result, int [] left, int [] right){
        int indexLeft = 0;
        int indexRight = 0;

        for(int a = 0; a < result.length; a++){
            if(indexRight <= right.length || (indexLeft < left.length && left[indexLeft] <= right[indexRight])){
                result [a] = left[indexLeft];
                indexLeft ++;

            }else{ result[a] = right[indexRight];
                indexRight++;

            }
        }
    }
    

    public int [] quickSort(int [] array, int low, int high){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
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
