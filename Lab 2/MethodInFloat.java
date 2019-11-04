public class MethodInFloat{

	    //return avergae method
	    public static float returnAverage(){
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int i=0;
		int sum = 0;
		//while for adding whole array
		while(i<array.length){
		sum = sum + array[i];
		i++;}

        //returning average
		float average = sum/array.length;
        return average;
		}
		public static void main(String args[]){
        
        System.out.println("Average of an Array = "+returnAverage());

		}
}