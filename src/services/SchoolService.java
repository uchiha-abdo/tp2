package services;

import dao.MemoryDatabase;
import models.Subject;
import models.Teacher;

public class SchoolService {
    private Subject[] subjects = MemoryDatabase.SUBJECTS_T;
    private Teacher[] teachers = MemoryDatabase.TEACHERS_T;

    public void insertCourse(Subject subject){
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

    public void showAllCourses(){
        System.out.println("Courses:");
        for (Subject subject : subjects){
            System.out.println(subject);
        }
    }

    public Subject searchCourseByTitle(String title){
        for (Subject subject : subjects){
            if (subject.getTitle().equalsIgnoreCase(title)){
                return subject;
            }
        }
        System.err.println("Subject " + title + " not found.");
        return null;
    }
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
        for (Subject subject : subjects){
            System.out.println(subject);
        }
    }
}