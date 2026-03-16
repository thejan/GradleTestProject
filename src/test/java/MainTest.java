
import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Main calculator = new Main();

    @Test
    void testAddition() {
        int result = calculator.add(2, 3);
        System.out.println("Addition Result: " + result);
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(2, 3);
        System.out.println("Multiplication Result: " + result);
        assertEquals(6, calculator.multiply(2, 3));
    }
}