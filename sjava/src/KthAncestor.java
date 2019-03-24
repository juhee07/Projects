import java.util.LinkedList;
import java.util.Queue;

/*
Given a binary tree in which nodes are numbered from 1 to n. Given a node and a positive integer K. We have to print the K-th ancestor of the given node in the binary tree. If there does not exist any such ancestor then print -1.

For example in the below given binary tree, 2nd ancestor of node 4 and 5 is 1. 3rd ancestor of node 4 will be -1.
 */

public class KthAncestor {
    static int kthAncestor(Node root, int n, int k, int node)
    {
        // create array to store 1st ancestors
        int ancestors[] = new int[n + 1];

        // generate first ancestor array
        generateArray(root,ancestors);

        // variable to track record of number of
        // ancestors visited
        int count = 0;

        while (node!=-1)
        {
            node = ancestors[node];
            count++;

            if(count==k)
                break;
        }

        // print Kth ancestor
        return node;
    }
    // fucntion to generate array of ancestors
    static void generateArray(Node root, int ancestors[])
    {
        // There will be no ancestor of root node
        ancestors[root.data] = -1;

        // level order traversal to
        // generate 1st ancestor
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while(!q.isEmpty())
        {
            Node temp = q.peek();
            q.remove();

            if (temp.left != null)
            {
                ancestors[temp.left.data] = temp.data;
                q.add(temp.left);
            }

            if (temp.right != null)
            {
                ancestors[temp.right.data] = temp.data;
                q.add(temp.right);
            }
        }
    }
}
