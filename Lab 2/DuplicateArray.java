class DuplicateArray{
	public static void main(String[] args)
	{
		int[] array = {20,20,30,40,50,50,50};
		int count = 0;
		System.out.println("Length of Array = "+array.length);
		for(int i=0;i<array.length;i++)
		{
			for(int j = i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
					count++;
			}
		}
		System.out.println("New length of Array = "+count);
	}
}