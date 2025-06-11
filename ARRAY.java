package project1_5;
import java.util.*;

public class iserting {
public static void main(String []args)
{
	Scanner sd =new Scanner(System.in);
	System.out.print("ENTER THE SIZE OF THE ARRAY:");
    int array_size=sd.nextInt();
    		
    int [] arr = new int [array_size];
    for(int i=0;i<=array_size-1;i++)
    	
    {
    	arr[i]=sd.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("enter the index value to extract the elemts of the array");
 int index=sd.nextInt();
 System.out.println((arr[index]));

}
}
