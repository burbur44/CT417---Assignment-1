import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {

    private Module Ct252, ct101,ct331, ct567;
    private Student James, John , Sam, Bob;

    @Test
    public void testGenerateUserName() {

        Course course  = new Course("Pro3", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Course course1 = new Course("Math4", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Course course2 = new Course("ENG3", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Course course3 = new Course("Chem4", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));

        Ct252 = new Module("Pro3","Programming");
        ct101 = new Module("Math4","maths");
        ct331 = new Module("ENG3","Engineering");
        ct567 = new Module("Chem4","Chemistry");

        course.addModules(Ct252);
        course1.addModules(ct101);
        course2.addModules(ct331);
        course3.addModules(ct567);

        DateTime todayDate = new DateTime(2021, 10, 12, 12, 0); //set current Date

        James = new Student("James",new DateTime(2002,4,12,0,0),"Programming", 1456);
        John = new Student("John",new DateTime(1999,6,4,0,0),"maths", 2432);
        Sam = new Student("Sam",new DateTime (2000, 8, 5, 0,0),"Engineering", 4324);
        Bob = new Student("Bob",new DateTime (2001,10,5,0,0), "Chemistry", 4321);


        assertEquals("Monica25",James.getUserName(todayDate));
        assertEquals("Victoria24",John.getUserName(todayDate));   //verify getUserName method
        assertEquals("Adam25",Sam.getUserName(todayDate));
        assertEquals("John26",Bob.getUserName(todayDate));


    }

}