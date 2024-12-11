import java.util.Collections;

public class HandsOnArrayList {
    public void ArrayStudent(){

        java.util.ArrayList<String> Students = new java.util.ArrayList<>();
        Students.add("John");
        Students.add("Jane");
        Students.add("Bob");
        Students.add("Mary");
        System.out.println(Students);
// remove  to remove the name  of the student
        Students.remove("John");
        System.out.println(Students);

        // collections make the student name in alphabetic order.
        Collections.sort(Students);
        System.out.println(Students);
    }


}
