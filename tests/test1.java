import java.lang.Exception;

public class test1 {

    public static void main(String[] args) {	
	String input;
	AutoFill af;

	try {
	    input = args[0];
	    af = new AutoFill();
	    System.out.println(af.autoFill(args[0]));
	} catch (Exception e) {
	    System.out.println("ERROR: Need A Command Line Argument!");
	} // try/catch

	

    } // main
    
} // test1
