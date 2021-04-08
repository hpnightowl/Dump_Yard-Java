import java.util.*;

public class Ques5a {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Sam");  //adding objects to list  
        al.add("Sandy");  
        al.add("Joe");  
        al.add("Arya");  
        al.add("Nik");
        System.out.println("List1: " + al);
        List<String> al2 = new ArrayList<String>();
        System.out.println("Before Empty list: " + al2);
        al2.addAll(al);
        System.out.println("Copied array list: " + al2);
    }
}
