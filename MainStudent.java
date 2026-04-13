public class MainStudent {
    public static void main (String[] args) {

        Main22 Student1 = new Main22(3213, "Tung tung tung sahoor"); // student attributes
        Student1.print();

        Course course1 = new Course ("CF101", "Computing"); // course attributes

        Student1.enrol(course1); // enrols student

        Student1.print(); // prints student details 
    }
}
