public class Main {

  public static void main(String[] args) {

    //Zad 1
    Student s1 = new Student();
    Student s2 = new Student("Olga Łopacka", 123456);

    System.out.println("Student name: "+s1.name);
    System.out.println("Student id: "+s1.studentId);
    System.out.println("Student name: "+s2.name);
    System.out.println("Student name: "+s2.studentId);


    /*
    //Zad 2
    SecretStudent secretStudent1 = new SecretStudent();
    System.out.println("Student firstname: " + secretStudent1.getFirstName());
    System.out.println("Student lasttname: " + secretStudent1.getLastName());
    System.out.println("Student id: " + secretStudent1.getStudentId());

    //not possible
    // System.out.println("Student firstname: " + secretStudent1.firstName);
    */


    //Zad 3
    /*
    SecretStudent secretStudent2 = new SecretStudent();
    secretStudent2.setFirstName("Olga");
    secretStudent2.setLastName("Łopacka");
    secretStudent2.setStudentId(123456);

    System.out.println("Student firstname: " + secretStudent2.getFirstName());
    System.out.println("Student lastname: " + secretStudent2.getLastName());

    secretStudent2.setFirstName("");
    */

    /*
    //Zad 4
    SecretStudent secretStudent3 = new SecretStudent();
    secretStudent3.readFromScanner();

    System.out.println("Student firstname: " + secretStudent3.getFirstName());
    System.out.println("Student lastname: " + secretStudent3.getLastName());
    System.out.println("Student firstname: " + secretStudent3.getStudentId());
    */
  }
}