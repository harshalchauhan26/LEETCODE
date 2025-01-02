
import java.util.*;


public class ROTATE_ARRAY {
	public static void main(String[] args){
		int[] arr={10,20,30,40,50,60,70}; 
		int k=3;
		ROTATE_ARRAY(arr, k);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
	}

	public static void ROTATE_ARRAY(int []arr , int k){
        int n = arr.length;
		k=k%n;
		Reverse(arr,0,n-k-1);//reverse from stat to n-k
		Reverse(arr,n-k,n-1);//reverse for last k elements
		Reverse(arr,0,n-1);// reverse all array
	}
//OPTIMIZATION FOR TLE AS LAST CASE FAILED T T
 public static void Reverse(int[] arr,int i,int j){
	while(i<j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
 }
		
}
