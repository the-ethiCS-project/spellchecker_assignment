
/**
 * The StringPermuter class has a baseWord, and allows
 * someone to get permutations of that word.  The purpose
 * is to find a word that is "close" to baseWord.  This way, if 
 * baseWord is misspelled, we can find a word that's correctly
 * spelled which is "close" to baseWord, aka a spellchecker.
 */
public class StringPermuter
{
    private String baseWord;
    
    public StringPermuter(String word) 
    {
        baseWord = word;
    }
    
    //returns true if goodWord is a potential match for baseWord
    //false if it isn't
    //initially we will permute baseWord and see if any of the permutations 
    //match goodWord.  Later on we can make a list of permutations in 
    //the constructor, so we only need to genereate the permutations once
    //instead of doing so everytime isMatch is called
    public boolean isMatch(String goodWord)
    {
        return false;
    }
    
    
    //The methods below are to help practice writing the isMatch method
    
    //This method should modify the word by adding a letter to it
    //E.g. hello -> ahello, bhello, ... haello, hbello, ... helloz
    private void printAllAdditions() 
    {
        
    }
    
    //Here we remove a letter from the word
    //hello -> ello, hllo, helo, helo, hell
    private void printAllDeletions() 
    {
        
    }
    
    //Here we look at swapping two adjacent letters
    //hello -> ehllo, hlelo, hello, helol
    private void printAllSwaps() 
    {
        
    }
    
    //Here we exchange each letter with a different letter
    //hello -> aello, bello, cello, ... , hallo, hbllo, ... hellz
    private void printAllExchanges() 
    {
        
    }
}
