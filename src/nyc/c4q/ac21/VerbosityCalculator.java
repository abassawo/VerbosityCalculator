package nyc.c4q.ac21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Calculate the verbosity of a text
 */
public class VerbosityCalculator {
    public static void main(String[] args){
        // An abstract representation of a File
        File mobyDick = new File("/Users/c4q-Abass/Desktop/accesscode/VerbosityCalculator/Resources/MobyDick.txt");
        File taleTwo =  new File("/Users/c4q-Abass/Desktop/accesscode/VerbosityCalculator/Resources/TaleOfTwoCities.txt");
        int wordCountMoby = 0;
        int wordCountDick = 0;
        int sentCountMoby = 0;
        int sentCountDick = 0;

        try{
            Scanner Melville = new Scanner(mobyDick);
            while(Melville.hasNext()){
                String text = Melville.next();
                wordCountMoby++;
                if (text.endsWith(".") || text.endsWith("!") || text.endsWith("?") || text.endsWith("\"")){
                    sentCountMoby++;
                    }
            }
            Scanner Dickens = new Scanner(taleTwo);
            while (Dickens.hasNext()){
                String text = Dickens.next();
                wordCountDick++;
                if (text.endsWith(".") || text.endsWith("!") || text.endsWith("?") || text.endsWith("\"")){
                    sentCountDick++;
                 }
            }
            int MobyVerb = (wordCountMoby/sentCountMoby);
            int DickensVerb = (wordCountDick/sentCountDick);
            System.out.println("The total word count for a Tale of Two Cities is " + wordCountDick);
            System.out.println("The sentence count for Tale of Two Cities is " + sentCountDick + "\n");
            System.out.println("The total word count for Moby Dick is " + wordCountMoby);
            System.out.println("The sentence count for Moby Dick is "+ sentCountMoby + "\n");
            System.out.println("Dicken's verbosity measure is (word count/ sentence count), which equals" + DickensVerb);
            System.out.println("Melville's verbosity measure is (word/sentence count),which equals " + MobyVerb);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

