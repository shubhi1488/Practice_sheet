/*
Write a program to accept N numbers in an array and display add 2 to all odd numbers in array and multiply 2 to to all even numbers in array..................................
*/
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				arr[i]=2*arr[i];
				System.out.println("product of even numbers:"+arr[i]);
				
			}
			else {
				arr[i]=2+arr[i];
				System.out.println("sum of odd numbers:"+arr[i]);
			}
			
		}
		
		

	}

}
