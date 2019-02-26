package andy319.io.exploresourcecode.testttt;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 描述：队列先进先出。栈先进后出
 * .因为队列先进先出。所以无法像栈变队列那样简单的再进出一次了。
 * 现在的方法是。一个空队列。一个有数据队列。pop时。让有数据队列的不包括队尾的所有数据进入空队列。
 * 那么我们pop的时候。取出有数据队列剩下的这个即可。剩下的这个就是最后进去的。然后变成栈。先出了。
 *
 * 作者：mady@akulaku.com
 * 时间： 2018/11/27
 */
public class StackByQueue {

    Queue<Integer> q1 = new ArrayDeque<>();

    public void push(int num) {
        q1.add(num);
    }


}
