public class FindMedianOfTwoSortedArraysRunner {
    public static void run() {
        FindMedianOfTwoSortedArrays findMedianOfTwoSortedArrays = new FindMedianOfTwoSortedArrays();

        // case1: array of size 2
        int[] a1 = {1, 3};
        int[] b1 = {2, 4};
        System.out.println(findMedianOfTwoSortedArrays.findMedian(a1, b1, 0, 1, 0, 1));

        // case 2: median is equal m1 = m2
        int[] a2 = {1, 3, 5, 7, 9};
        int[] b2 = {1, 2, 5, 6, 10};
        System.out.println(findMedianOfTwoSortedArrays.findMedian(a2, b2, 0, 4, 0, 4));

        //case 3: m1 > m2
        int[] b3 = {1, 3, 5, 7, 9};
        int[] a3 = {2, 4, 6, 8, 10};
        System.out.println(findMedianOfTwoSortedArrays.findMedian(a3, b3, 0, 4, 0, 4));

        //case 3: m1 < m2
        int[] a4 = {1, 3, 5, 7, 9};
        int[] b4 = {2, 4, 6, 8, 10};
        System.out.println(findMedianOfTwoSortedArrays.findMedian(a4, b4, 0, 4, 0, 4));

        int[] a5 = {1, 3, 5, 7, 9, 12};
        int[] b5 = {2, 4, 6, 8, 10, 11};
        System.out.println(findMedianOfTwoSortedArrays.findMedian(a4, b4, 0, 5, 0, 5));

        int[] a6 = {1, 3, 5, 7};
        int[] b6 = {2, 4, 6, 8, 10, 11};
        System.out.println(findMedianOfTwoSortedArrays.findMedian(a4, b4, 0, 3, 0, 5));

    }

}
