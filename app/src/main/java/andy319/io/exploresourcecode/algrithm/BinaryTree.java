package andy319.io.exploresourcecode.algrithm;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * 描述：其实不管是通过队列还是栈。只要保证深度遍历是左孩子先出即可。根左右
 * 作者：mady@akulaku.com
 * 时间： 2018/11/27
 */
public class BinaryTree {

    public static void main(String args[]) {
        /**
         *                  13
         *                 /  \
         *               65    5
         *              /  \    \
         *             97  25   37
         *            /    /\   /
         *           22   4 28 32
         */
        int array[] = {0, 13, 65, 5, 97, 25, 0, 37, 22, 0, 4, 28, 0, 0, 32, 0}; //满二叉树。0表示缺少的节点或者叶子
        BinaryTree binaryTree = new BinaryTree(array);
        binaryTree.depthByStack();
        binaryTree.depthByQue();
        binaryTree.breadthByQue();
    }

    static class TreeNode {

        int value;

        TreeNode left;

        TreeNode right;




    }

    TreeNode root;

    public BinaryTree(int[] array) {
        root = makeBinaryTreeByArray(array, 1);
    }

    public BinaryTree(int size){
        for(int i=0;i<size;i++){

        }
    }

    public static TreeNode makeBinaryTreeByArray(int[] array, int index) {
        if (index < array.length) {
            int value = array[index];
            if (value != 0) {
                array[index] = 0;
                TreeNode t = new TreeNode();
                t.value = value;
                t.left = makeBinaryTreeByArray(array, index * 2); //下标从一开始是乘以2.从0开始是2n+1
                //此代码中第一个元素13是从下标1开始。
                t.right = makeBinaryTreeByArray(array, index * 2 + 1);
                return t;
            }
        }
        return null;
    }

    /**
     * 深度遍历（前序）
     */
    public void depthByStack() {
        if (root == null) {
            System.out.println("empty tree");
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.value + "  ");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) { //后进先出。保证一直是left后进先出
                stack.push(node.left);
            }
        }
        System.out.print("\n");

    }

    /**
     * 深度通过队列.其实这里的push方法。就是栈的效果了。后进先出
     */
    public void depthByQue() {
        if (root == null) {
            System.out.println("empty tree");
            return;
        }

        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.remove(); //取出最先一个
            System.out.print(node.value + "  ");

            if (node.right != null) {
                deque.push(node.right);
            }
            if (node.left != null) {
                deque.push(node.left); //push方法是加入队头。那这里。右先加入头。左再加入头。先出的是左。所以这里push
                //达到的是先进后出的效果。相当于栈
            }
        }
        System.out.print("\n");

    }

    /**
     * 广度优先。借助队列
     */
    public void breadthByQue() {
        if (root == null) {
            System.out.println("empty tree");
            return;
        }

        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.remove(); //取出最先一个  remove 方法跟pop方法都是调用了removefirst。remove相对于队列而言
            //pop相对于栈而言
            System.out.print(node.value + "  ");

            if (node.left != null) {
                deque.add(node.left); //add方法是加入队尾。那这里。左先加入尾。右再加入尾。左在右前面。先出的是左
            }
            if (node.right != null) {
                deque.add(node.right);
            }
        }
        System.out.print("\n");

    }


}
