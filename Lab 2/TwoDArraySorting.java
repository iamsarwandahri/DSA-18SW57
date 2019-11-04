import java.util.Arrays;

public class TwoDArraySorting{
	public static void printArray(int arr[][]){
		int a = 0;
		for(;a<arr.length;a++){
			int b = 0;
			for(;b<arr[0].length;b++){
				System.out.print(arr[a][b]+" ");
			}

			System.out.println();
		}


	} 
	public static void main(String args[]){
		int array[][] = {{7,8,6,4,5,2,1},{9,6,4,3,7,5,8}};
        
        int i= 0;
		while(i<array.length){
		Arrays.sort(array[i]);
		i++;
	   }
		printArray(array);

}
}