package Task1;

import java.util.*;

public class main {

    public static void main(String[] args){
        HashSet<Student> students = new HashSet<>();
        Student student1 = new Student("Ivanov Ivan", "QA-79",3, Arrays.asList(5, 5, 4, 3));
        Student student2 = new Student("Bobrov Vladimir", "SB-87", 2, Arrays.asList(5, 3, 5, 2));
        Student student3 = new Student("Krotov Danil", "VM-17", 1, Arrays.asList(1, 2, 1, 2));
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        removeStudent(students);
        System.out.println(students);
        raisingCourse(students);
        System.out.println(students);
        printStudents(students, 3);
    }

    public static void removeStudent(Set<Student> students){
    Iterator<Student> it = students.iterator();
    while (it.hasNext()){
        Student student = it.next();
        if(student.avgEvaluations() < 3){
            it.remove();
        }
    }
    }

    public static void raisingCourse(Set<Student> students){
    Iterator<Student> it = students.iterator();
    while (it.hasNext()){
        Student student = it.next();
        if (student.avgEvaluations() >= 3){
            student.course +=1;
        }
    }
    }

    public static void printStudents(Set<Student> students , int course){
    Iterator<Student> it = students.iterator();
    while (it.hasNext()){
        Student student = it.next();
        if(student.course == course){
            System.out.println(student.FIO);
        }
    }
    }
}
