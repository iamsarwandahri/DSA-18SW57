class Shape{

    //Drawing Shape
  	public void drawShape(){    System.out.println("Draw Shape");          }
   
    //Erasing Shape
    public void eraseShape(){    System.out.println("Erase Shape");        }
}

//creating child class Square
class Square extends Shape{
     
    //Drawing Square Shape
    public void drawShape(){	System.out.println("Draw Square Shape");   }

    //Erasing Sqaure Shape
 	public void eraseShape(){	System.out.print("Erase Square Shape");    }
 }//end of Square

//Creating child class Traingle
class Traingle extends Shape{

    //Drawing Traingle Shape
 	public void drawShape(){	System.out.println("Draw Square Shape"); 	}
 	
    //Erasing Traingle Shape
 	public void eraseShape(){   System.out.print("Erase Traingle Shape");   }
 }//end of Traingle