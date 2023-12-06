/**
 * @class: equalsandtoString
 * @author: Karen Armendariz
 * @version: 1.0
 * @written on: December 5, 2023
 * course: ITEC 2140 - 13 Saturday Class, Fall 2023
 * description: Creates the equals and toString methods for Student class.
 */


package Chapter7Exercies;

public class EqualsandtoString
{
    private String idStudent;   //private instance variables of class EqualsandtoString declared.
    private int ageStudent;
    private int gpa;
    private int credHrsCompleted;

    public EqualsandtoString(String idStudent, int ageStudent, int gpa, int credHrsCompleted)   //constructor
                                                                    //initializes the instance with provided values for each.
    {
        this.idStudent = idStudent;
        this.ageStudent = ageStudent;
        this.gpa = gpa;
        this.credHrsCompleted = credHrsCompleted;
    }
    public String getIdStudent()                    //getter method returns value of idStudent
    {return idStudent;}
    public void setIdStudent(String idStudent)      //setter method - sets idStudent value with the provided parameter.
    {this.idStudent = idStudent;}
    public boolean equals(EqualsandtoString id)      //equals method - to check student id numbers.
    {return idStudent.equals(id.getIdStudent());}

    public String toString()
    {return idStudent + " " ; }
    public int getAgeStudent()  //getter and setter methods as above.
    {return ageStudent;}
    public void setAgeStudent(int age)
    {this.ageStudent = age;}
    public int getGpa()
    {return gpa;}
    public void setGpa(int gpa)
    {this.gpa = gpa;}
    public int getCredHrsCompleted()
    {return credHrsCompleted;}
    public void setCredHrsCompleted(int credHrsCompleted)
    {this.credHrsCompleted = credHrsCompleted;}

    @Override
    public String toString1() {
        return "Name: " + idStudent + ", ID: " + idStudent;     //this returns name and student id
    }

}
