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

    }
}
