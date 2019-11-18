class BinarySearchChar{
	public static int binarySearch(char[] arr,char ch)
	{
		int f=0;
		int l=arr.length-1;
		while(f<=l)
		{
			int mid = f+(l-f)/2;
			int i = Character.compare(Character.toLowerCase(arr[mid]),Character.toLowerCase(ch));
			if(i==0)
			{
				return mid;
			}
			if(i<0)
			{
				f=mid+1;
			}
			if(i>0)
			{
				l=mid-1;
			}
		}
			return -1;
	}
	public static void main(String[] args) //main method
	{
		char[] array = {'a','n','r','s','w'};
		int index = binarySearch(array,'s');
		if(index>-1)
		{
			System.out.println("Index of element is "+index);
		}
		else
		{
			System.out.println("Element not found");	
		}

	}
}