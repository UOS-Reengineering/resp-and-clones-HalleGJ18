package example.project;

import example.project.CodeClones.DotPlot;
import example.project.Refactoring.ExtractMethods;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDotPlot {

    @Test
    public void test_computeDotPlot() {
        char[] seq1 = {'t', 'h', 'i', 's', 'i', 's', 'a', 't', 'e', 's', 't'};
        char[] seq2 = {'t', 'h', 'i', 's', 'i', 's', 'a', 'b', 'i', 'g', 't', 'e', 's', 't'};


        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        DotPlot.printDotPlot(seq1, seq2);
        /*
        The printed dot plot should look like this:

            t	h	i	s	i	s	a	b	i	g	t	e	s	t
        t	+	 	 	 	 	 	 	 	 	 	+	 	 	+
        h	 	+
        i	 	 	+	 	+	 	 	 	+
        s	 	 	 	+	 	+	 	 	 	 	 	 	+
        i	 	 	+	 	+	 	 	 	+
        s	 	 	 	+	 	+	 	 	 	 	 	 	+
        a	 	 	 	 	 	 	+
        t	+	 	 	 	 	 	 	 	 	 	+	 	 	+
        e	 	 	 	 	 	 	 	 	 	 	 	+
        s	 	 	 	+	 	+	 	 	 	 	 	 	+
        t	+	 	 	 	 	 	 	 	 	 	+	 	 	+

         */

        // assertion
        String[] lines = bos.toString().trim().split("\\n");
        assertEquals(12, lines.length);
        assertEquals("\tt\th\ti\ts\ti\ts\ta\tb\ti\tg\tt\te\ts\tt\t".trim(), lines[0].trim());
        assertEquals("t\t+\t \t \t \t \t \t \t \t \t \t+\t \t \t+\t".trim(), lines[1].trim());
        assertEquals("h\t \t+\t \t \t \t \t \t \t \t \t \t \t \t \t".trim(), lines[2].trim());
        assertEquals("i\t \t \t+\t \t+\t \t \t \t+\t \t \t \t \t \t".trim(), lines[3].trim());
        assertEquals("s\t \t \t \t+\t \t+\t \t \t \t \t \t \t+\t \t".trim(), lines[4].trim());
        assertEquals("i\t \t \t+\t \t+\t \t \t \t+\t \t \t \t \t \t".trim(), lines[5].trim());
        assertEquals("s\t \t \t \t+\t \t+\t \t \t \t \t \t \t+\t \t".trim(), lines[6].trim());
        assertEquals("a\t \t \t \t \t \t \t+\t \t \t \t \t \t \t \t".trim(), lines[7].trim());
        assertEquals("t\t+\t \t \t \t \t \t \t \t \t \t+\t \t \t+\t".trim(), lines[8].trim());
        assertEquals("e\t \t \t \t \t \t \t \t \t \t \t \t+\t \t \t".trim(), lines[9].trim());
        assertEquals("s\t \t \t \t+\t \t+\t \t \t \t \t \t \t+\t \t".trim(), lines[10].trim());

        // undo the binding in System
        System.setOut(originalOut);
        

    }
}
