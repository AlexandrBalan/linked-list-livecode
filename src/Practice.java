import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {
        ListNode myNode = new ListNode();

        myNode.data = 'x';
        // System.out.println(myNode.data);

        ListNode anotherNode = new ListNode();

        anotherNode.data = 't';

        myNode.next = anotherNode;

        ListNode moreNode = new ListNode();
        moreNode.data = 'r';

        anotherNode.next = moreNode;

        ListNode coolNode = new ListNode();
        coolNode.data = 'w';

        coolNode.next = myNode;


        ListNode extra = moreNode;
        moreNode.data = 'e';


        //added a new one myself into the list.
        ListNode hello = new ListNode();
        hello.data = 'x';
        extra.next = hello;

        printList(coolNode);

        int xCount = countX(coolNode);

        System.out.println(xCount);


        // System.out.println(myNode.next.next.data);
        // System.out.println(myNode.next.data);
        // System.out.println(myNode.data);
        // System.out.println(anotherNode.data);
    }

    public static void printList(ListNode head) {
        //starting from head
        //print all data in list in order
        
        //keep track of current, starting at head
        //until end of list
        //      //print out data at current
        //      //move current to the next node

        ListNode current = head;

        while(current != null) {
            System.out.println(current.data);

            current = current.next;
        }
    }
    //this should count how many nodes hold an x
    public static int countX(ListNode head) {
        ListNode current = head;
        int counter = 0;

        while(current != null) {
            if(current.data == 'x') {
                counter++;
            }

            current = current.next;
        }

        return counter;

    }
}
