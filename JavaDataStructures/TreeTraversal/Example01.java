package com.michelon.algorithms;
//create a simple Node class
public class Node {
  String value;
  Node left;
  Node right;
  
  public Node(String value) {
    this.value = value;
    }
}



package com.michelon.algorithms;

public class Example01 {
  
  public static void main(String[] args) {
    Node data = createData();
    preorderTraversal(data); //a b c e f d g
    postorderTraversal(data); //f e c d b g a
    inorderTraversal(data); //e f c b d a g
    
  }
  
  public static void preorderTraversal(Node n) {
    //down the tree by all lefts then back up getting the rights
    
    if(n == null){
      return; //don't do anything
    }
    //print it before
    System.out.println(n.value + "  "); //go and print a then 
    preorderTraversal(n.left); //is a recursive algorithm; then go left and print b, then c, then e
    preorderTraversal(n.right); //is a recursive algorithm
  }
  
  public static void postorderTraversal(Node n) {
    //go to the button first and then start printing
    if(n == null){
      return;
    }
    postorderTraversal(n.left);
    postorderTraversal(n.right);
    System.out.println(n.value + "  "); //print it after
  }
  
  public static void inorderTraversal(Node n) {
    if(n == null){
      return;
    }
    inorderTraversal(n.left);
    System.out.println(n.value + "  "); //print between
    inorderTraversal(n.right);
  }
  
  public static Node createData() {
    Node a = new Node("a");
    Node b = new Node("b");
    Node c = new Node("c");
    Node d = new Node("d");
    Node e = new Node("e");
    Node f = new Node("f");
    Node g = new Node("g");
    
    a.left = b;
    a.right = g;
    b.left = c;
    b.right = d;
    c.left = e;
    e.right = f;
    
    return a;
  }
  
  
  
  
}

/*            a
*           /   \
*          b     g
*         / \
*        c  d
*       /
*       e
*       \
*        f
*/

//https://www.youtube.com/watch?v=0GRDiheRyf0&list=PLNYarVeMiNuJ6zSqOx0Ex9YaE-qxTxG8r&index=1
