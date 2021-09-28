
        import org.joda.time.DateTime;
        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.*;


public class ModuleTest {





    @Test
    public void addMethods(){
        Course course  = new Course("ENG4", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));


        Student student = new Student("Monica",new DateTime(1996,9,12,0,0),"Engineering", 123456);

        Module module = new Module("ENG4","Programming");


        module.addModule(student);
        module.addCourse(course);

        assertTrue(module.getStudentList().contains(student));
        assertTrue(module.getCourseList().contains(course));






    }

}