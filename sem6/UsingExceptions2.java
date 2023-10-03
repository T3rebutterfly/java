package sem6;

public class UsingExceptions2 {
        
    public static void main( String args[] )
    {
        try 
        {
            method1();
        }
        catch ( Exception exception ) {
            System.err.println(exception.getMessage()+ "\n");
            exception.printStackTrace();
            
            StackTraceElement[] traceElements = exception.getStackTrace();
            System.out.println( "\nStack trace from getStackTrace:" );
            System.out.println( "Class\t\tFile\t\t\tLine\tMethod" );
            
            for ( int i = 0; i < traceElements.length; i++ ) 
            {
                StackTraceElement currentElement = traceElements[ i ];
                System.out.print( currentElement.getClassName() + "\t" );
                System.out.print( currentElement.getFileName() + "\t" );
                System.out.print( currentElement.getLineNumber() + "\t" );
                System.out.print( currentElement.getMethodName() + "\n" );
            }
        }
    }
    public static void method1() throws Exception
    {
        method2();
    }
    public static void method2() throws Exception
    {
        method3();
    }
    public static void method3() throws Exception
    {
        throw new Exception( "Exception thrown in method3" );
    }
}