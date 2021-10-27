

import org.joda.time.DateTime;
import org.joda.time.Period;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String studentName;
    private int age;
    private DateTime DOB;
    private final int studentID;
    private String userName;
    private String courseName;
    private List<Module> modules = new ArrayList<>();

    public Student(String name ,DateTime DOB, String course, int id){
        this.studentName = name;
        this.courseName = course;
        this.studentID = id;
        this.DOB = DOB;

    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }



    public DateTime getDOB(){
        return DOB;
    }

    public void setDOB(DateTime DOB){
        this.DOB = DOB;
    }

    private int getAge(DateTime todayDate) {
        Period period = new Period(DOB, DateTime.now());
        return period.getYears();
    }

    public void setAge(int age){
        this.age=age;
    }


    public String getUserName(DateTime todayDate){
        userName = studentName + getAge(todayDate) ;
        return userName;
    }


    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public List<Module> getModules(){
        return modules;
    }

    public void setModule(List<Module>modules){
        this.modules = modules;
    }

    //tostring method  print out Student details
    @Override
    public String toString(){

        return "Student[" + this.courseName + "" + this.studentName+ this.userName+ this.DOB+ this.age+ this.studentID + this.modules+"]";
    }
}












