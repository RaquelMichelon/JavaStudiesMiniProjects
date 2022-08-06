import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        final String inputExpression = ReadInput.read();

        Queue<String> operations;
        Queue<String> numbers;

        String[] numbersArr = inputExpression.split("[-+*/]");
        String[] operatorsArr = inputExpression.split("[0-9]+"); //regex can be simplified to \d

        numbers = new LinkedList<String>(Arrays.asList(numbersArr));
        operations = new LinkedList<String>(Arrays.asList(operatorsArr));

        Double result = Double.parseDouble(numbers.poll()); //poll to fech the first element of the queue

        while(!numbers.isEmpty()) {
            String operator = operations.poll();

            Operate operate;

            switch (operator) {
                case "+":
                    operate = new Add(); //dynamic binding - assigning an object to an interface type
                    break;
                case "-":
                    operate = new Subtract();
                    break;
                case "*":
                    operate = new Multiply();
                    break;
                case "/":
                    operate = new Divide();
                    break;
                default:
                    continue;
            }

            Double num = Double.parseDouble(numbers.poll());

            result = operate.getResult(result, num);
        }

        System.out.println(result);

    }
}
