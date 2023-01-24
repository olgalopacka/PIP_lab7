import java.util.Scanner;

public class SecretStudent {
  private String firstName = "secret firstname";
  private String lastName = "secret lastname";
  private int studentId = 0;

  SecretStudent(){
  }

  SecretStudent(String firstName, String lastName, int studentId) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentId = studentId;
  }


  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    if(firstName != "")
      this.firstName = firstName;
    else
      System.out.println("Firstname cannot be null");
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    if (lastName != "")
      this.lastName = lastName;
    else {
      System.out.println("Lastname cannot be null");
    }
  }

  public int getStudentId() {
    return this.studentId;
  }

  public void setStudentId(int studentId) {
    if (studentId > 0)
      this.studentId = studentId;
    else {
      System.out.println("Id must be greater than 0");
    }
  }

  public void readFromScanner(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter student's firstname: ");
    String firstName = scanner.nextLine();
    this.setFirstName(firstName);

    System.out.println("Enter student's lastname: ");
    String lastName = scanner.nextLine();
    this.setLastName(lastName);

    System.out.println("Enter student's id: ");
    int id = scanner.nextInt();
    this.setStudentId(id);
  }

}