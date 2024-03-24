//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Objects;

public class MyLinkedList {
    static int getChecker;
    Node head;

    public MyLinkedList() {
    }

    public static void insert(MyLinkedList list, String word) {
        Node new_node = new Node(word);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last;
            for(last = list.head; last.next != null; last = last.next) {
            }

            last.next = new_node;
        }

    }

    public static void PositiveView(MyLinkedList list, String word) {
        for(Node currNode = list.head; currNode != null; currNode = currNode.next) {
            if (Objects.equals(word, currNode.word)) {
                getChecker = 2;
                return;
            }
        }

    }

    public static void NegativeView(MyLinkedList list, String word) {
        for(Node currNode = list.head; currNode != null; currNode = currNode.next) {
            if (Objects.equals(word, currNode.word)) {
                getChecker = 4;
                return;
            }
        }

    }

    public static void NegationView(MyLinkedList list, String word) {
        for(Node currNode = list.head; currNode != null; currNode = currNode.next) {
            if (Objects.equals(word, currNode.word)) {
                getChecker=getChecker+1;
                return;
            }
        }

    }
}
