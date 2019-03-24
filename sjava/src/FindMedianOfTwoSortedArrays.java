public class FindMedianOfTwoSortedArrays {

    public double findMedian(int[] a, int[] b, int start_a, int end_a, int start_b, int end_b) {
        double median = 0;

        //  a = 2, 3
        // b = 8, 9
        // merged array = 2, 3, 8, 9
        // median 3+8 /2
        if((end_a - start_a == 1) && (end_b - start_b == 1)) {
            return ((Math.max(a[start_a], b[start_b]) + Math.min(a[end_a], b[end_b])) / 2);
        }

        int mid_a_index = start_a + (end_a - start_a) / 2;
        int mid_b_index = start_b + (end_b - start_b) / 2;

        int median_a = a[mid_a_index];
        int median_b = b[mid_b_index];

        if(median_a == median_b) {
            return median_a;
        }

        if(median_a < median_b) {
            start_a = mid_a_index;
            end_b = mid_b_index;

        }
        if(median_a > median_b) {
            start_b = mid_b_index;
            end_a = mid_a_index;
        }
        return findMedian(a, b, start_a, end_a, start_b, end_b);
    }
}
