 // November 16,2022 creating a java class
 
 class car{   // class
   public String color="red"; //field
    
    public void display(){ //member functions
       System.out.println("red color");
    }
       
}
public class NewMain1 {      //main classs 
      
    public static void main(String[] args){   //main fuunction
      car car1= new car();   // creating an object
        car1.display();     // calling the member function using object
        // objectname.functionname
    } 
    
}
