class BinarySearchString
{
	public static int binarySearch(String[] arr,String s) // method searches for index of array if found return index else any -ve no
	{
		int f=0;
		int l=arr.length-1;
		while(f<=l)
		{
			int mid = (f+l)/2;
			int i = arr[mid].compareToIgnoreCase(s);
			if(i==0)
			{
				return mid;
			}
			if(i>0)
			{
				f=mid+1;
			}
			if(i<0)
			{
				l=mid-1;
			}
		}
			return -1;
	}
	public static void main(String[] args)
	{
		String[] array = {"Sarwan","Hussain","Dahri","18SW57","MUET"};
		int index = binarySearch(array,"Hussain");
		if(index>-1)
        {  	System.out.println("Index of element is "+index); }
		else
		{	System.out.println("Element not found");	}
	}
}