import java.util.Arrays;

class ArrayEquality{
	public static void main(String args[]){
	int a[] = { 1,2,3,4,5,6,7};
	int b[] = { 1,2,3,4,5,6,7,8,9};
	boolean arraycheck;
	arraycheck = Arrays.equals(a,b);
	System.out.print(arraycheck);		
	}

}