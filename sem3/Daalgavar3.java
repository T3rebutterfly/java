package sem3;
 
class Daalgavar3 {
    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0)
                odd += arr[i];
        }
        
        System.out.println("Sondgoin inexiin niilber: " + odd);
    }
}