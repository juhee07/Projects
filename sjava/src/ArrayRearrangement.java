import java.util.*;

public class ArrayRearrangement {

 // Program for rearrange an array such that arr[i] = i.
    int[] fix(int[] a) {
        if(a == null) {
            return null;
        }
        for(int i = 1; i < a.length; i++) {
            if(a[i] >= 0 && a[i] != i) {
                int temp = a[a[i]];
                a[a[i]] = a[i];
                a[i] = temp;
            }
        }
        return a;
    }

    int[] reverseArray(int[] a) {
        if(a == null) {
            return null;
        }
        int start = 0;
        int end = a.length -1;
        while(start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }

    //Given an array of n elements. Our task is to write a program to rearrange the array such that elements
    // at even positions are greater than all elements before it and elements at odd positions are less than all elements before it.
    int[] rearrangeArr(int[] a) {
        if(a == null) {
            return null;
        }
        int length = a.length;
        int evenPositions = length / 2;
        int oddPositions = length - evenPositions;

        int[] temp = new int[length];

        for(int i = 0; i < length; i ++) {
            temp[i] = a[i];
        }
        Arrays.sort(temp);

        int j = oddPositions - 1;

        for(int i = 0; i < length ; i = i+2) {
            a[i] = temp[j];
            j--;
        }

        j = oddPositions;
        for(int i = 1; i < length; i = i+2) {
            a[i] = temp[j];
            j++;
        }

        return a;
    }

    //Rearrange positive and negative numbers with constant extra space
    int[] rearrangePosAndNegative(int[] a) {

        for(int i=1; i < a.length; i++) {
            int key = a[i];
            if(a[i] >= 0 ) {
                continue;
            }
            int j = i-1;
            while(j >= 0 && a[j] >= 0) {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;

        }

        return a;

    }

    int kthLargest(int[] a, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i =0; i < a.length; i++) {
            minHeap.add(a[i]);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }

    void print_N_mostFrequentNumber(int[] a, int n) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])) {
                int value = map.get(a[i]);
                map.put(a[i], value + 1);
            } else {
                map.put(a[i], 1);
            }
        }
    }

    private class DataNode implements Comparator<DataNode> {
        int value;
        int count;

        public DataNode(int value, int count) {
            this.value = value;
            this.count = count;
        }

        @Override
        public int compare(DataNode d1, DataNode d2) {
            if(d1.count > d2.count) {
                return 1;
            } else if (d2.count > d1.count) {
                return -1;
            } else {
                return 0;
            }

        }


    }
}
