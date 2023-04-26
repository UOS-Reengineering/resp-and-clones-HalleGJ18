package example.project;

import example.project.Refactoring.DelegateMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDelegateMethods {

    @Test
    public void test_createRandomInteger() {
        // action
        int max = 10;
        for (int i=0; i<100; i++) { // check multiple times to make sure the random number is in the range
            int value = DelegateMethods.createRandomInteger(max);
            assertTrue(value >= 0 && value < max);
        }
    }
}
