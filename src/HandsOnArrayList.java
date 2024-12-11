import java.util.Collections;

public class HandsOnArrayList {
    public void ArrayStudent(){

        java.util.ArrayList<String> Students = new java.util.ArrayList<>();
        Students.add("John");
        Students.add("Jane");
        Students.add("Bob");
        Students.add("Mary");
        System.out.println(Students);

        Students.remove("John");
        System.out.println(Students);

        Collections.sort(Students);
        System.out.println(Students);
    }


}
