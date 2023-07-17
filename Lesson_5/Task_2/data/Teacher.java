package Lesson_5.Task_2.data;

public class Teacher extends User {
    Integer teacherID;

    public Teacher(String name, String surname, String patronymic, Integer teacherID) {
        super(name, surname, patronymic);
        this.teacherID = teacherID;
    }

    public Teacher() {
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }
}