public class LinkedList<S> {
    Node head;

    class Node
    {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {data = d; next = null; }
    }

    public void perform() {

        insertAtFront(1);
        insertAtEnd(3);
        insertAtEnd(5);
        insertAtEnd(5);
        insertAtEnd(6);
        insertAtEnd(6);
        insertAtEnd(6);
        insertAtEnd(7);
        insertAfter(head.next, 4);
        printList();
        System.out.println();

        printMiddle();
        System.out.println();

        printNthFromLast(1);

        System.out.println();
        deleteNode(7);
        deleteNodeAtPosition(5);
        printList();

        System.out.println("Loop found: " + detectLoop(head));

        System.out.println();
        printMiddle();
        System.out.println();
        System.out.println("Total nodes " + countNodes(head));

        System.out.println();
        System.out.println("Node found " + searchNode(head, 10));
        System.out.println();

        System.out.println("Before removing duplicated" );
        printList();
        removeDuplicates(head);
        System.out.println();
        System.out.println("After removing duplicated");
        printList();




    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {

        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = null;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    private void insertAfter(Node prevNode, int i) {
        if(head == null) {
            return;
        }
        if(prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(i);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    void deleteNode(int key) {
        Node temp = head;
        Node prev = null;
        if(temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    private void deleteNodeAtPosition(int i) {
        Node temp = head;
        Node prev = null;
        int count = 0;

        while(temp != null && count != i) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if(temp == null) {
            return;
        }
        prev.next = temp.next;
    }

    private int countNodes(Node head) {
        if(head == null) {
            return 0;
        }
        return 1 + countNodes(head.next);
    }

    private boolean searchNode(Node head, int x) {
        if(head == null) {
            return false;
        }
        if(head.data == x) {
            return true;
        }
        return searchNode(head.next, x);
    }

    void printNthFromLast(int n) {
        Node mainPtr = head;
        Node refPtr = head;
        int count = 0;
        if( head != null) {
            while(refPtr != null && count < n) {
                refPtr = refPtr.next;
                count++;
            }

            if(refPtr == null) {
                return;
            }

            while(refPtr != null) {
                mainPtr = mainPtr.next;
                refPtr = refPtr.next;
            }
            System.out.println("Node from " + n +" Position from Last " + mainPtr.data);
        }
    }

    void printMiddle() {
        Node slowPtr = head;
        Node fastPtr = head;

        if(head != null) {
            while(slowPtr != null && fastPtr != null && fastPtr.next != null) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
            }
        }
        System.out.println("Node in the middle" + slowPtr.data);
    }

    private boolean detectLoop(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;
        while(slowPtr != null && fastPtr != null && fastPtr.next != null ) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }

    /* Function to remove duplicates from a
       sorted linked list */
    private void removeDuplicates(Node head) {
        if(head == null) {
            return;
        }
        Node curr = head;
        Node next_next = null;

        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                next_next = curr.next.next;
                curr.next = next_next;
            } else {
                curr = curr.next;
            }
        }
    }


}
