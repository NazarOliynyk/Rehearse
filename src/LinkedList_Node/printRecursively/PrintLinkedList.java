package LinkedList_Node.printRecursively;

// https://www.youtube.com/watch?v=KaDpzLxQYmY


public class PrintLinkedList {

    private static void printForward(Node head){
        if(head == null) return;
        System.out.print(head.a + " =>> ");
        printForward(head.next);
    }

    private static void printBackward(Node head){
        if(head == null) return;
       // System.out.print(head.a + " =>> ");
        printBackward(head.next);
        System.out.print(head.a + " =>> ");
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        printForward(n1);
        System.out.println();
        printBackward(n1);
    }

}
