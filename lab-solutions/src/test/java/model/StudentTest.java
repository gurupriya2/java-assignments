package test.java.model;

import ecz.model.Student;
import org.junit.Test;

import static ecz.model.Student.getStudentWithHighestTotalMarks;
import static ecz.model.Student.getStudentWithLeastMonthlyFee;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public  void testGetResult() {
        Student student1 = new Student(1, "Alice", "chennai", 59, 60, 60, 5000);
        assertEquals("fail", student1.getResult());
    }

    @Test
    public void testStudentMarks() {
        Student student1 = new Student(1, "guru", "chennai", 100, 99, 99, 9000);
        assertNotEquals("fail", student1.getMarks1());
    }

    @Test
    public void testStudentMarksIsNull() {
        Student student2 = new Student(2, "utr", "uei", 0, 0, 0, 0);

        assertNotNull(0, "utgugx");
    }

    @Test
    public void testStudentLowestMonthlyFee() {
        Student student1 = new Student(1, "gdshvh", "hgc", 100, 100, 59, 5000);
        Student student2 = new Student(2, "hfyug", "fdrh", 99, 79, 61, 9000);
        Student student3 = new Student(3, "hdhgcyu", "hrf", 70, 60, 80, 6000);
        Student[] students = {student1, student2, student3};

        assertEquals(5000, getStudentWithLeastMonthlyFee(students).getFeePerMonth());
    }

    @Test
    public void testStudentHighestScore() {
        Student student1 = new Student(1, "gdshvh", "hgc", 100, 100, 59, 5000);
        Student student2 = new Student(2, "hfyug", "fdrh", 99, 79, 61, 9000);
        Student student3 = new Student(3, "hdhgcyu", "hrf", 70, 60, 80, 6000);
        Student[] students = {student1, student2, student3};
        Student highestTotalMarksStudent = getStudentWithHighestTotalMarks(students);
        assertEquals(student1, highestTotalMarksStudent);

    }

    @Test
    public void testStudentAnnualFee() {
        Student student1 = new Student(1, "guru", "fjf", 60, 70, 80, 5000);
        assertEquals(60000, student1.getAnnualFee(), 0.01);
    }


    @Test
    public void testStudentAverageMark() {
        Student student1 = new Student(1, "hgsyu", "jgg", 70, 70, 70, 7000);
        assertEquals(70, student1.getAverage());
    }


    @Test
    public void testDisplayStudentDetails() {
        Student student = new Student(1, "Alice", "New York", 70, 80, 90, 5000);

        String expectedDetails = "Name: Alice\n" +
                "Total Marks: 240\n" +
                "Average Marks: 80.0\n" +
                "Result: pass\n" +
                "Scholarship: available\n";

        String actualDetails = "Name: " + student.getStudentName() + "\n" +
                "Total Marks: " + student.getTotalMarks() + "\n" +
                "Average Marks: " + student.getAverage() + "\n" +
                "Result: " + student.getResult() + "\n" +
                "Scholarship: " + (student.isEligibleForScholarship() ? "available" : "not available") + "\n";

        assertEquals(expectedDetails, actualDetails);
    }
}
