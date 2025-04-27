package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicationDoller() {
        Doller five = new Doller(5);
        Doller product = five.times(2);
        assertEquals(new Doller(10), product);
        product = five.times(3);
        assertEquals(new Doller(15), product);
    }

    @Test
    void testEqualityDoller(){
        assertEquals(new Doller(5),new Doller(5));
        assertNotEquals(new Doller(4), new Doller(7));

        // check france & Doller should not be equals

        assertNotEquals(new France(5),new Doller(5));
    }

    @Test
    void testMultiplicationFrance(){
        France five = new France(5);
        France product = five.times(6);
        assertEquals(new France(30),product);

        product =  five.times(7);
        assertEquals(new France(35),product);
    }

    @Test
    void testEqualityFrance(){
        assertEquals(new France(3),new France(3)); // need equlas()
        assertNotEquals(new France(3),new France(4)); // need to == amount
    }

}
