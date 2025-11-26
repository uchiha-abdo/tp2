package models;

public class Subject {
    private int id;
    private String title;
    private int coefficient;
    private static int SUBJECT_COUNTER;
    public Subject() {
        this.id = ++SUBJECT_COUNTER;
    }
    public Subject(String title, int coefficient) {
        this.id = ++SUBJECT_COUNTER;
        this.title = title;
        this.coefficient = coefficient;
    }

    public int getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getCoefficient() {
        return this.coefficient;
    }
    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", coefficient=" + coefficient +
                '}';
    }
}