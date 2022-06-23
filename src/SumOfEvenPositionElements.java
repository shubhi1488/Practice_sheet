/*
Write a program to accept N numbers in an array and display sum of all elements at even positions.............................................................................
*/
import java.util.Scanner;

public class Array3 {

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
		int sum=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("sum of elements at even position is:"+sum);

	}

}

