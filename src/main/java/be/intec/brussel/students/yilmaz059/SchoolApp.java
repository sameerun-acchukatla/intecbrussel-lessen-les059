package be.intec.brussel.students.yilmaz059;

public class SchoolApp {

    public static void main(String[] args) {

        // STUDENT_01
        Student student01 = new Student();
        student01.studentId = 001;
        student01.firstName = "sameerun";
        student01.lastName = "Acchukatla";
        student01.age = 6;
        student01.phone = 477711189;
        student01.email = "sameerun.shaikh@gmail.com";
        student01.city = "Brussels";
        student01.score = 90;

        // STUDENT_02
        Student student02 = new Student();
        student02.studentId = 002;
        student02.firstName = "Justin";
        student02.lastName = "bieber";
        student02.age = 12;
        student02.email = "justin.bieber@hotmail.com";
        student02.city = "New York";
        student02.phone = 223899988777L;
        student02.score = 60;

        Exam exam = new Exam();
        exam.addStudent(student01);
        exam.addStudent(student02);
        exam.
    }
}
