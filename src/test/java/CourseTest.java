import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CourseTest {



    @Test
    public void addMethods(){


        Course course  = new Course("ENG4", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Module module = new Module("ENG4","Programming");
        Student student = new Student("Monica",new DateTime(1996,9,12,0,0),"Engineering", 123456);


        course.addCourse(student);
        course.addModules(module);



        assertTrue(course.getStudentList().contains(student));
        assertTrue(course.getModuleList().contains(module));




    }





}