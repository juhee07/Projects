public class isValidParenthesesRunner {
    public static void run() {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("{()}"));
        System.out.println(validParentheses.isValid("}}}"));
    }
}
