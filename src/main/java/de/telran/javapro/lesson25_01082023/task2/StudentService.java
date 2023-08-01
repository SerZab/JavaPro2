package de.telran.javapro.lesson25_01082023.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {
    private static int id;
    private static Map<Integer, Student> students = new HashMap<>();
    public static int getId(){
        return ++id;
    }

    public static void addStudents(Student student) {
        students.put(student.getId(),student);
    }
    public static Map<Integer, Student> getAllStudents() {
        return students;
    }
    public static int getStudentsNumber(){
        return students.size();
    }
    public static int getStudentByDegree(Degree degree){
        return (int) students.entrySet().stream().filter(x->x.getValue().getDegree().equals(degree)).count();
    }
    public static int getStudentAvgAge(){
        int ageCount = 0;
        for (Student student: students.values()){
            ageCount += student.getAge();
        }
        return ageCount / students.size();
    }
    public static int getStudentAvgAgeByDegree(Degree degree){
        int ageCountByDegree = 0;
        int studentCount = 0;
        for (Student s : students.values()){
            if(degree == s.getDegree()){
                ageCountByDegree += s.getAge();
                studentCount++;
            }
        }
        return ageCountByDegree / studentCount;
    }
    public List<Student> getStudentListByDegree(Degree degree){
        List<Student> list = new ArrayList<>();
        for (Student student : students.values()){
            if (degree == student.getDegree()){
                list.add(student);
            }
        }
        return list;
    }
}
