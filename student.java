public class Student {
    private int id;
    private String name;
    private double marks;
    private int attendance;

    public Student(int id, String name, double marks, int attendance) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String getGrade() {
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        return "F";
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Marks: " + marks +
                ", Attendance: " + attendance + "%" +
                ", Grade: " + getGrade();
    }
}