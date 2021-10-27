import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CourseTest {

    @Test
    public void addMethods(){

        Course course  = new Course("Pro3", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Module module = new Module("Pro3","Programming");
        Student student = new Student("James",new DateTime(2002,4,12,0,0),"Programming", 1456);

        course.addCourse(student);
        course.addModules(module);

        assertTrue(course.getStudentList().contains(student));
        assertTrue(course.getModuleList().contains(module));

    }
}