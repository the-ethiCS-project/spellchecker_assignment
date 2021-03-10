
/**
 * The Spellchecker class will manage the database of all correctly
 * spelled words.  You will want to keep track of both the words
 * and the frequency at which those words appear.
 */
public class Spellchecker
{
    //the constructor should use the FileReader class to read in all
    //of the words contained in the given file.  You will need to keep
    //track of each word and how often it appears
    public Spellchecker(String filename)
    {
        
    }
    
    //this method will return the correctly spelled word that is
    //the best match for the input word
    //do so by using the StringPermuter class to find permutations of 
    //misspeltWord, and see if any correctly spelt words match a permutation
    public String getBestMatch(String misspeltWord)
    {
        return "hello";
    }
    
    //below is a simple example of how you might use the Spellchecker class
    public static void test()
    {
        Spellchecker sc = new Spellchecker("somefile.txt");
        String misspeltWord = "hellop";
        String bestMatch = sc.getBestMatch(misspeltWord);
        System.out.println("The best match for " + misspeltWord + " is: " + bestMatch);
    }
}
