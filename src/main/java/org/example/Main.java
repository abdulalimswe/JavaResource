package org.example;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Alim";
        s1.age = 23;

        System.out.println("Name: " + s1.name);
        System.out.println("id: " + s1.id);
    }
}