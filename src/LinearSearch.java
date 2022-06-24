/*
Write a program to accept N numbers in an array and and accept for a number from user and check for its existance in an array using linear search technique.
*/
import java.util.Scanner;

public class LinearSearch {
	public static int search(int arr[],int ele) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==ele) {
				return i;
			}
		}
		return -1;
	}

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
		int ele;
		System.out.println("enter element to search:");
		ele=s.nextInt();
		int result=search(arr,ele);
		if(result==-1) {
			System.out.println(result);
		}
		else {
			System.out.println("element found at:"+result);
		}

	}

}
