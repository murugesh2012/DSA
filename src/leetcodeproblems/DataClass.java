package leetcodeproblems;

public class DataClass {
    private int rollNumber;
    private String name;
    private String department;

    DataClass(int rollNumber, String name, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public int getRollNumber() {
        return rollNumber;
    }

}
