import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

//        LengthOfLongestSubStringRunner lengthOfLongestSubStringRunner = new LengthOfLongestSubStringRunner();
//        lengthOfLongestSubStringRunner.run();

//        MergeKListsRunner mergeKListsRunner = new MergeKListsRunner();
//        mergeKListsRunner.run();

//        AddTwoNumbersRunner addTwoNumbersRunner = new AddTwoNumbersRunner();
//        addTwoNumbersRunner.run();
//
//        MergeTwoListRunner mergeTwoListRunner = new MergeTwoListRunner();
//        mergeTwoListRunner.run();

//        FindMedianOfTwoSortedArraysRunner.run();

//        System.out.println(Palindrome.isPalindrome(121));
//
//        System.out.println(Palindrome.isPalindrome(0));
//
//        System.out.println(Palindrome.isPalindrome(120));
//
//        System.out.println(Palindrome.isPalindrome(12321));
//
//        System.out.println(Palindrome.isPalindrome(1251));
//
//        System.out.println(Palindrome.isPalindrome(-1251));

//        System.out.println(Fibonacci.fib(5));
//
//        System.out.println(Fibonacci.fib(6));
//
//        System.out.println(Fibonacci.fib(100));

//        isValidParenthesesRunner.run();


        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
//        tree.root.right.left = new Node(6);
//        tree.root.right.right = new Node(7);
 //       System.out.println(tree.maxAtLevel(tree.root, 2));
  //      tree.maxLevelSum(tree.root);
//        System.out.println("LCA(4, 5) = " +
//                tree.findLCA(4, 5).data);
//        System.out.println("LCA(4, 6) = " +
//                tree.findLCA(4, 6).data);
//        System.out.println("LCA(3, 4) = " +
//                tree.findLCA(3, 4).data);
//        System.out.println("LCA(2, 4) = " +
//                tree.findLCA(2, 4).data);



        /* Let us test the built tree by printing Insorder traversal */
  //      tree.printPaths(tree.root);
  //      tree.printPathWithGivenSum(tree.root, 18);
  //      tree.postOrderTraversalIterative(tree.root);
   //     tree.inOrderTraversalIterative(tree.root);
    //    tree.preOrderTraversalIterative(tree.root);

//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);


        // print kth ancestor of given node
//        int k = 2;
//        int node = 4;
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);


 //       System.out.println(KthAncestor.kthAncestor(tree.root,5,k,node));

//        LinkedList list = new LinkedList();
//        list.perform();
//        WordLadder wordLadder = new WordLadder();
//        Set<String> dictionary = new HashSet<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
//
//        System.out.println(wordLadder.ladderLength("hit", "cog", dictionary));

        int[] rotated = {11,12,13,7,8,9,10};
        int key = 10;
        ArrayUtil au = new ArrayUtil();
//        System.out.printf("key index of %d is %d", key, au.searchRotated(rotated, key));
//
//        System.out.printf("key index of %d is %d", key, au.searchMinInRotated(rotated));
//
//        int value = au.findMaxInRotatedArray(rotated);
//        System.out.printf("Max index is %d ", value);
//
 //       System.out.println(au.findPairInRotateArray(rotated, 17));

//        int[] arr = {0, 11, 2, 13, 4, 5, 16};
//        int arr1[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
  //      ArrayRearrangement arrayRearrangement = new ArrayRearrangement();
       // arrayRearrangement.fix(arr);
       // System.out.println(Arrays.toString(arr));
        //arrayRearrangement.reverseArray(arr);
     //   arrayRearrangement.rearrangeArr(arr);
     //   arrayRearrangement.rearrangePosAndNegative(arr1);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arrayRearrangement.kthLargest(arr, 3));
//        int[] arr = {1, 3, 0, 2, 5};
//        System.out.println(Arrays.toString(arr));
//        au.printPrevSmaller(arr);

//        int[] arr = {10, 20, 0, 40};
//        int x = 6660;
//        System.out.println(au.isProductExist(arr, x));

//        StringUtil stringUtil = new StringUtil();
//        stringUtil.printSubsequences("abc");
//
//        int a[][] = { {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16} };
//        MatricsUtil.rotatematrix(3, 3, a);

//        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
//        System.out.println("Maximum contiguous sum is " +
//                ArrayUtil.maxSubArraySum(a));

//        int arr[] = new int[] { 3, 7, 90, 20, 10, 50, 40 };
//
//        ArrayUtil.findMinAvgSubarray(arr, 3);
        GenerateBinaryNumbers.generatePrintBinary(10);

    }



























}
