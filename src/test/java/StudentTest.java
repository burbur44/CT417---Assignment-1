import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {

    //iniliasing variables
    private Module EE321, MD123,NS456, AC789;
    private Student Monica, Adam, Victoria, John;

    /**
     *
     */
    public StudentTest() {
    }

    /**
     *
     */
    @Test
    public void testGenerateUserName() {



        Course course  = new Course("ENG4", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Course course1 = new Course("MED4", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Course course2 = new Course("ACC4", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));
        Course course3 = new Course("NUS4", new DateTime(2020,10,9,0,0),new DateTime(2021,6,4,0,0));

        EE321 = new Module("ENG4","Programming");
        MD123 = new Module("MED4","Anatomy");
        NS456 = new Module("ACC4","Auditing");
        AC789 = new Module("NUS4","Chemistry");

        course.addModules(EE321);
        course1.addModules(MD123);
        course2.addModules(NS456);
        course3.addModules(AC789);

        DateTime todayDate = new DateTime(2021, 10, 12, 12, 0); //set current Date

        Monica = new Student("Monica",new DateTime(1996,9,12,0,0),"Engineering", 123456);
        Victoria = new Student("Victoria",new DateTime(1997,8,6,0,0),"Medicine", 1345678);
        Adam = new Student("Adam",new DateTime (1996, 7, 14, 0,0),"Nursing", 1456789);
        John = new Student("John",new DateTime (1995,10,19,0,0), "Accounting", 1567890);


        assertEquals("Monica25",Monica.getUserName(todayDate));
        assertEquals("Victoria23",Victoria.getUserName(todayDate));   //verfiy getUserName method
        assertEquals("Adam24",Adam.getUserName(todayDate));
        assertEquals("John25",John.getUserName(todayDate));


    }

}