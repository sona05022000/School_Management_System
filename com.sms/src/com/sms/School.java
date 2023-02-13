package com.sms;

import java.util.Arrays;


public class School {

    private Teacher[] teachers;
    private Student[] students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    
    public School(Teacher[] teachers, Student[] students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    
    public Teacher[] getTeachers() {
        return teachers;
    }

    
    public void addTeacher(Teacher teacher) {
        teachers = Arrays.copyOf(teachers, teachers.length + 1);
        teachers[teachers.length - 1] = teacher;
    }

        public Student[] getStudents() {
        return students;
    }

   
    public void addStudent(Student student) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }

    
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

   
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
}
