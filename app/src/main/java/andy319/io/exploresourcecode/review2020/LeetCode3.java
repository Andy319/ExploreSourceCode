package andy319.io.exploresourcecode.review2020;

import java.util.HashMap;

/**
 * 描述：
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 思路：滑动窗口思路。
 * 往map里不停的放值。key是字符串的字符，value是下标。
 * 判断包含，则将窗口开始位置置为包含的字符的下一个字符
 * 如abca 。前三个字符进入map。abc 。到下一个a时，map包含a，则下一个起始位置为a的下一个，b
 * 每次遇到重复的此次的长度为，下标减去前一次出现的位置加1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 作者：AndyMa
 * 时间：  2020/5/28 23:46
 */
public class LeetCode3 {

    public static void main(String[] args) {
        int longest = lengthOfLongestSubString("abcdaab");
        System.out.println("longest=" + longest);
    }

    private static int lengthOfLongestSubString(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {

                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
