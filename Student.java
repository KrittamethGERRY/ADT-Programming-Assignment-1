public class Student {
    private String fName;
    private String lName;
    private String studentID;

    public Student(String studentID,String fName, String lName)    {
        this.fName = fName;
        this.lName = lName;
        this.studentID = studentID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
