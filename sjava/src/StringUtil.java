public class StringUtil {

    void printSubsequences(String s)
    {
        char[] str= s.toCharArray();
        int n = str.length;
        int opsize = (int)(Math.pow(2, n - 1));

        for (int counter = 0; counter < opsize; counter++) {
            for (int j = 0; j < n; j++) {

                System.out.print(str[j]);
                if ((counter & (1 << j)) > 0)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
