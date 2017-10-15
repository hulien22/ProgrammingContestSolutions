import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	static double value = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		int[] S = new int[N];
		for (int i=0;i<N;i++)
			S[i] = Integer.parseInt(input.readLine());
		mergeSort(S,0,N-1);
		
		value /= N;
		System.out.printf("%.2f",value+1);
	}
	public static void mergeSort(int[] list, int low, int high){
		if (low==high)
			return;
		else{
			int mid = (low+high)/2;
			mergeSort(list,low,mid);
			mergeSort(list,mid+1,high);
			merge(list,low,mid,high);
		}
	}
	public static void merge(int[] list, int l,int m, int high){
		int[] temp = new int[high-l+1];
		int low=l;
		int mid=m+1;
		int i=0;
		while(low<=m && mid<=high){
			if(list[low] <= list[mid]){
				temp[i] = list[low];
				low++;
			}
			else{
				temp[i] = list[mid];
				//System.out.println(Arrays.toString(temp) + "   " + low + "  " + m);
				mid++; 
				value += (m-low)+1; 
				//System.out.println(list[mid-1]  + "   " + (m-low+1) + "  " +value);
			}
			i++;
		}
		while(low<=m)
			temp[i++] = list[low++];
		while(mid<=high)
			temp[i++] = list[mid++];
		for(low=l;low<=high;low++)
			list[low] = temp[low-l];
			
		//System.out.println(Arrays.toString(list));
		
		
	}
	
}
