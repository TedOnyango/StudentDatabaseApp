package com.ted.studentdatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String course;
    private int tuitionBalance;
    private int costOfCourse = 600;

//    Constructor: prompts user to enter student name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's class level: ");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear);
    }

//    Generate student id

//    Enroll in course
//    View balance
//    Pay tuition
//    Show status
}
