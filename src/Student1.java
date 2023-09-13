public class Student1 {

    int id;
    String name;
    public Student1(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name);
    }
    public static void main(String args[]) {
        // Creating objects and passing values
        Student1 s1 = new Student1(111, "Karan");
        Student1 s2 = new Student1(222, "Aryan");
        // Calling method to display the values of objects
        s1.display();
        s2.display();
    }
}