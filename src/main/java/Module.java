
import java.util.ArrayList;
import java.util.List;


public class Module {
    private String moduleName;
    private String moduleID;
    private List<Student>students = new ArrayList<>();
    private List<Course>courses = new ArrayList<>();


    public Module(String Modulename, String ID){
        moduleName = Modulename;
        moduleID = ID;



    }

//accessor and mutator methods

    public String getModuleName(){
        return moduleName;
    }

    public void setModuleName(String moduleName){
        this.moduleName= moduleName;
    }



    public String getModuleID(){
        return moduleID;
    }

    public void setModuleID(String moduleID){
        this.moduleID = moduleID;
    }


    public List<Student> getStudentList(){
        return students;

    }

    public void setStudent(List<Student> students){
        this.students = students;
    }


    public List<Course> getCourseList(){
        return courses;

    }

    public void setCourse(List<Course> courses){
        this.courses = courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }



    public void addModule(Student student){
        this.students.add(student);
    }


    //tostring method to print out Module details such as module name , students etc
    @Override
    public String toString(){

        return "Module[" + this.moduleName + "" + this.moduleID + this.courses + this.students+"]";
    }



}

