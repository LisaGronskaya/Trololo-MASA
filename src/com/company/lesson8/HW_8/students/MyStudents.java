package com.company.lesson8.HW_8.students;

import java.util.ArrayList;

public class MyStudents {
    public static void main(String[] args) {
        Student st1 = new Student("Bob", "qwe@qwe.com", 1995, "Math", true);
        Student st2 = new Student("Klara", "asd@asd.com", 1994, "Math", false);

        ArrayList<Person> arrayList = new ArrayList();
        arrayList.add(st1);
        arrayList.add(st2);

        arrayList.forEach((x) -> x.printInfo());


    }
}