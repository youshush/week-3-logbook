public class Course {
    String code; // stores the course code
    String name;
     // stores the course name

    public Course(String code, String name) { //made the constructor
        this.code = code;
        this.name = name;
    }

    public void print() {
        System.out.println("Course code: " + code); // prints these out
        System.out.println("Course name: " + name);
    }
}