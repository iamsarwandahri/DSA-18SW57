class LinearSearchString{
	public static void linearSearch(String arr[],String s){
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
    String array [] = {"Sarwan","Hussain","Dahri","18SW57","NF"};
    linearSearch(array,"Sarwa");


    }
}