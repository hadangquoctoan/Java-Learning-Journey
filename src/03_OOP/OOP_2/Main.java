package OOP_2;

public class Main {
    int x = 5;
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Main myObj1 = new Main();
        myObj1.x = 25; // x is now 25 // will generate an error: cannot assign a value to a final
                       // variable if use "final" in class father
        System.out.println(myObj1.x);

        // Multiple Objects
        Main myObj2 = new Main();
        myObj2.x = 25;
        System.out.println(myObj2.x);

        Main myObj3 = new Main();
        System.out.println("Name: " + myObj3.fname + " " + myObj3.lname);
        System.out.println("Age: " + myObj3.age);

    }
}