/*
Write a program to accept 15 number in an array and display the largest and smallest number stored in it.
*/
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int small=arr[0];
		int large=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>large) {
				large=arr[i];
				
			}
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("largest number is:"+large);
		System.out.println("smallest number is:"+small);

	}

}
