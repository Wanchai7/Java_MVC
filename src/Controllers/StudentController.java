package src.Controllers;
// Controller

import src.Models.Student;
import src.views.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;
    
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setStudentName(String name) {
        model.setName(name);
    }
    
    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }
    
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
