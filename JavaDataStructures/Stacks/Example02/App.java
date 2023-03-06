package stackinJava;

import java.util.Stack;

public class App {

    public static void main(String[] args) {
         Stack<Car> carStack = new Stack<>();

         //push add on top
         carStack.push(new Car("Citroen"));
         carStack.push(new Car("Fiat"));
         carStack.push(new Car("Tesla"));

        System.out.println(carStack);

        //pop remove from top
        System.out.println(carStack.pop());

        System.out.println(carStack);

        //peek show what is on the top without remove it from the stack
        System.out.println(carStack.peek());

        System.out.println(carStack);

        System.out.println("Stack is empty? " + carStack.empty());
        System.out.println("Does the stack contains 'Fiat'? " + carStack.search(new Car("Fiat")));

        //Returns the position the element searched is from the top; The top element returns 1, The second element from
        //the top returns 2 and so on. If the element isn't found, it returns -1.
        Stack<Integer> numberStack = new Stack<>();
        numberStack.push(1);
        numberStack.push(2);
        numberStack.push(3);
        numberStack.push(4);
        numberStack.push(5);
        System.out.println(numberStack);
        System.out.println("Does the stack contains '5'? " + numberStack.search(5)); //1 = because it is the first element on the stack
        System.out.println("Does the stack contains '4'? " + numberStack.search(4)); //2 = because it is the second element on the stack
        System.out.println("Does the stack contains '6'? " + numberStack.search(6)); //-1 = because it is not on the stack

    }
}
