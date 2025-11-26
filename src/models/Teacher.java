package models;

import enums.Gender;

import java.util.Arrays;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Gender gender;
    private Subject[] subjects;
    private static int TEACHER_COUNTER;

    public Teacher() {
        this.id = ++TEACHER_COUNTER;
    }

    public Teacher(String firstName, String lastName, String email, String phone, Gender gender, Subject[] subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.subjects = subjects;
        this.id = ++TEACHER_COUNTER;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}