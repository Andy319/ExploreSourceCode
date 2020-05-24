package andy319.io.exploresourcecode.review2020;

import java.util.Stack;

/**
 * 描述：给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 * 示例 2:
 * <p>
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 * <p>
 * 来源：力扣（LeetCode） 32题
 * 链接：https://leetcode-cn.com/problems/longest-valid-parentheses
 * <p>
 * 思路：用一个栈来存放括号下标信息，用last来记录不是匹配括号的最后一个下标，开始时last=-1.
 * 碰到左括号，入栈，碰到右括号，
 * 1.如果为空，则表示上来就是右括号，不管这是整个字符中的第一个右括号还是前面有一些匹配的了，
 * 起码在这个右括号这里断了。
 * 2.如果不为空。则跟栈的最后压入的匹配，pop出来，
 * 1）此时如果栈为空，则长度为字符串下标i-last。
 * 跟已经比较过的maxlen比较。赋值大的maxlen。
 * 2）如果不为空，则已匹配的长度为下标i减去栈里面的最后压入的还没有匹配的下标。意思是，已经匹配了多少了。
 * 比如（（（）））这种，在匹配到第5个字符时，下标为5，stack.peek=0(第一个)。则为4.
 * 来自：https://blog.csdn.net/u013309870/article/details/70859622
 * <p>
 * 作者：AndyMa
 * 时间：  2020/5/24 19:51
 */
public class LongestValidParentheses {

    public static void main(String[] args) {
        String s = "()";
        int length = longestValidParentheses(s);
        System.out.println("length=" + length);
    }

    public static int longestValidParentheses(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int maxLen = 0;
        int last = -1;
        Stack<Integer> stack = new Stack<>();
        char chs[] = str.toCharArray();
        int i = 0;
        while (i < str.length()) {
            if (chs[i] == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    //b不匹配的下标位置
                    last = i;
                } else {
                    //pop出左括号，与进来的右括号匹配
                    stack.pop();
                    //如果为空，这一次匹配的最大长度为，当前下标减去上次不匹配的位置
                    if (stack.isEmpty()) {
                        maxLen = Math.max(maxLen, i - last);
                    } else {
                        //如果不为空，则此次循环所得到的最大长度为，当前i减去，括号中还没出栈的左括号的下标
                        //（（（（））））
                        maxLen = Math.max(maxLen, i - stack.peek());
                    }
                }
            }
            i++;
        }
        return maxLen;
    }

}
