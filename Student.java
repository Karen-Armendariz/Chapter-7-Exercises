/**
 * @class: student
 * @author: Karen Armendariz
 * @version: 1.0
 * @written on: December 5, 2023
 * course: ITEC 2140 - 13 Saturday Class, Fall 2023
 * description: Creates a simple class named student
 * creates constuctors, getters, and setters.
 */

package Chapter7Exercies;
public class Student            //declares the Student class.
{
    private String idStudent;   //private instance variables declared.
    private int ageStudent;      //property of a student is represented by
    private int gpa;            //each instance.
    private int credHrsCompleted;

    public Student(String idStudent, int ageStudent, int gpa, int credHrsCompleted)
            //constructor of the class.
            //method Student is same as class name. Initializes the instance when created.
    {
        this.idStudent = idStudent;     //This is keyword refering to current instance of the class.
        this.ageStudent = ageStudent;   //The method takes the above parameters and assigns these
        this.gpa = gpa;                 //to instance values.
        this.credHrsCompleted = credHrsCompleted;
    }
    public String getIdStudent(){return idStudent;}     //getter method - returns value of idStudent
    public void setIdStudent(String idStudent){this.idStudent = idStudent;} //setter method - sets the value of idStudent
                                                                            //with the provided parameter.
    public int getAgeStudent(){return ageStudent;}
    public void setAgeStudent(int age){this.ageStudent = age;}
    public int getGpa(){return gpa;}
    public void setGpa(int gpa){this.gpa = gpa;}
    public int getCredHrsCompleted(){return credHrsCompleted;}
    public void setCredHrsCompleted(int credHrsCompleted){this.credHrsCompleted = credHrsCompleted;}

}
