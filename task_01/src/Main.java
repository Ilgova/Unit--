public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Пример использования метода calculateDiscount
        double amount = 100;
        double discountPercentage = 10;
        double discountedAmount = calculator.calculateDiscount(amount, discountPercentage);
        System.out.println("Сумма с учетом скидки: " + discountedAmount);
    }
}