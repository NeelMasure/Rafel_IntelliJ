package day2;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Condition2<marks> {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = scn.nextInt();

        if (marks < 35) {
            System.out.println("Fail");
        } else if (marks >= 35 && marks < 45) {
            System.out.println("Pass Class");
        } else if (marks >= 45 && marks < 55) {
            System.out.println("Second Class");
        } else if (marks>= 55 && marks <75) {
            System.out.println("First Class");
        }