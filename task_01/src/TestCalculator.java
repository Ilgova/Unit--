import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
class TestCalculator {
    @Test
    public void testCalculateDiscount_validInput() {
        Calculator calculator = new Calculator();
        double result = calculator.calculateDiscount(100, 10);
        assertThat(result).isEqualTo(90);
    }


    @Test
    public void testCalculateDiscount_invalidInput() {
        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> calculator.calculateDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Неверный ввод данных");
    }
}