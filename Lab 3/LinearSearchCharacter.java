class LinearSearchCharacter{
	public static void linearSearch(char arr[],char s){
	for(int i=0;i<arr.length;i++){
    if(arr[i]==s){
    System.out.println(s+" Found at index "+i);
    break;
    }
     if(i==arr.length-2 && arr[i]!=s)
     {System.out.println("Element not Found");}
	}
}
    public static void main(String args[]){
    char array [] = {'a','d','c','r','t'};
    linearSearch(array,'s');


    }
}