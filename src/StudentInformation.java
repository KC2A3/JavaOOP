import model.Student;

public class StudentInformation {
  public static void main(String args) {
    Student student = new Student();
    student.setName("刘昱涵");
    student.setAge(23);
    student.setGender("man");
    student.setID(666);
    System.out.println(
        student.getName()
            + ", "
            + student.getAge()
            + ", "
            + student.getGender()
            + ", "
            + student.getID());
  }
}
