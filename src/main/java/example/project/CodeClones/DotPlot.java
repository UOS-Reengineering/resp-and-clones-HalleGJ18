package example.project.CodeClones;

import java.lang.*;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {
        // TODO: complete this function to print the dot plot of two string arrays
        String plot = "\t";
        for (int n = 0; n<sequence2.length; n++){
            plot = plot + sequence2[n] + '\t';
        }
        plot = plot + "\n";
        for (int i = 0; i<sequence1.length; i++) {
            plot = plot + sequence1[i] + '\t';
            for (int j = 0; j<sequence2.length; j++) {
                char c1 = sequence1[i];
                char c2 = sequence2[j];
                if (c1 == c2) {
                    plot = plot + '+' + '\t';
                } else {
                    plot = plot + ' ' + '\t';
                }
            }
            plot = plot + "\n";
        }
        System.out.println(plot);
    }

}
