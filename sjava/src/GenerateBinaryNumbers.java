import java.util.Queue;
import java.util.LinkedList;

public class GenerateBinaryNumbers {

    static void generatePrintBinary(int n) {
        Queue<String> q = new LinkedList<String>();

        // Enqueue the first binary number
        q.add("1");

        while (n > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+0);
            q.add(s2+1);
            n--;
        }
    }

}
