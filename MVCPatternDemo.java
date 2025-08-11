import src.Controllers.StudentController;
import src.Models.Student;
import src.views.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Fetch student record based on his roll no from the database
        Student model = new Student();
        model.setName("John");
        model.setRollNo("10");
        
        // Create a view to write student details on console
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        

        controller.updateView();
        // Output: Student: Name: John Roll No: 10
        controller.setStudentName("View");
        controller.updateView();
    }
}
