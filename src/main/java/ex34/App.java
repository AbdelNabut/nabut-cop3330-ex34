/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex34;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static String[] removeEmployee(String employeeName, String[] employees) {
        String[] newSetOfEmployees = new String[employees.length-1];
        int newArrayCurrentIndex = 0;
        for(int i = 0; i < Array.getLength(employees); i++) {
            if(!(employees[i].toLowerCase(Locale.ROOT).equals(employeeName)))
                newSetOfEmployees[newArrayCurrentIndex++] = employees[i];
        }
        System.out.println( "There are now " + Array.getLength(newSetOfEmployees) + " employees:");
        return newSetOfEmployees;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String[] employees = {"Kim", "Anthony", "Rebecca", "Michelle", "Jim"};
        String employeeToRemove;
        System.out.println( "There are " + Array.getLength(employees) + " employees:");
        for(int i = 0; i < Array.getLength(employees); i++)
            System.out.println(employees[i]);
        System.out.print("Enter an employee name to remove them: ");
        employeeToRemove = input.next().toLowerCase(Locale.ROOT);
        employees = removeEmployee(employeeToRemove, employees);
        for(int i = 0; i < Array.getLength(employees); i++)
            System.out.println(employees[i]);

    }
}
