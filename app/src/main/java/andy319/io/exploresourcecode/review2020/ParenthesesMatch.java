package andy319.io.exploresourcecode.review2020;

import java.util.Stack;

/**
 * 描述：括号匹配问题。判断一串包含括号的字符串。是否是匹配的
 * {()} 这样是匹配的。}{（）}，这样则表示不匹配
 * 符号有3种 （[{
 * 思路：
 * “ {（）}”这种是括号匹配，而 “{ ] ] { ” 这种就不是括号匹配。
 * 判断一个给定的括号字符串是否是匹配的。对于括号匹配这类的问题可以使用 Stack来处理：
 * 1 . 当碰到”( [ { “这些左括号就进栈。2 . 如果碰到“) ] }”这些右括号时，如果栈为空，则肯定不匹配，返回false。
 * 如果栈不为空，则出栈比较两个括号是否匹配不匹配返回 false 。3 . 如果遍历完整个括号串后栈为空返回true，
 * 否则返回false。
 * <p>
 * https://blog.csdn.net/u013309870/java/article/details/70859622
 * 作者：AndyMa
 * 时间：  2020/5/24 15:35
 */
public class ParenthesesMatch {

    private static String strings = "([{}])";

    public static void main(String args[]) {
        boolean match = match(strings);
        System.out.println("match=" + match);
    }

    public static boolean match(String str) {
        if (str.isEmpty()) {
            return false;
        }
        String left = "([{";
        String right = ")]}";
        Stack<Character> stack = new Stack<>();
        int i = 0;
        char chars[] = str.toCharArray();
        while (i < str.length()) {
            if (left.contains(chars[i] + "")) {
                stack.push(chars[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (left.indexOf(top) != right.indexOf(chars[i])) {
                    return false;
                }
            }
            i++;
        }
        return stack.isEmpty();
    }

}
