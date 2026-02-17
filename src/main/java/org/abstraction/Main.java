package org.abstraction;

public class Main {
    public static void main(String[] args) {
        abstractClass cProgram = new cProgramming();
        cProgram.syntax();

        abstractClass javaP = new javaProgramming();
        javaP.syntax();
    }
}