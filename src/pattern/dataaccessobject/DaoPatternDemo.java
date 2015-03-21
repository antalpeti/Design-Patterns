package pattern.dataaccessobject;

public class DaoPatternDemo {
  public static void main(String[] args) {
    StudentDao studentDao = new StudentDaoImpl();

    // print all students
    printActualStudents(studentDao);

    // update student
    Student student = studentDao.getAllStudents().get(0);
    student.setName("Michael");
    studentDao.updateStudent(student);

    // get the student
    studentDao.getStudent(0);
    System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : "
        + student.getName() + " ]");
    studentDao.deleteStudent(student);

    // print all students again
    printActualStudents(studentDao);
  }

  /**
   * Print all the student from the database. Only the actually stored students.
   *
   * @param studentDao
   */
  private static void printActualStudents(StudentDao studentDao) {
    for (Student student : studentDao.getAllStudents()) {
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : "
          + student.getName() + " ]");
    }
  }
}
