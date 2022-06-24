/*
Writa a program to accept 10 numbers from user in an array  and sort them using bubble sort technique
*/
import java.util.Scanner;

public class BubbleSort {
	public static void sort(int arr[]) {
		 int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size:");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("array before sorting");
		print(arr);
		sort(arr);
		System.out.println("array after sorting");
		print(arr);
		

	}

}
