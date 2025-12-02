package services;

import dao.MemoryDatabase;
import models.Parent;
import models.Student;
import models.Subject;
import models.Teacher;

public class SchoolService {
    private Subject[] subjects = MemoryDatabase.SUBJECTS_T; //RAM
    private Teacher[] teachers = MemoryDatabase.TEACHERS_T;
    private Parent[] parents = MemoryDatabase.PARENTS_T;
    private Student[] students = MemoryDatabase.STUDENTS_T;
    //public static boolean error = false;

    public void insertSubject(Subject subject){
        for(Subject s: subjects){
            if (s != null && s.getTitle().toLowerCase().equals(subject.getTitle().toLowerCase())){
                System.err.println("Subject " + subject.getTitle() + " already exists.");
                return;
            }
        }
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null){
                subjects[i] = subject;
                System.out.println("Subject " + subject.getTitle() + " inserted successfully.");
                return;
            }
        }
        System.err.println("Storage not enough.");
    }

    public void showAllSubjects(){
        System.out.println("Courses:");
        for (Subject subject : subjects){
            if (subject != null){
                System.out.println(subject);
            }
        }
    }

    public Subject searchCourseByTitle(String title){
        for (Subject subject : subjects){
            if (subject != null && subject.getTitle().equalsIgnoreCase(title)){
                return subject;
            }
        }
        System.err.println("Subject " + title + " not found.");
        return null;
    }

    /**
     * Teacher's CRUD
     */
    public void insertTeacher(Teacher teacher){
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null){
                teachers[i] = teacher;
                System.out.println("Teacher inserted successfully.");
                return;
            }
        }
        System.err.println("Storage not enough.");
    }
    public void showAllTeachers(){
        System.out.println("Teachers:");
        for (Teacher teacher : teachers){
            if (teacher != null){
                System.out.println(teacher);
            }
        }
    }
    public Teacher searchTeacherByName(String firstName, String lastName) {
        for (Teacher teacher : teachers) {
            if (teacher != null &&
                teacher.getFirstName().equalsIgnoreCase(firstName) &&
                teacher.getLastName().equalsIgnoreCase(lastName)) {

                return teacher;
            }
        }
        System.err.println("Teacher " + firstName + " " + lastName + " not found.");
        return null;
    }

    /**
     * Parents CRUD
     */
    public void insertParent(Parent parent) {
        for (int i = 0; i < parents.length; i++) {
            if (parents[i] == null){
                parents[i] = parent;
                System.out.println("Parent inserted successfully.");
                return;
            }
        }
        System.err.println("Storage not enough.");
    }

    public void showAllParents(){
        System.out.println("Parents:");
        for (Parent parent : parents){
        	if (parent != null){
        		System.out.println("\t" + parent);
            }
        }
    }
    public Parent searchParentByName(String firstName) {
        for (Parent parent : parents) {
            if (parent != null &&
                parent.getFirstName().equalsIgnoreCase(firstName)) {

                return parent;
            }
        }
        System.err.println("P " + firstName + " not found.");
        return null;
    }
    /**
     * Students's CRUD
     */
    public void insertStudent(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
                System.out.println("Student inserted successfully.");
                return;
            }
        }
        System.err.println("Storage not enough.");
    }
    public void showAllStudents(){
        System.out.println("Students:");
        for (Student student : students){
        	if (student != null){
        		System.out.println("\t" + student);
            }
        }
    }
    public Student searchStudentByName(String firstName) {
        for (Student student : students) {
            if (student != null &&
                student.getFirstName().equalsIgnoreCase(firstName)) {

                return student;
            }
        }
        System.err.println("Student " + firstName + " not found.");
        return null;
    }

}