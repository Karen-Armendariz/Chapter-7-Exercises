/**
 * @class: School
 * @author: Karen Armendariz
 * @version: 1.0
 * @written on: December 5, 2023
 * course: ITEC 2140 - 13 Saturday Class, Fall 2023
 * description: Creates the class called school and arraylist of students.
 */

package Chapter7Exercies;

import java.util.ArrayList; //import the ArrayList to manage student list

public class School  //School is declared as the class.
{
    private ArrayList<Student> students;        //private instance variable - students - is declared
                                                //will store the list of students in the school in ArrayList.
    public School()
    {
        this.students = new ArrayList<>();
    }       //constructor - initializes the students ArrayList
    public void addStudent(Student student)     //method to add a student.
    {
        students.add(student);
    }
    public void removeStudent(Student student)      //method to remove a student.
    {
        students.remove(student);
    }
    public Student youngestStudent()    //method to find youngest student
    {
        Student youngestStudent = students.get(0);

        for (Student student : students)
        {
            if (student.getAge() < youngestStudent.getAge())
            {
                youngestStudent = student;
            }
        }
        return youngestStudent;             //returns null if the list is empty.
    }

    public Student oldestStudent()      //method to find oldest student
    {
        Student oldestStudent = students.get(0);

        for (Student student : students)
        {
            if (student.getAge() < oldestStudent.getAge())
            {
                oldestStudent = student;
            }
        }
        return oldestStudent;
    }
}



