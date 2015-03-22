package pattern.transferobject;

public class TransferObjectPatternDemo {
  public static void main(String[] args) {
    StudentBO studentBusinessObject = new StudentBO();

    // print all students
    printAllStudents(studentBusinessObject);

    // update student
    StudentVO student = studentBusinessObject.getAllStudents().get(0);
    student.setName("Michael");
    studentBusinessObject.updateStudent(student);

    // get the student
    student = studentBusinessObject.getStudent(0);
    System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : "
        + student.getName() + " ]");

    student = studentBusinessObject.getStudent(0);
    studentBusinessObject.deleteStudent(student);
    student = studentBusinessObject.getStudent(3);
    studentBusinessObject.deleteStudent(student);
    student = studentBusinessObject.getStudent(3);
    studentBusinessObject.deleteStudent(student);

    printAllStudents(studentBusinessObject);
  }

  /**
   * Print out all available students.
   *
   * @param studentBusinessObject
   */
  private static void printAllStudents(StudentBO studentBusinessObject) {
    for (StudentVO student : studentBusinessObject.getAllStudents()) {
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : "
          + student.getName() + " ]");
    }
  }
}
