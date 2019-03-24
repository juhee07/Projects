public class LengthOfLongestSubStringRunner {

    public void run() {

        LengthOfLongestSubString lengthOfLongestSubString = new LengthOfLongestSubString();

        String s = "abcabcaaa";
        System.out.print(lengthOfLongestSubString.findLengthOfLongestSubstring(s));

        String s1 = "dfghfg";
        System.out.print(lengthOfLongestSubString.findLengthOfLongestSubstring(s1));
    }

}
