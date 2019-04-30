package imbstudentdatabas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    //Variable Declaration
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    public List<String> availableCourses = populateAvailableCourses();
    public ArrayList<String> enrolledCourses = new ArrayList<String>(6);

    //Constructors
    Student() {
        populateAvailableCourses();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the students first name");
        this.firstName = in.nextLine();
        System.out.println("Enter the students last name");
        this.lastName = in.nextLine();
        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior");
        this.gradeYear = in.nextInt();
        setStudentID();
        enroll();
        tuitionBalance = (this.enrolledCourses.size() * 600);

        System.out.println(this.toString());
    }


    //Methods
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String enrollmentStatus = (enrolledCourses.toArray().length <= 2) ? "Part-Time" : "Full-Time";
        result.append("STUDENT RECORD #" + getStudentID() + "\nSTUDENT: " + getFirstName() + " " + getLastName() + " " + "\nYEAR: " + getGradeYear() + "\nENROLLMENT STATUS: " + enrollmentStatus + "\n\n");
        result.append("\nENROLLED COURSES: \n");
        for (int i = 0; i < this.enrolledCourses.toArray().length; i++) {
            result.append((Integer.toString(i + 1) + ". " + enrolledCourses.toArray()[i]) + " ");
        }
        result.append("\n");
        result.append("\nTUITION BALANCE: " + "$" + tuitionBalance + "\n");
        return result.toString();
    }

    public void enroll() {
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < this.availableCourses.toArray().length; i++) {
            sb1.append((Integer.toString(i + 1)) + " " + (availableCourses.toArray()[i]) + "\n");
        }

        System.out.println("Enter course to enroll (0 to Quit): \n" + sb1.toString() + " ");
        Scanner in2 = new Scanner(System.in);
        int selectedIndex = (in2.nextInt() - 1);

        try {
            if (selectedIndex != -1) {
                this.enrolledCourses.add(availableCourses.get(selectedIndex));
                availableCourses.remove(selectedIndex);
            } else {
                System.out.println("\n\n");

                return;
            }
        } catch (IndexOutOfBoundsException inputIndex) {
            System.out.println("!!! Invalid Entry !!!\n");
        }

        enroll();

    }

    //View Balance
    public void viewBalance() {
        System.out.println("Your balance is $" + getTuitionBalance());
    }

    //Pay Tuition
    public void payTuition(int payment) {
        Scanner in = new Scanner(System.in);
        payment = in.nextInt();
        setTuitionBalance(tuitionBalance -= payment);
        System.out.println("Thank you for your payment of $" + payment + ".\n" + "Your new balance is " + tuitionBalance);
    }


    private List<String> populateAvailableCourses() {
        Manager courseManager = Manager.getInstance();
        return (courseManager.getCourseList());
    }

    //Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public int getStudentID() {
        return studentID;
    }

    public int setStudentID() {
        //Grade Level + ID
        id++;
        this.studentID = Integer.parseInt(Integer.toString(getGradeYear()) + Integer.toString(id));
        return this.studentID;
    }

    public int getTuitionBalance() {
        return tuitionBalance;
    }

    public void setTuitionBalance(int tuitionBalance) {
        this.tuitionBalance = tuitionBalance;
    }

    public int getCostOfCourse() {
        return costOfCourse;
    }

    public void setCostOfCourse(int costOfCourse) {
        this.costOfCourse = costOfCourse;
    }
}
