
package statics;

import dao.MemoryDatabase;
import enums.Gender;
import models.Subject;
import models.Teacher;
import services.SchoolService;
import services.SubjectService;
import statics.SubjectsData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService();
        for (int i = 0; i < SubjectsData.SUBJCETS.length; i++) {
            schoolService.insertCourse(SubjectsData.SUBJCETS[i]);
        }
        Subject java = schoolService.searchCourseByTitle("Java");
        Subject oracle =  schoolService.searchCourseByTitle("Oracle");
        Teacher uchiha = new Teacher();
        uchiha.setGender(Gender.Male);
        uchiha.setEmail("uchihaabdo@gmail.com");
        uchiha.setPhone("0656565656");
        uchiha.setFirstName("uchiha");
        uchiha.setLastName("abdo");
        uchiha.setSubjects(new Subject[]{java, oracle});

        System.out.println(uchiha);

        schoolService.insertTeacher(uchiha);


    }
}
