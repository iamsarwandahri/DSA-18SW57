import java.util.Random;
import java.util.Arrays;

class Array{


 public static void main(String args[]){
    Random rand = new Random();
 	int array[] = new int[100];
    int i = 0;
    while(i<100){
    	int r = rand.nextInt(100);
    	array[i] = r;
    	i++;
    }
  System.out.println(Arrays.toString(array));
}
}