package Second;

import SoftwareEngAssignmentOne.Student;
import SoftwareEngAssignmentOne.Module;
import SoftwareEngAssignmentOne.Lecturer;
import SoftwareEngAssignmentOne.CourseProgramme;

import org.joda.time.DateTime;

public class App {
    private static Student s1, s2, s3;
    private static Module m1, m2, m3, m4;
    private static Lecturer l1, l2, l3, l4;
    private static CourseProgramme c1, c2;
    
    public static void main(String[] args) {
        //create students
        s1 = new Student("Tom", "25/09/2000", 19471182, 22);
        s2 = new Student("Bill", "26/08/2001", 19471183, 21);
        s3 = new Student("Chap", "27/07/2000", 19471184, 22);
        
        //create lecturers
        l1 = new Lecturer("Bossman", "01/01/1999", 19332345, 54);
        l2 = new Lecturer("Bosswoman", "01/01/1994", 19332346, 26);
        l3 = new Lecturer("Tom Lecturer", "01/01/1954", 19332323, 86);
        l4 = new Lecturer("Aughhh", "01/01/1993", 19332365, 43);
        
        //create courses
        c1 = new CourseProgramme("Computer Science", new DateTime(2019, 9, 1, 0, 0), new DateTime(2023, 5, 28, 0, 0));
        c2 = new CourseProgramme("Computer Engineering", new DateTime(2019, 9, 1, 0, 0), new DateTime(2023, 5, 28, 0, 0));
        
        //create modules
        m1 = new Module("Software Engineering 3", "CT410", l1);
        m2 = new Module("Software Engineering 4", "CT411", l2);
        m3 = new Module("Software Engineering 5", "CT412", l3);
        m4 = new Module("Software Engineering 6", "CT413", l4);
       
        //add students to modules
        m1.addStudents(s1);
        m1.addStudents(s3);
        m2.addStudents(s2);
        m2.addStudents(s3);
        m3.addStudents(s2);
        m3.addStudents(s1);
        m4.addStudents(s2);
        m4.addStudents(s3);
        
        //add modules to courses
        c1.addModules(m1);
        c1.addModules(m2);
        c2.addModules(m3);
        c2.addModules(m4);
        
        //add modules to students
        s1.addModules(m1);
        s3.addModules(m1);
        s2.addModules(m2);
        s3.addModules(m2);
        s2.addModules(m3);
        s1.addModules(m3);
        s2.addModules(m4);
        s3.addModules(m4);
        
        //add courses to students
        s1.addCourse(c1);
        s2.addCourse(c2);
        s3.addCourse(c1);
        
        //add courses to modules
        m1.addCourse(c1);
        m2.addCourse(c2);
        m3.addCourse(c1);
        m4.addCourse(c2);
        
        //Print course info
        System.out.println(c1);
        System.out.println(c2);
        
        //Print student info
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
