import java.util.Arrays;

public class UseArrayMethods{
	public static void main(String args[]){
        
		String[] array = {"Sarwan","Hussain","Dahri","18SW57","Naushahro Feroze"};
		 System.out.println(Arrays.toString(array));
		 //sorting in specific range
		 Arrays.sort(array,0,3);
		 System.out.println(Arrays.toString(array));
		 //Sorting an Array
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));
         //printing length of an Array
         System.out.println(array.length);
         //binary searching for fing keyword or number in an array
         System.out.println(Arrays.binarySearch(array,"Sarwan"));
         //copying an array
         String arraycopy[] = Arrays.copyOf(array,2);
         System.out.println(Arrays.toString(arraycopy));
         //copying an array in range
         String arrayrange[] = Arrays.copyOfRange(array,1,4);
         System.out.println(Arrays.toString(arrayrange));
         //equaling two arrays
         System.out.println(Arrays.equals(array,arraycopy));
         //filing of array
         Arrays.fill(array,"Sarwan");
         System.out.println(Arrays.toString(array));
         //filing in specific range
         Arrays.fill(array,1,4,"Hussain");
         System.out.println(Arrays.toString(array));

         



	}


}