package test.java.model;

import ecz.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
    public class Student4Test {


        private Student student1, student2, student3;

        @BeforeEach
        void setUp() {
            // Initialize student instances with different marks and fees
            student1 = new Student(1, "Student One", "City A", 70, 80, 90, 1000.0f);
            student2 = new Student(2, "Student Two", "City B", 85, 90, 95, 800.0f);
            student3 = new Student(3, "Student Three", "City C", 60, 70, 80, 1200.0f);
        }

        @Test
        void testHighestTotalMarks() {
            // Assuming a static method findStudentWithHighestTotalMarks exists and returns a Student object
            Student highestMarksStudent = Student.getStudentWithHighestTotalMarks(new Student[] {student1, student2, student3});
            assertEquals(student2, highestMarksStudent, "Student with the highest total marks should be Student Two");
        }

        @Test
        void testLeastMonthlyFee() {
            // Assuming a static method findStudentWithLeastMonthlyFee exists and returns a Student object
            Student leastFeeStudent = Student.getStudentWithLeastMonthlyFee(Arrays.asList(student1, student2, student3).toArray(new Student[0]));
            assertEquals(student2, leastFeeStudent, "Student with the least monthly fee should be Student Two");
        }

        @Test
        void testScholarshipEligibility() {
            // Assuming a method isEligibleForScholarship exists for each student instance
            student1.setIsEligibleForScholarship(student1.isEligibleForScholarship());
            student2.setIsEligibleForScholarship(student2.isEligibleForScholarship());
            student3.setIsEligibleForScholarship(student3.isEligibleForScholarship());

            assertFalse(student1.isEligibleForScholarship(), "Student Two should be eligible for a scholarship based on predefined criteria");
            assertFalse(student2.isEligibleForScholarship(),"Student One should not be eligible for a scholarship based on predefined criteria");
            assertFalse(student3.isEligibleForScholarship(), "Student Three should not be eligible for a scholarship based on predefined criteria");
        }
    }
