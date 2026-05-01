@FunctionalInterface
interface DiscountCalculator {

    double calculate(double price);
}

public class DiscountDemo {

    public static void main(String[] args) {

        DiscountCalculator tenPercent = (price) -> price * 0.90;

        DiscountCalculator twentyFivePercent = (price) -> price * 0.75;

        double price = 100;

        System.out.println("Price after 10% discount: " + tenPercent.calculate(price));

        System.out.println("Price after 25% discount: " + twentyFivePercent.calculate(price));
    }
}