class Area{
   int length;
   int breath;

   //constructor of th class
   Area(int l,int b){
   length = l;
   breath = b;      }
   
   //Method for returning area
   int returnArea(){
   int area = length*breath;
   return area; }
   
   //main method
   public static void main(String args[]){
   	Area area = new Area(6,8);
   	System.out.print("Area of Rectangle = "+area.returnArea());
   
}//end of main
}//end of Area class