package Test;

public class SelectionSortTest {
	
	static int[] arr = {12,34,5,23,1,3,100,44,8};

	public static void SelectionSort(int n) {
		if(n == arr.length) {
			return;
		}
		
		int min = arr[n]; 
		int index = n;
		
		for(int i = n+1; i < arr.length; i++ ) {
			if(min > arr[i]) {
				min = arr[i];
				index = i;
			}	
		}
		
		int temp = arr[n];
		arr[n] = arr[index];
		arr[index] = temp;
		
		SelectionSort(n+1);
	}
	
	public static void main(String[] args) {
		SelectionSort(0);
		for(int sortedarr : arr) {
			System.out.print(sortedarr+" ");
		}

	}


}
