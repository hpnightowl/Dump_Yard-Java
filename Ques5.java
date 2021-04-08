import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Sam");  //adding objects to list  
        al.add("Sandy");  
        al.add("Joe");  
        al.add("Arya");  
        al.add("Nik");
        System.out.println("List1: " + al);
        List<String> al2 = new ArrayList<String>();
        al2.add("Karan");
        al2.add("Sood");
        al2.add("Hubey");
        al2.add("Singh");
        al2.add("Jonus");
        System.out.println("List2: " + al2);
        // Copy List2 to List1
        Collections.copy(al, al2);
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + al);
        System.out.println("List2: " + al2);     
    }
}
