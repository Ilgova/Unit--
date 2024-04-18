class Calculator {
    public double calculateDiscount(double amount, double discountPercentage) {
        if (amount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid input");
        }
        double discount = amount * (discountPercentage / 100);
        return amount - discount;
    }
}