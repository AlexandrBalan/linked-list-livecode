import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {
        ListNode myNode = new ListNode();

        myNode.data = 'x';
        // System.out.println(myNode.data);

        ListNode anotherNode = new ListNode();

        anotherNode.data = 't';

        myNode.next = anotherNode;

        // System.out.println(myNode.data);
        // System.out.println(anotherNode.data);
    }
}
