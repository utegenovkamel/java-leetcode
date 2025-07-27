import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{' || c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void test() {
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "({[]})";

        // Вызов метода isValid из класса _20_Valid_Parentheses
        boolean result1 = _20_Valid_Parentheses.isValid(s1);
        boolean result2 = _20_Valid_Parentheses.isValid(s2);
        boolean result3 = _20_Valid_Parentheses.isValid(s3);

        // Вывод результатов
        System.out.println(s1 + " -> " + result1);  // true
        System.out.println(s2 + " -> " + result2);  // false
        System.out.println(s3 + " -> " + result3);  // true
    }
}
