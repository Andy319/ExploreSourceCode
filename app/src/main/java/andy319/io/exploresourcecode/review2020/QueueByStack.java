package andy319.io.exploresourcecode.review2020;

import java.util.Stack;

/**
 * 描述：栈实现队列
 * 作者：AndyMa
 * 时间：  2020/5/24 14:55
 */
public class QueueByStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public void add(int item) {
        stack1.push(item);
    }

    public int poll() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
