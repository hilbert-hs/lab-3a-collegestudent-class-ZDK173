public class CollegeStudent
{
    private String name;
    private String courseTitle;
    private String courseNumber;
    private int credits;
    private int courseFee;
    private static int CostPerHour = 125;
    private static int nextStudentID = 1;
    private int studentID;


    public CollegeStudent(String _name, String _courseTitle, String _courseNumber, int _credits)
    {
        name = _name;
        courseTitle = _courseTitle;
        courseNumber = _courseNumber;
        credits = _credits;
        courseFee = _credits * CostPerHour;
        studentID = nextStudentID;
        nextStudentID++;
    }
    public CollegeStudent()
    {
        studentID = nextStudentID;
        nextStudentID++;
    }
    public CollegeStudent(String _name){
        name = _name;
        studentID = nextStudentID;
        nextStudentID++;

    }

    public void setName(String _name){
        name = _name;
    }
    public void setcourseName(String _courseTitle){
        courseTitle = _courseTitle;
    }
    public void setcourseNumber(String _courseNumber){
        courseNumber = _courseNumber;
    }
    public void setCredits(int _credits){
        credits = _credits;
    }
    public void setcourseFee(int _courseFee){
        courseFee = _courseFee;
    }
    public String getName(){
        return name;
    }
    public String getcourseName(){
        return name;
    }
    public String getcourseNumber(){
        return courseNumber;
    }
    public int getCredits(){
        return credits;
    }
    public int getcourseFee(){
        return courseFee;
    }
    public int getstudentID(){
        return studentID;
    }


    public String toString()
    {
        return name + ": " + courseTitle + ", " + courseNumber + ", " + credits + " Cost: $" + courseFee;

    }













}// Create your CollegeStudent class here

