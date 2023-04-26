package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        // TODO: implement this function to compute the Jaccard similarity between two string arrays
        Set<String> intersectSet = new HashSet<String>(set1);
        intersectSet.retainAll(set2);
        double int_len = intersectSet.size();
        System.out.println(int_len);
        Set<String> unionSet = new HashSet<String>(set1);
        unionSet.addAll(set2);
        double union_len = unionSet.size();
        System.out.println(union_len);
        return int_len/union_len;
    }

}
