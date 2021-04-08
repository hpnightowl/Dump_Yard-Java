import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Sam");  //adding objects to list  
        al.add("Sandy");  
        al.add("Joe");  
        al.add("Arya");  
        al.add("Nik");     
        // Print the list
        System.out.println("Before");
        System.out.println("======");        
        System.out.println(al);
        // Update the third element with "Yellow"
        al.set(3, "Harsh");
        System.out.println();
        // Print the list again
        System.out.println("After");
        System.out.println("======");
        System.out.println(al);               
    }
}
