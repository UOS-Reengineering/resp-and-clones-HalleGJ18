package example.project;

import example.project.Refactoring.ExtractMethods;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExtractMethods {

    @Test
    public void test_foo_after_refactoring() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        ExtractMethods.foo_after_refactoring();

        // parse output to array
        String output = bos.toString().trim();
        String[] outputArray = output.split("\\n");
        String[] outputArray1 = outputArray[0].split("\\s");
        String[] outputArray2 = outputArray[1].split("\\s");

        // assertions
        assertEquals(10, outputArray1.length);
        assertEquals(10, outputArray2.length);

        // undo the binding in System
        System.setOut(originalOut);
    }
}
