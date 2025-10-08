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
        int numSubjects = 0;
                
        //User Input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        
        System.out.println("Please enter the number of subjects being done: ");
        //Exception handling for nomber of subjects input
        boolean valid = false;
        do{
            try{
                numSubjects = input.nextInt();
                if(numSubjects > 0){
                    valid = true;
                } else{
                    System.out.println("Please enter a number greater than zero");
                }
                
            }catch(InputMismatchException e){
                System.out.println("Invalid Input. Enter a valid number");
                input.nextLine();
            }
        }while(!valid);
       
        //Create Student Object
        Student myStudent = new Student(name, numSubjects);
        
        int marks[] = new int[numSubjects];
        
        for (int i = 0; i < numSubjects; i++ ){
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
        
        //Display resukts
        myStudent.getDetails();       
    }
}
