package imbstudentdatabas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    private static Manager instance;

    private Manager() {
    }

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    //Variable Declaration
    private String title;
    private String instructor;
    private int maxAttendees = 30;
    private int currentAttendees;
    private List<String> courseList = new LinkedList<String>(Arrays.asList("Logic & Design", "C++", "C#", "Swift", "Ruby", "Java", "HTML/CSS", "JavaScript", "Python"));
    static String currentTree;

    //Methods

    protected void modifyCourses(String plusMinus, String courseTitle) {
        getCourseList();
        if (plusMinus == "remove") {
            courseList.remove(courseTitle);
        } else if (plusMinus == "add") {
            courseList.add(courseTitle);
        }
        setCourseList(courseList);
    }

    protected static void decisionTree() {
        Scanner in = new Scanner(System.in);
        switch (Manager.currentTree) {
            case "Main Menu":
                System.out.println("Welcome to the Education Administrative Console:\n1. Students\n2. Instructors\n3. Curriculum\n\nPress \"Q\" at any time to quit or \"R\" to return to the previous menu.");
                Manager.currentTree = in.nextLine();
                switch (Manager.currentTree) {
                    case "1":
                        Manager.currentTree = "Students";
                        break;
                    case "2":
                        Manager.currentTree = "Instructors";
                        break;
                    case "3":
                        Manager.currentTree = "Curriculum";
                    case "Q":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Entry!");
                        break;
                }
                break;
            case "Students":
                System.out.println("STUDENTS:\n1.Browse Students\n2. Enroll Student");
                Manager.currentTree = in.nextLine();
                switch (Manager.currentTree) {
                    case "1":
                        Manager.currentTree = "Students1";
                        break;
                    case "2":
                        Manager.currentTree = "Students2";
                        break;
                    case "R":
                        Manager.currentTree = "Main Menu";
                    case "Q":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Entry!");
                        break;
                }
                break;
            case "Students1":
                System.out.println("Enter Student ID or First and Last Name");
                Manager.currentTree = in.nextLine();
                switch (Manager.currentTree) {
                    case "R":
                        Manager.currentTree = "Students";
                    case "Q":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Looking up Student");
                        break;
                }
                break;
            case "Students2":
                Student newStudent = new Student();
                System.out.println("Add another student? Y/N");
                Manager.currentTree = in.nextLine();
                switch (Manager.currentTree) {
                    case "Y":
                        break;
                    case "N":
                        Manager.currentTree = "Main Menu";
                    case "R":
                        Manager.currentTree = "Students";
                    case "Q":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Entry!");
                        break;
                }
                break;
            case "Exit":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }


    public static void setInstance(Manager instance) {
        Manager.instance = instance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getMaxAttendees() {
        return maxAttendees;
    }

    public void setMaxAttendees(int maxAttendees) {
        this.maxAttendees = maxAttendees;
    }

    public int getCurrentAttendees() {
        return currentAttendees;
    }

    public void setCurrentAttendees(int currentAttendees) {
        this.currentAttendees = currentAttendees;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

}

