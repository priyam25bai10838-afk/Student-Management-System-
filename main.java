import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager studentManager = new StudentManager();
        AttendanceManager attendanceManager = new AttendanceManager();
        GradeManager gradeManager = new GradeManager();
        ReportManager reportManager = new ReportManager();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Marks");
            System.out.println("4. Update Attendance");
            System.out.println("5. Generate Report");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();

                    System.out.print("Attendance: ");
                    int attendance = sc.nextInt();

                    studentManager.addStudent(
                            new Student(id, name, marks, attendance));

                    System.out.println("Student Added Successfully");
                    break;

                case 2:
                    for (Student s : studentManager.getStudents()) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    id = sc.nextInt();

                    Student s1 = studentManager.findStudent(id);

                    if (s1 != null) {
                        System.out.print("New Marks: ");
                        marks = sc.nextDouble();
                        gradeManager.updateMarks(s1, marks);
                    }
                    break;

                case 4:
                    System.out.print("Student ID: ");
                    id = sc.nextInt();

                    Student s2 = studentManager.findStudent(id);

                    if (s2 != null) {
                        System.out.print("Attendance %: ");
                        attendance = sc.nextInt();
                        attendanceManager.updateAttendance(s2, attendance);
                    }
                    break;

                case 5:
                    System.out.print("Student ID: ");
                    id = sc.nextInt();

                    Student s3 = studentManager.findStudent(id);

                    if (s3 != null) {
                        reportManager.generateReport(s3);
                    }
                    break;

                case 6:
                    System.out.print("Student ID: ");
                    id = sc.nextInt();

                    studentManager.deleteStudent(id);
                    System.out.println("Student Deleted");
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
}