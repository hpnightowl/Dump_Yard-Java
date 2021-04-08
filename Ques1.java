import java.util.*;

public class Ques1 {
    public static void main(String[] args) throws Exception {
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
        System.out.println();
        // Now insert a color at the first and last position of the list
        al.add(0, "Harsh");
         // Print the list
        System.out.println("After");
        System.out.println("======");
        System.out.println(al);
    }
}
