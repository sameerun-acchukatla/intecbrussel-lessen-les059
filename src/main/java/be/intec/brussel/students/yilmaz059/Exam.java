package be.intec.brussel.students.yilmaz059;

public class Exam {

    Student[] students = new Student[0];
    Student[] questions = new Student[0];

    void addStudent(Student student){

        Student[] tempArray = new Student[students.length +1];
        for (int index = 0;index < students.length;index++){
            tempArray[index] = students[index];
        }
        // add the new students to the last index...
        tempArray[students.length -1] = student;
        students = tempArray;

    }

    void removeStudent(){

        Student[] tempArray = new Student[students.length -1];
        for (int index = 0;index < students.length - 1;index++){

            tempArray[index] = students[index];
        }
        students = tempArray;

    }

    void addQuestion(Student question){

        Student[] tempQuestionAddArr = new Student[questions.length +1];
        for (int index =0; index < questions.length;index++){

            tempQuestionAddArr[index] = questions[index];

        }
        tempQuestionAddArr[questions.length - 1] = question;
        questions = tempQuestionAddArr;

    }

    void removeQuestion(){

        Student[] tempQuestionRemoveArr = new Student[questions.length -1];
        for (int index = 0; index < questions.length;index++){

            tempQuestionRemoveArr[index] = questions[index];
        }

    }

    void printStudent(){}
    void printScore(){}

}
