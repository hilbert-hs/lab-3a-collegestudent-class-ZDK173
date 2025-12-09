import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String ans = "";
    // write a while loop to create and display CollegeStudnets using the below method
    while (!ans.equals("N")){
      CollegeStudent student = createStudent(scan);
      System.out.println(student);
      System.out.println("Would you like to make a new Student? Y/N");
      ans = scan.nextLine();

    }
  }

  private static CollegeStudent createStudent(Scanner scan) {
    // complete this method to create a CollegeStudent object with details provided by the user
      System.out.println("What is your first and last name?");
      String name =  scan.nextLine();
      System.out.println("What is your course title?");
      String courseTitle = scan.nextLine();
      System.out.println("What is your course number?");
      String courseNumber = scan.nextLine();
      System.out.println("How many credits do you have?");
      int credits = scan.nextInt();
      return new CollegeStudent(name, courseTitle, courseNumber, credits);
  }
    
}
