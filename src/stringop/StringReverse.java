
package stringop;

import java.util.Scanner;

/**
 *This class prints string in reverse order
 * @author Megha Patel
 */
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String name=sc.nextLine();
//String name="Megha";
        
        char[] arr=new char[name.length()];//size is length of string
        
        //store string in array
        for(int i=0;i<name.length();i++)
        {
            arr[i]=name.charAt(i);
        }
        
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }

}
