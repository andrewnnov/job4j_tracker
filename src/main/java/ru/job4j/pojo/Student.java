package ru.job4j.pojo;

import java.util.Date;

public class Student {

    private String name;
    private String lastName;
    private String patron;
    private String group;
    private Date enterToCollege;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getEnterToCollege() {
        return enterToCollege;
    }

    public void setEnterToCollege(Date enterToCollege) {
        this.enterToCollege = enterToCollege;
    }
}
