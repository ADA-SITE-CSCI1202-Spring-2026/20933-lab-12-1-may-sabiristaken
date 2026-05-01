@FunctionalInterface
interface NumberChecker {
    boolean check(int number);

    default void printResult() {
        System.out.println("Result printing is not implemented for this lambda.");
    }
}

public class LambdaFixTask {

    public static void main(String[] args) {

        NumberChecker isEven = number -> number % 2 == 0;

        System.out.println("Is 10 even? " + isEven.check(10));
        
        isEven.printResult();
    }
}
