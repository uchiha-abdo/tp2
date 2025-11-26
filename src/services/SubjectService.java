package services;

import dao.MemoryDatabase;
import models.Subject;

public class SubjectService {
    private Subject[] subjects = MemoryDatabase.SUBJECTS_T;

    public void insertCourse(Subject subject){
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null){
                subjects[i] = subject;
                System.out.println("Course inserted successfully.");
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
}