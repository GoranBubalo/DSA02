public class Main {

static int counter = 2;

public static void fibonacci(int numberOne, int numberTwo){
        if(counter <=19){

        int newNumber = numberOne + numberTwo;
        System.out.println(newNumber);
        numberOne = numberTwo;
        numberTwo = newNumber;
        counter++;
        fibonacci(numberOne,numberTwo);

        }
}

    public static void main(String[] args) {
        /*Recursion is when a function calls itself.
To implement the Fibonacci algorithm we need most of the same things as in the
code example above, but we need to replace the for loop with recursion.
To replace the for loop with recursion, we need to encapsulate much of the code in a function,
 and we need the function to call itself to create a new Fibonacci number as long
  as the produced number of Fibonacci numbers is below, or equal to, 19*/
  System.out.println(0);
  System.out.println(1);

  fibonacci(0,1);

    }
}