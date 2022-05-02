package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setLastName("Ivanov");
        student.setPatron("Ivanovich");
        student.setGroup("RTM");
        student.setEnterToCollege(new Date());

        System.out.println(student.getName() + " " + student.getLastName() + " " + student.getPatron()
        + " группа " + student.getGroup() + " дата поступления " + student.getEnterToCollege());
    }
}
