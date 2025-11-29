package statics;

import enums.Gender;
import models.Parent;
import models.Student;
import models.Subject;
import models.Teacher;
import services.SchoolService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SchoolService schoolService = new SchoolService();
        Parent parent ;
        Student student;
        Teacher teacher;
        Subject subject;
        int command = 0;
        while (command != 9) {
            System.out.println("SCHOOL MANAGER SYSTEM");
            System.out.println("1- Afficher tout les professeurs");
            System.out.println("2- Afficher tout les matieres");
            System.out.println("3- Afficher tout les parents");
            System.out.println("4- Afficher tout les etudiants");
            System.out.println("5- Inserer un professeur");
            System.out.println("6- Inserer une matiere");
            System.out.println("7- Inserer un parent");
            System.out.println("8- Inserer un/une etudiant(e)");
            System.out.println("9- Sortir");
            System.out.print("Tapez une commande : ");
            command = input.nextInt();

            switch (command) {
                case 1:
                    schoolService.showAllTeachers();
                    break;
                case 2:
                    schoolService.showAllSubjects();
                    break;
                case 3:
                    schoolService.showAllParents();
                    break;
                case 4:
                    schoolService.showAllStudents();
                    break;
                case 6:
                    subject = new Subject();
                    System.out.print("\tEntrer le nom de la matiere : ");
                    subject.setTitle(input.next());
                    System.out.print("\tEntrer la coefficiant de la matiere : ");
                    subject.setCoefficient(input.nextInt());
                    schoolService.insertSubject(subject);
                    break;
                case 5:
                    teacher = new Teacher();
                    System.out.print("\t Entrer le firstName : ");
                    teacher.setFirstName(input.next());
                    System.out.print("\t Entrer le lastName : ");
                    teacher.setLastName(input.next());
                    System.out.print("\t Entrer l'email : ");
                    teacher.setEmail(input.next());
                    System.out.print("\t Entrer le telephone : ");
                    teacher.setPhone(input.next());
                    while (true){
                        System.out.print("\t Entrer le sexe : ");
                        String gender = input.next();
                        if (gender.equals("M")) {
                            teacher.setGender(Gender.Male);
                            break;
                        }
                        else if (gender.equals("F")) {
                            teacher.setGender(Gender.Female);
                            break;
                        }
                        else{
                            System.err.println("Invalid gender");
                        }
                    }
                    System.out.print("\t Entrer la matiere : ");

                    teacher.setSubjects(new Subject[] {schoolService.searchCourseByTitle(input.next())});
                    schoolService.insertTeacher(teacher);
                    break;
                case 8:
                	schoolService.showAllStudents();
                	student = new Student();
                    System.out.print("\t Entrer le FirstName : ");
                    student.setFirstName(input.next());
                    
                    System.out.print("\t Entrer le LastName : ");
                    student.setLastName(input.next());
                    
                    System.out.print("\t Entrer telephone  : ");
                    student.setPhone(input.next());
                    
                    while (true){
                        System.out.print("\t Entrer le sexe : ");
                        String gender = input.next();
                        if (gender.equals("M")) {
                            student.setGender(Gender.Male);
                            break;
                        }
                        else if (gender.equals("F")) {
                            student.setGender(Gender.Female);
                            break;
                        }
                        else{
                            System.err.println("Invalid gender");
                        }
                    }
                    System.out.print("\t Entrer la nom et prenom de parent parent : ");
                    break;
                case 7:
                    schoolService.showAllParents();
                    parent = new Parent();
                    System.out.print("\t Entrer le FirstName : ");
                    parent.setFirstName(input.next());
                    
                    System.out.print("\t Entrer le LastName : ");
                    parent.setLastName(input.next());
                    
                    System.out.print("\t Entrer telephone  : ");
                    parent.setPhone(input.next());
                    
                    while (true){
                        System.out.print("\t Entrer le sexe : ");
                        String gender = input.next();
                        if (gender.equals("M")) {
                            parent.setGender(Gender.Male);
                            break;
                        }
                        else if (gender.equals("F")) {
                            parent.setGender(Gender.Female);
                            break;
                        }
                        else{
                            System.err.println("Invalid gender");
                        }
                    }
                    System.out.print("\t Entrer la nom et prenom de parent parent : ");
                    break;
                case 9:
                    break;
                default:
                    System.err.println("Invalid command");
            }
        }
        System.out.println("Merci pour votre visite");
    }
}