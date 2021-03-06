import binarysearch.FileToStringArray;
import binarysearch.BinarySearch;
import java.io.File;

/**
 * Class provides a blueprint to create a thread to autofill words. 
 */
public class AutoFill {

    /**
     * Returns the full version of an inputted string using binary search on a dictionary text file.
     * 
     * @return the full word of the given string
     */
    public String autoFill(String input) {
	String word;

	File file = new File("dictionaries/dictionary.txt");
	FileToStringArray ftsa = new FileToStringArray();
	BinarySearch bs = new BinarySearch();
	word = bs.getValidStringFromInput(ftsa.fileToStringArray(file), input);
	
	return word;       
    } // autoFill
    
} // AutoFill
