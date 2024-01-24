import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string");
        String str = scan.nextLine();

        String revStr = reverseString(str);
        
        System.out.println(revStr);

        scan.close();
    }

    public static String reverseString(String input) 
    {
        char[] arr = input.toCharArray();
        
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) 
        {
            char x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;
        }
        
        return new String(arr);
    }
}
