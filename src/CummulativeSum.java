//Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0,x,i=0;
		int arr[]=new int[1000000];
		while(sc.hasNext()){
			x=sc.nextInt();
			arr[i]=x;
			if(sum+arr[i]<0){
				break;
			}
			i++;
		}
		System.out.println();
		for(int j=0;j<i;j++){
			System.out.println(arr[j]);
		}

    }
}
