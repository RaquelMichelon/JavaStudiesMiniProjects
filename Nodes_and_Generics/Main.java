import nodesandgenerics.Node;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Node<String> node1 = new Node<>("I'm node 1 content.");
        Node<String> node2 = new Node<>("I'm node 2 content.");
        Node<String> node3 = new Node<>("I'm node 3 content.");
        Node<String> node4 = new Node<>("I'm node 4 content.");

        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);

        //node1->node2->node3->node4->null
        String arrow = " -> ";
        System.out.printf("%s %s %s %s %s %s %s", node1.getContent(),
                arrow, node1.getNextNode().getContent(),
                arrow, node1.getNextNode().getNextNode().getContent(),
                arrow, node1.getNextNode().getNextNode().getNextNode().getContent());
    }
}
