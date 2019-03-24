import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class ArrayUtil {
    public int searchRotated(int[] a, int k) {
        if (a == null || a.length == 0) {
            return -1;
        }
        System.out.println(Arrays.toString(a));
        int start = 0;
        int end = a.length -1;
        int mid = 0;
        while (start <= end ) {
            mid = start + (end - start)/2;

            System.out.printf("start=%d, mid=%d, end=%d\n", start, mid, end);
            if (a[mid] == k) {
                return mid;
            }
            if (a[start] <= a[mid]) {
                if (a[start] <= k && k < a[mid]) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            } else {
                if (a[mid] < k && k <= a[end]) {
                    start = mid +1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }

    public int searchMinInRotated(int[] a) {
        if (a == null || a.length == 0) {
            return -1;
        }
        System.out.println(Arrays.toString(a));
        int start = 0;
        int end = a.length -1;
        int mid = 0;
        while (start <= end ) {
            if (a[start] <= a[end]) {
                return start;
            }
            mid = start + (end - start)/2;

            System.out.printf("start=%d, mid=%d, end=%d\n", start, mid, end);
            if (mid > 0 &&  a[mid-1] >= a[mid]) {
                return mid;
            }
            if (a[start] <= a[mid]) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    int findMaxInRotatedArray(int a[]) {
        if(a == null || a.length == 0) {
            return -1;
        }
        int start = 0;
        int end = a.length -1;
        while( start < end) {
            if(a[start] < a[end]) {
                return end;
            }
            int mid = start + (end - start) / 2;
            if(mid > 0 && a[mid] > a[mid+1]) {
                return mid;
            }
            if(a[start] <= a[mid]) {
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return -1;
    }

    boolean findPairInRotateArray(int a[], int sum) {
        if (a == null || a.length == 0) {
            return false;
        }
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            //if array is not rotated
            if (a[start] < a[end]) {
                return isPairPresent(a, start, end, sum);
            }
            int max = findMaxInRotatedArray(a);
            if (isPairPresent(a, start, max, sum)) {
                return true;
            } else {
                return isPairPresent(a, max + 1, end, sum);
            }
        }

        return false;
    }

    private boolean isPairPresent(int[] a, int start, int end, int sum) {
        while (start < end) {
            if ( a[start] + a[end] == sum) {
                return true;
            }
            if(a[start] + a[end] < sum) {
                start = start +1;
            }
            else {
                end = end -1;
            }
        }

       return false;
    }

    public double[] runningMedian(int[] a) {

        // min heap for higher halves
        // lower value at top
        PriorityQueue<Integer> highers = new PriorityQueue<>();

        // max heap for lower halves
        // higher value at top
        PriorityQueue<Integer> lowers = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        double[] median = new double[a.length];
        for(int i = 0; i < a.length; i++) {
            int num = a[i];
            addNumbersToHeap(num, highers, lowers);
            balanceHeap(highers, lowers);
            median = getMedian(highers, lowers);
        }
        return median;
    }

    private double[] getMedian(PriorityQueue<Integer> highers, PriorityQueue<Integer> lowers) {
        return null;
    }

    private void balanceHeap(PriorityQueue<Integer> highers, PriorityQueue<Integer> lowers) {
    }

    private void addNumbersToHeap(int num, PriorityQueue<Integer> highers, PriorityQueue<Integer> lowers) {

    }

    public void printPrevSmaller(int[] arr) {
        int length = arr.length;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < length; i++) {
            while(!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                System.out.println("_");
            } else {
                System.out.println(stack.peek());
            }
            stack.add(arr[i]);
        }
    }

    boolean isProductExist(int[] arr, int x) {
        Arrays.sort(arr);
        int first = 0;
        int end = arr.length - 1;
        while (first < end) {
            if(Math.multiplyExact(arr[first], arr[end]) == x ) {
                return true;
            }
            if (Math.multiplyExact(arr[first], arr[end]) > x) {
                end--;
            } else {
                first ++;
            }
        }
        return false;
    }

    static int maxSubArraySum(int a[]) {

        int length = a.length;
        int max_so_far =Integer.MIN_VALUE;
        int max_ending_here = 0;
        int start =0;
        int end = 0;
        int s =0;
        for(int i = 0; i < length; i++) {
            max_ending_here = max_ending_here + a[i];
            if(max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if(max_ending_here < 0) {
                max_ending_here = 0;
                s = i+1;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return max_so_far;

    }

    //Find the subarray with least average
    //Given an array arr[] of size n and integer k such that k <= n.

    static void findMinAvgSubarray(int[] arr, int k) {
        if(k > arr.length) {
            return;
        }
        int start_index = 0;
        int curr_min = 0;
        int actual_min = 0;
        for(int i= 0; i < k; i++) {
            curr_min = curr_min + arr[i];
        }
        actual_min = curr_min;
        for(int i = k; i < arr.length; i++) {
            curr_min = curr_min + arr[i] - arr[i-k];

        if(actual_min > curr_min) {
            actual_min = curr_min;
            start_index = i - k + 1;
            }
        }
        System.out.println("actual_min :" + actual_min/k);
        int end_index = start_index + k -1;
        System.out.println("start_index: " + start_index + " end_index: " + end_index );


    }
}


