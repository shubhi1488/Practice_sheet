/*
Write a program to accept 12 numbers in array and swap first half of array with second half of array..........................................................................
*/
import java.util.Scanner;

public class Array5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=scan.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements into the array");
 
        for (int i=0;i<size ;i++ )
        {
            arr[i]=scan.nextInt();
        }
        int k=size;
        int temp;
 
        for (int i=0;i<size/2 ;i++ )
        {
            temp=arr[i];
            arr[i]=arr[k-1-i];
            arr[k-1-i]=temp;
        }
        for (int i=0;i<size ;i++ )
        {
            System.out.print(arr[i]+" ");
        }
		

	}

}
