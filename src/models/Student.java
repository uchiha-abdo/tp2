package models;

import enums.Gender;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private Gender gender;
    private Parent parent;
    private static int STUDENT_COUNTER;

    public Student() {
        this.id = ++STUDENT_COUNTER;
    }

    public Student(String firstName, String lastName, String phone, Gender gender, Parent parent) {
        this.id = ++STUDENT_COUNTER;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.gender = gender;
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public static int getStudentCounter() {
        return STUDENT_COUNTER;
    }

    public static void setStudentCounter(int studentCounter) {
        STUDENT_COUNTER = studentCounter;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", parent=" + parent +
                '}';
    }
}