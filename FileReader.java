import java.util.Scanner;
import java.io.File;

public class FileReader
{
    private Scanner s;
    private String nextWord;
    
    //Create a file reader object that accesses the file specified by filename
    public FileReader(String filename){
        try {
            s = new Scanner(new File(filename)).useDelimiter("\\s|--");
        }
        catch (Exception e) {
            System.out.print("ERROR:  ");
            System.out.println(e);
            return;
        }
        setNext();  //get the first word in the file
    }
    
    //returns true if there are more words in the text file
    public boolean hasNextWord()
    {
        return nextWord != null;
    }
    
    //returns the next word in the text file
    public String getNextWord()
    {
        String ret = nextWord;
        setNext();
        return ret;
    }
    
    //used to set the nextWord that should be given back
    private void setNext(){
        if (!s.hasNext()){  //nothing left
            nextWord = null;
            s.close();
            return;
        }
        //make string lower case, and strip out most punctuation characters (leave ' and -)
        String str = s.next().toLowerCase().replaceAll("[!“”\"\\#$%&()*+,./:;<=>?@\\[\\\\\\]^_‘{|}~]", "" );
        //if you're curious about that weird string in replaceAll,
        //you should look up Regular Expressions
        
        if (!str.equals(""))  //if str isn't empty its the next word
        {
            nextWord = str;
        }
        else {  //word was empty, so try to set it again
            setNext();
        }
    }
}
