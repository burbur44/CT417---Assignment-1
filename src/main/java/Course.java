
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;


public class Course {

    private String courseName;                       //initialising variables
    private List<Module> modules = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, DateTime startDate, DateTime endDate){
        this.courseName  = courseName;
        this.startDate = new DateTime(startDate);
        this.endDate = new DateTime(endDate);


    }
    //accessor and mutator methods
    public String getCourseName(){
        return courseName;

    }

    public void setCourseName(String courseName){

        this.courseName = courseName;


    }


    public List<Module> getModuleList(){
        return modules;
    }

    public void setModuleList(List<Module> moduleList) {
        this.modules = moduleList;
    }
    public void addModules(Module module){
        this.modules.add(module);
        module.addCourse(this);
    }


    public void addCourse(Student student){
        this.students.add(student);
        for(Module listElement : modules){
            listElement.addModule(student);
        }
    }




    public List<Student> getStudentList(){
        return students;
    }

    public void setStudentList(List<Student> studentList) {
        this.students = studentList;
    }

    public DateTime getStartDate(){

        return startDate;

    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate(){

        return endDate;

    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    //tostring method to print out Course details such as name of course , start date etc
    @Override
    public String toString(){

        return "Course[" + this.endDate + "" + this.modules+ this.startDate + this.students+ this.courseName+"]";
    }
}