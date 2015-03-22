package pattern.transferobject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

  // list is working as a database
  List<StudentVO> students;

  public StudentBO() {
    students = new ArrayList<StudentVO>();
    StudentVO student1 = new StudentVO("Robert", 0);
    StudentVO student2 = new StudentVO("John", 1);
    StudentVO student3 = new StudentVO("Liam", 3);
    StudentVO student4 = new StudentVO("Emma", 4);
    StudentVO student5 = new StudentVO("Olivia", 5);
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);
  }

  public void deleteStudent(StudentVO student) {
    boolean isDeleted = students.remove(student);
    if (isDeleted) {
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    } else {
      System.out.println("Student: Roll No " + student.getRollNo() + ", not in the database");
    }
  }

  // retrive list of students from the database
  public List<StudentVO> getAllStudents() {
    return students;
  }

  public StudentVO getStudent(int rollNo) {
    for (StudentVO studentVO : students) {
      if (studentVO.getRollNo() == rollNo) {
        return studentVO;
      }
    }
    return new StudentVO("", rollNo);
  }

  public void updateStudent(StudentVO student) {
    students.get(student.getRollNo()).setName(student.getName());
    System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
  }
}
