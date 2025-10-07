/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentgradecalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vvtat
 */
public class StudentGradeCalculator {

    public static void main(String[] args) {
        String name;
        int marks[] = new int[5];
        
        //User Input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        
        //Create Student Object
        Student myStudent = new Student(name);
        
        
        for (int i = 0; i < marks.length; i++ ){
            boolean okay = false;
            while(!okay){
                System.out.println("Enter mark for subject "+ (i + 1) + ": " + "\n ");
                try{
                    marks[i] = input.nextInt();
                    if (marks[i] >=0 && marks[i] <= 100){
                        okay = true;
                    } else{
                        System.out.println("Please enter a  number between 0 - 100");
                    }
                } catch (InputMismatchException e){
                    System.out.println("Invalid Input. Enter a valid number");
                    input.nextLine();
                }
            }
        }
        
        //set the marks of the student
        myStudent.setMarks(marks);
        
        //Display the marks entered
        System.out.println("Scores enterd are: " );
        for (int mark : marks){
            System.out.println(mark);
        }
        //myStudent.getMarks();
             
        //User Output
        System.out.println("\n Your Results " );
        System.out.println("Student: " + myStudent.getName());
        System.out.println("Average score: " + myStudent.getAverage());
        System.out.println("Grade: " + myStudent.getGrade());
    }
}
