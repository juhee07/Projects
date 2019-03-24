import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    //Root of the Binary Tree
    Node root;
    Node head;
    Node prev;

    Node findLCA(int n1, int n2)
    {
        return findLCA(root, n1, n2);
    }

    /*Given a binary tree, print out all of its root-to-leaf
      paths, one per line. Uses a recursive helper to do
      the work.*/
    void printPaths(Node node)
    {
        int path[] = new int[1000];
        printPathsRecur(node, path, 0);
    }

    //Print all the paths from root, with a specified sum in Binary tree

    void printPathWithGivenSum(Node node, int target) {
        Stack<Node> stack = new Stack<>();
        int sum = 0;
        printPathWithGivenSumUtil(node, target, sum, stack);
    }

    void postOrderTraversalIterative(Node node) {
        Node curr = node;
        Stack<Node> s = new Stack<>();
        while(true) {
            if(curr != null) {
                s.add(curr);
                curr = curr.left;
            }
            else {
                if (s.empty()) {
                    break;
                }
                if (s.peek().right == null) {
                    Node temp = s.pop();
                    System.out.println(temp.data);

                    if (temp == s.peek().right) {
                        Node temp1 = s.pop();
                        System.out.println(temp1.data);
                    }
                }
                if (!s.empty()) {
                    curr = s.peek().right;
                } else {
                    curr = null;
                }

            }
        }
    }

    void inOrderTraversalIterative(Node node) {
        Node curr = node;
        Stack<Node> s = new Stack<>();
        while(true) {
            if(curr != null) {
                s.add(curr);
                curr = curr.left;
            }
            else {
                if(s.empty()) {
                    break;
                }
                else {
                    Node temp = s.pop();
                    System.out.println(temp.data);
                    curr = temp.right;
                }
            }
        }

    }

    void preOrderTraversalIterative(Node node) {
        Node curr = node;
        Stack<Node> s = new Stack<>();
        while(true) {
            if(curr != null) {
                System.out.println(curr.data);
                s.add(curr);
                curr = curr.left;
            }
            else {
                if(s.empty()) {
                    break;
                }
                else {
                    Node temp = s.pop();
                    curr = temp.right;
                }
            }
        }

    }

    // Find the maximum node at a given level in a binary tree
    int maxAtLevel(Node node, int level) {
        if(node == null) {
            return -1;
        }
        if(level == 0) {
            return node.data;
        }

        int left = maxAtLevel(node.left, level-1);
        int right = maxAtLevel(node.right, level-1);

        return Math.max(left, right);
    }

    // Find maximum level sum in Binary Tree
    void maxLevelSum(Node node) {
        if(node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        int maxSum = 0;
        int level = 0;
        int localLevel = 0;
        int localSum = 0;

        while(!queue.isEmpty()) {
            Node temp = queue.peek();
            queue.remove();
            if(temp == null) {
                if(!queue.isEmpty()) {
                    queue.add(null);
                }
                if(localSum > maxSum) {
                    maxSum = localSum;
                    level ++;
                }
                localSum = 0;
            }
            else {
                if(temp.left != null) {
                    queue.add(temp.left);
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                }
                localSum += temp.data;
            }
        }
        System.out.println("Max Sum = " + maxSum + " is at Level = " + level);

    }

    private void printPathWithGivenSumUtil(Node node, int target, int sum, Stack<Node> stack) {
        if(node == null) {
            return;
        }
        sum = sum + node.data;
        stack.add(node);
        if(sum == target) {
            printStack(stack);
        }
        printPathWithGivenSumUtil(node.left, target, sum, stack);
        printPathWithGivenSumUtil(node.right, target,sum,stack);
        sum -= node.data;
        stack.pop();
    }

    private void printStack(Stack<Node> stack) {

        for(Node node : stack)
        {
            System.out.println(node.data);
        }
    }

    private void printPathsRecur(Node node, int[] path, int i) {
        if(node == null) {
            return;
        }
        path[i] = node.data;
        i++;

        if(node.left == null && node.right == null) {
            printArray(path, i);
        }

        printPathsRecur(node.left, path, i);
        printPathsRecur(node.right, path, i);

    }

    private void printArray(int[] path, int len) {
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.print(path[i] + " ");
        }
        System.out.println("");
    }

    private Node findLCA(Node root, int n1, int n2) {

        if(root == null) {
            return null;
        }
        if(root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = findLCA(root.left, n1, n2);
        Node rightLCA = findLCA(root.right, n1, n2);

        if(leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    private boolean getPath(Node root, int n1, Stack<Node> path) {
        if (root == null) {
            return false;
        }
        if (root.data ==  n1) {
            path.add(root);
            return true;
        }
        if (getPath(root.left, n1, path)) {
            path.add(root);
            return true;
        }
        if (getPath(root.right, n1, path)) {
            path.add(root);
            return true;
        }
        return false;
    }

    private Node findLCA2(Node root, int n1, int n2) {
        Stack<Node> pathA = new Stack<>();
        getPath(root, n1, pathA);

        Stack<Node> pathB = new Stack<>();
        getPath(root, n2, pathB);

        Node parent = null;
        while(!pathA.isEmpty() && !pathB.isEmpty()) {
            if (pathA.peek() == pathB.peek()) {
                parent = pathA.peek();
                pathA.pop();
                pathB.pop();
            } else {
                break;
            }
        }
        return parent;
    }

    private Node extractLeafNodeToDoubleLinkedList(Node root) {
        if(root == null) {
           return null;
        }
        if(root.left == null && root.right == null) {
            if(head == null) {
                head = root;
                prev = root;
            }
            else {
                prev.right = root;
                root.left = prev;
                prev = root;
            }
            return null;

        }
        extractLeafNodeToDoubleLinkedList(root.left);
        extractLeafNodeToDoubleLinkedList(root.right);
        return root;

    }
}
