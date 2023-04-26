package example.project;

import example.project.CodeClones.JaccardSimilarity;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TestJaccardSimilarity {

    @Test
    public void test_computeJaccardSimilarity_char() {
        Set<String> set1 = new HashSet<>(){{add("a"); add("b"); add("c");}};
        Set<String> set2 = new HashSet<>(){{add("a"); add("b"); add("d");}};

        double sim = JaccardSimilarity.computeJaccardSimilarity(set1, set2);
        assertEquals(0.5, sim);
    }

    @Test
    public void test_computeJaccardSimilarity_code() {
        String code_fragment1 =
                "for (int i = 0; i < array1.length; i++) {\n" +
                "   System.out.print(array1[i] + delimiter);\n" +
                "}\n" +
                "System.out.println();";

        String code_fragment2 =
                "for (int i = 0; i < array1.length; i++) {\n" +
                "   System.out.print(array1[i] + delimiter);\n" +
                "}\n";

        Set<String> set1 = new HashSet<>(Arrays.asList(code_fragment1.split("\n")));
        Set<String> set2 = new HashSet<>(Arrays.asList(code_fragment2.split("\n")));

        double similarity = JaccardSimilarity.computeJaccardSimilarity(set1, set2);
        assertEquals(0.75, similarity);
    }
}