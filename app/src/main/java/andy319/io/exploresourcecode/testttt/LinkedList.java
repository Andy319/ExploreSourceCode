package andy319.io.exploresourcecode.testttt;

/**
 * 描述：有序单链表合并
 * 作者：mady@akulaku.com
 * 时间： 2018/12/12
 */
public class LinkedList {

    public static void main(String args[]){



    }

    private Node mergeTwoList(Node n1,Node n2){

        Node head=null;
        if(n1==null){
            return n2;
        }
        if(n2==null){
            return n1;
        }
        if(n1.val<=n2.val){
            head=n1;
            n1=n1.next;
        }else {
            head=n2;
            n2=n2.next;
        }

        Node temp=head;
        while (n1!=null&&n2!=null){
            if(n1.val<=n2.val){
                temp.next=n1;
                n1=n1.next;
            }else {
                temp.next=n2;
                n2=n2.next;
            }
            temp=temp.next;
        }
        if(n1==null){
            temp.next=n2;
        }
        if(n2==null){
            temp.next=n1;
        }

        return head;

    }

    public static class Node{

        int val;
        Node next;

        Node(int val){
            this.val=val;
        }

    }

}
