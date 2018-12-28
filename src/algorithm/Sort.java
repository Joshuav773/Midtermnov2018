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
        if (low > high){
            int next = partition(array, low, high);
            quickSort(array, low, next - 1);
            quickSort(array, next -1, low);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int partition(int [] array, int a, int b){
        int part = a -1;
        int pivot = array[b];
        for (int c = a; c <= b; c++){
            if (array[c] <= pivot){
                part++;
                if (part != c){
                    array[part] = array[part] ^ array[c];
                    array[c] = array[part] ^ array[c];
                    array[part] = array[part] ^ array[c];
                }
            }
        }
        return part;
    }
    
    public int [] heapSort(int [] array){
        final long  startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        buildHeap(array);
        for (int a = array.length - 1; a >= 1; a--){
            int temp = array[0];
            array[0] = array[a];
            array[a] = temp;
            heapify(array, a, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public void buildHeap(int [] array){
        for (int a = array.length /2 - 1; a>= 0; a--){
            heapify(array, array.length, a);
        }
    }
    public void heapify(int[] array, int a, int b){
        int max = b;
        int child = 2 * b + 1;
        if(child < a){
            if(array[child] > array[max]){
                max = child;
            }
            if (child + 1 < a) {
                if (array[child + 1] > array[max]) {
                    max = child + 1;
                }
            }
            if (max != b) {
                int temp = array[b];
                array[b] = array[max];
                array[max] = temp;
                heapify(array, a, max);
            }
        }

    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        int inner, outer;
        int temp;
        int h = 1;
        while(h <= array.length/3)
            h = h*3 + 1;
        while(h>0)
        {
            for(outer=h; outer<array.length; outer++)
            {
                temp = list[outer];
                inner = outer;
                while(inner > h-1 && list[inner-h] >= temp)
                {
                    list[inner] = list[inner-h];
                    inner -= h;
                }
                list[inner] = temp;
            }
            h = (h-1) / 3;
        }

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
