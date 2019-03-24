public class Palindrome {
    public static boolean isPalindrome(int number) {
        if(number < 0 || (number != 0 && number % 10 == 0)) {
            return false;
        }

        int revNumber = 0;
        while(number > revNumber) {
            int value = number % 10 ;
            revNumber = revNumber * 10 + value;
            number = number /10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return number == revNumber || number == (revNumber / 10);
    }
}
