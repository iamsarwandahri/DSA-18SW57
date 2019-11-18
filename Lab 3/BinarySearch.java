class BinarySearch{
	public static void binarySearch(int arr[],int x){
    int last = arr.length-1;    
    int first = 0;
    int mid;
    while(first<=last){
    mid = first + (last-first)/2;
    if(arr[mid]<x)
    {  first = mid+1;  }
    
    if(arr[mid]>x)
    { last = mid-1; }

    if(arr[mid]==x)
    {System.out.println(x+" Found at Index "+mid);      break;}
 

    if(first>last)
    {    System.out.println("Element not Found");   }
}
}
    
    public static void main(String args[]){
    int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    binarySearch(array,1);

}
}