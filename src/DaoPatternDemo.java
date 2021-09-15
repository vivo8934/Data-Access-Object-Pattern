import value.object.Student;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();


        for (Student student: studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }
        Student student =studentDao.getAllStudents().get(0);
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");


        student.setName("Vinny");
        studentDao.updateStudent(student);
        System.out.println("updated name: " + student.getName());


    }
}
