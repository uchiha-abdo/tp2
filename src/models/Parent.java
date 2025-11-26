package models;

import enums.Gender;

import java.util.Arrays;

public class Parent {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private Gender gender;
    private Student[]  students;

    private static int PARENT_COUNTER;
    public Parent() {
        this.id = ++PARENT_COUNTER;
    }
    public Parent(String firstName, String lastName, String phone, Gender gender, Student[] students) {
        this.id = ++PARENT_COUNTER;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.gender = gender;
        this.students = students;
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

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public static int getParentCounter() {
        return PARENT_COUNTER;
    }

    public static void setParentCounter(int parentCounter) {
        PARENT_COUNTER = parentCounter;
    }

    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}