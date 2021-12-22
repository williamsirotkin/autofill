import java.lang.Exception;
import binarysearch.FileToStringArray;
import java.io.File;

public class test1 {

    public static void main(String[] args) {	
	String input;
	AutoFill af;
	File file;
	FileToStringArray ftsa;
	String[] strArray;

	try {
	    file = new File(args[0]);
	    ftsa = new FileToStringArray();
	    strArray = ftsa.fileToStringArray(file);

	    System.out.println(strArray.length);

	    for (int i = 0; i < strArray.length; i++) {
		af = new AutoFill();
		System.out.println(af.autoFill(strArray[i]));
	    } // for
	} catch (Exception e) {
	    System.out.println("ERROR: EXCEPTION IN TEST1 CLASS!");
	} // try/catch

	

    } // main
    
} // test1
