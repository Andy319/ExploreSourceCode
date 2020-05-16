package andy319.io.exploresourcecode.algrithm;

import java.util.Stack;

/**
 * 描述：考察点在于取的时候
 * 栈是后进先出。队列是后进后出
 * 那就再给个辅助栈。再放一次。这样第一个栈后进去的。到了第二个栈成了先进去的。
 * 然后就会后出。 即后进后出。
 * 统一。第一个栈先进去的。到了第二个栈成了就进去的。会先出。即先进先出。
 *
 * 作者：mady@akulaku.com
 * 时间： 2018/11/27
 */
public class QueueByStack {

    // add; poll;

    Stack<Integer> stack1 = new Stack();

    Stack<Integer> stack2 = new Stack<>();


    private void add(int num) {
        stack1.push(num);


    }

    /**
     * /**
     * * Retrieves and removes the head of this queue,
     * * or returns {@code null} if this queue is empty.
     * *
     */
    private int poll() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

}
