public class Student {
        // Attributes
        private int studentId;
        private String studentName;
        private String city;
        private int marks1;
        private int marks2;
        private int marks3;
        private float feePerMonth;
        private boolean isEligibleForScholarship;

        // Constructors
        public Student(int studentId, String studentName, String city, int marks1, int marks2, int marks3, float feePerMonth) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.city = city;
            this.marks1 = marks1;
            this.marks2 = marks2;
            this.marks3 = marks3;
            this.feePerMonth = feePerMonth;
            this.isEligibleForScholarship = false; // Default value
        }

        // Getter methods
        public int getStudentId() {
            return studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public String getCity() {
            return city;
        }

        public int getMarks1() {
            return marks1;
        }

        public int getMarks2() {
            return marks2;
        }

        public int getMarks3() {
            return marks3;
        }

        public float getFeePerMonth() {
            return feePerMonth;
        }

        public boolean isEligibleForScholarship() {
            return isEligibleForScholarship;
        }

        // Setter methods
        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setMarks1(int marks1) {
            this.marks1 = marks1;
        }

        public void setMarks2(int marks2) {
            this.marks2 = marks2;
        }

        public void setMarks3(int marks3) {
            this.marks3 = marks3;
        }

        public void setFeePerMonth(float feePerMonth) {
            this.feePerMonth = feePerMonth;
        }

        public void setEligibleForScholarship(boolean eligibleForScholarship) {
            isEligibleForScholarship = eligibleForScholarship;
        }

        // Additional methods
        public float getAnnualFee() {
            return feePerMonth * 12;
        }

        public int getTotalMarks() {
            return marks1 + marks2 + marks3;
        }

        public double getAverage() {
            return (marks1 + marks2 + marks3) / 3.0;
        }

        public String getResult() {
            if (marks1 > 60 && marks2 > 60 && marks3 > 60) {
                return "pass";
            } else {
                return "fail";
            }
        }



        public static void main(String[] args) {
            // Creating three Student objects
            Student student1 = new Student(1, "Alice", "New York", 70, 80, 90, 5000);
            Student student2 = new Student(2, "Bob", "Los Angeles", 65, 75, 55, 4500);
            Student student3 = new Student(3, "Charlie", "Chicago", 80, 75, 60, 4800);

            // Populating the objects using setter methods (if needed)

            // Display the name of the student with the highest total marks
            Student[] students = {student1, student2, student3};
            Student highestTotalMarksStudent = getStudentWithHighestTotalMarks(students);
            System.out.println("Student with highest total marks: " + highestTotalMarksStudent.getStudentName());

            // Print the name and fee of the student who pays the least monthly fee
            Student studentWithLeastMonthlyFee = getStudentWithLeastMonthlyFee(students);
            System.out.println("Student with least monthly fee: " + studentWithLeastMonthlyFee.getStudentName() +
                    ", Fee: $" + studentWithLeastMonthlyFee.getFeePerMonth());

            // Print details for each student
            for (Student student : students) {
                System.out.println("Name: " + student.getStudentName());
                System.out.println("Total Marks: " + student.getTotalMarks());
                System.out.println("Average Marks: " + student.getAverage());
                System.out.println("Result: " + student.getResult());
                System.out.println("Scholarship: " + (student.isEligibleForScholarship() ? "available" : "not available"));
                System.out.println();
            }
        }

        // Helper method to find the student with the highest total marks
        private static Student getStudentWithHighestTotalMarks(Student[] students) {
            Student highestStudent = null;
            int highestMarks = Integer.MIN_VALUE;
            for (Student student : students) {
                int totalMarks = student.getTotalMarks();
                if (totalMarks > highestMarks) {
                    highestMarks = totalMarks;
                    highestStudent = student;
                }
            }
            return highestStudent;
        }

        // Helper method to find the student who pays the least monthly fee
        private static Student getStudentWithLeastMonthlyFee(Student[] students) {
            Student lowestFeeStudent = null;
            float lowestFee = Float.MAX_VALUE;
            for (Student student : students) {
                float fee = student.getFeePerMonth();
                if (fee < lowestFee) {
                    lowestFee = fee;
                    lowestFeeStudent = student;
                }
            }
            return lowestFeeStudent;
        }        }
