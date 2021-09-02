package be.intec.brussel.students.yilmaz059;

public class Student {

    // information(fields)

    int studentId;
    String firstName;
    String lastName;
    int age;
    double phone;
    String email;
    String city;
    double score;

    // events(methods)

       void register(){


       }

        void clear(){

        }

        void print(){

            System.out.println("Student : " + studentId + " " +  firstName + " " + lastName + " " + age + " " + phone + " " + email + " " +
                    city + " " + score);

        }

}
