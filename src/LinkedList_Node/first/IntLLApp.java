package LinkedList_Node.first;


// https://www.youtube.com/watch?v=gwc9SJtquqg


import java.util.LinkedList;

public class IntLLApp {

    public static void main(String[] args) {

        IntNode front = new IntNode(25, null);
        System.out.println(front);

        StringNode strFront = new StringNode("Evergalde", null);

        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add("DDD");
        linkedList.add(4);
        // linkedList.add(4, 11); index out of bound
        System.out.println(linkedList);
    }
}
