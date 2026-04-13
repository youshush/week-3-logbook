public class Main22 {

    int id; // stores id
    String name; //stores name 
    Course course; // stores course (this is task 8)

    public Main22(int id, String name) { // constructor
        this.id = id;
        this.name = name;
    }
    public void enrol(Course course) {
        this.course = course; // person gets enrols (task 9)
    }

    public void print() {
        System.out.println( "id: " + id);
        System.out.println( "name: " + name);

        if (course != null) {
            course.print(); // print course details (task 10)
            
        }
    }
}