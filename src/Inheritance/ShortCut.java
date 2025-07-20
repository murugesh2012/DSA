package Inheritance;

public class ShortCut {
    public ShortCut(int rollNumber, String studentName) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }

    private int rollNumber;
    private String studentName;
    private Object[] objectType;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


}
