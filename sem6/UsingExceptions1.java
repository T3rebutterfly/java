package sem6;

public class UsingExceptions1 {
        
    public static void main( String args[] )
    {
        try {
        throwException();
        }
        catch ( Exception exception ) {
            System.err.println( "Exception handled in main");
        }
    }

    public static void throwException() throws Exception
    {
        try {
            System.out.println("Method throwException");
            throw new Exception(); 
        }
        catch ( Exception exception ) {
            System.err.println("Exception handled in method throwException");
            throw exception; 
        }
        finally {
            System.err.println("Finally executed in throwException");
        }
    } 
} 
