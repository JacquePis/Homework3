import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
    public static void main(String[] args) {
        System.out.print("Testing!");
    }
    //test
    @Test
    public void testLuggageWeight() {
        assertTrue(Random.luggageWeight(0));
        assertTrue(Random.luggageWeight(20));
        assertTrue(Random.luggageWeight(40));
    }

    @Test
    public void testMultiplyOfTen() {
        assertTrue(Random.multiplyOfTen(100));
        assertTrue(Random.multiplyOfTen(34));
    }

    @Test
    public void testFaceControl() {
        assertTrue(Random.faceControl(40));
        assertTrue(Random.faceControl(-1));
        assertTrue(Random.faceControl(16));
    }

    @Test
    public void testDivision() {
        assertTrue(Random.division(10, 0));
        assertTrue(Random.division(2, 5));
    }
}
