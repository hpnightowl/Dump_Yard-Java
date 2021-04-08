import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Sam");  //adding objects to list  
        al.add("Sandy");  
        al.add("Joe");  
        al.add("Arya");  
        al.add("Nik");        
        // Print the list
        System.out.println(al);
        // Retrive the first and third element
        String element = al.get(0);
        System.out.println("Get First element: "+element);
    }
    
}
