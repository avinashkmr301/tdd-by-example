package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplication() {
        Doller five = new Doller(5);
        Doller product = five.times(2);
        assertEquals(new Doller(10), product);
        product = five.times(3);
        assertEquals(new Doller(15), product);
    }

    @Test
    void testEquality(){
        assertEquals(new Doller(5),new Doller(5));
        assertNotEquals(new Doller(4), new Doller(7));
    }
}
