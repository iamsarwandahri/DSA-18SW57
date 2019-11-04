public class FindingSecondLargestNum{
  
  public static int findIndex(int arr[]){
  	int max = 7;
    int smax = 0;
    int i=0;

  	while(i<arr.length){
  	if(max<=arr[i]){ max = arr[i]; }
    if(arr[i]<max && smax <=arr[i])
    {smax = arr[i];}

    i++;
}
    System.out.print("Second Largest Number in array = ");
    return smax;
  }	
  public static void main(String[] args){
  	int array[] = {35,45,51,62,73,87,98,76,56,45,67,97,9};
  	System.out.println(findIndex(array));
  }
}