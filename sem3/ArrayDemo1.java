package sem3;

public class ArrayDemo1 {
    
    public static void main(String args[])
    {
        int a[][] = new int[10][10];
        for (int i=0; i<a.length; i++)
        for (int j=0; j<a.length; j++)
            a[ i ][ j ] = ( int ) ( Math.random( ) * 10 );
        for ( int i=0; i<a.length; i++ )
        {
            for ( int j=0; j<a.length; j++ )
                System.out.print(" " + a[ i ][ j ]);
            System.out.println( );
        }
    }
}
