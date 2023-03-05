package nodesandgenerics;

import java.util.Collection;

//T means Generic Type
public class Node<T> {

    private T content;
    private Node<T> nextNode;

    public Node(T content) {
        this.content = content;
        this.nextNode = null; //the last node is always null, so we set it as null first just in case this is the last one
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }
}
