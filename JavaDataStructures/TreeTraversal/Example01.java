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
    preorderTraversal(data);
    
  }
  
  public static void preorderTraversal(Node n) {
    //down the tree by all lefts then back up getting the rights
    
    if(n == null){
      return; //don't do anything
    }
    System.out.println(n.value + "  "); //go and print a then 
    preorderTraversal(n.left); //is a recursive algorithm; then go left and print b, then c, then e
    preorderTraversal(n.right); //is a recursive algorithm
  }
  
  public static void postorderTraversal(Node n) {
  }
  
  public static void inorderTraversal(Node n) {
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
