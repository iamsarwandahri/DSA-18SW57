import java.util.LinkedList;
class Person{
      protected String name;
      protected int age;
      public Person(String name,int age)
      { this.name = name;
        this.age = age;
      }

}
class Student extends Person{
      public String rollNo;
      public long phone;
      public String email;

      public Student(String name,int age,String rollNo,long phone ,String email){
      super(name,age);//call parent class constructor
      this.rollNo = rollNo;
      this.phone = phone;
      this.email = email;
      }
   	
      public String toString(){
      return "Name: "+this.name+"\nAge: "+this.age+"\nRollNO: "+this.rollNo+"\nPhone: "+this.phone+"\nEmail: "+this.email;
      }


}

class TestLinkedList{
	   public static void main(String args[]){
       

       Student s1 = new Student("Sarwan Dahri",19,"18SW57",03073652,"iamsarwandahri@gmail.com");
       Student s2 = new Student("Yasir Abbas",19,"18SW51",03073653,"zawar.yasir110@gmail.com");
       Student s3 = new Student("Sayed Ahmed",21,"18SW33",03073654,"sayedahmedshah@gmail.com");
       Student s4 = new Student("Anees Detho",20,"18SW58",03073655,"aneesdetho49@gmail.com");
       Student s5 = new Student("Usama Shaikh",19,"18SW52",03073656,"muhammadusamashaikh110@gmail.com");
     
       LinkedList<Student> student = new LinkedList<Student>();

       student.add(s2);
       student.addFirst(s1);
       student.addLast(s3);
       System.out.println("\ntoString\n");
       System.out.println(s1.toString());//print student 1 detail
       System.out.println("Printing LinkedList");
       int i = 0;
       while(i<student.size())
       { 
       	System.out.println(student.get(i));//print index element
        i++;
       }
       student.offer(s4);//adds element in last
       System.out.println("\n********* After Offer ******* \n");
       i = 0;
       while(i<student.size())
       { 
       	System.out.println(student.get(i));//print index element
        i++;

       }
       System.out.println("\n*********Peek********\n");
       System.out.println(student.peek());//print first element
       System.out.println("\n**PeekLast**\n");
       System.out.println(student.peekLast());//printlastelemt
       System.out.println("\n**PeekFirst**\n");
       System.out.println(student.peekFirst());//print first element
       System.out.println(student.poll());//print first element and remove it
       
       System.out.println("\nAfter Poll\n");
        i = 0;
       while(i<student.size())
       { 
       	System.out.println(student.get(i));//print index element
        i++;
       }
       System.out.println("\nAfter set\n");
       student.set(0,s5);//set to index and delete previous element
        i = 0;
       while(i<student.size())
       { 
       	System.out.println(student.get(i));//print index element
        i++;
       }
        student.remove(1);//remove index 1 element
         System.out.println("\n After Remove \n");
         i = 0;
       while(i<student.size())
       { 
       	System.out.println(student.get(i));//print index element
        i++;
       }
       System.out.println("\nSize\n");
       System.out.println(student.size());
       student.clear();//clear the linkedlist
       System.out.println("\nClear\n");
       System.out.println(student.size());

       
	   } 




}