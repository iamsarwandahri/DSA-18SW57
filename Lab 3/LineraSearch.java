class LinerSearch{
	public static void binarySearch(int arr[],int num){

    for(int i=0;i<arr.length;i++){
    if(arr[i]==num){ return i;}
    }
    return -1;

	}
    public static void main(String args[]){
    int array[] = {1,2,3,4,5,6,7,85,44,56,45};
    int index = binarySsearch(array,44);
    if(index>-1)
    {System.out.print("Index of Element is: "+index)}
    else
    System.out.println("Element not Found");


    }

}