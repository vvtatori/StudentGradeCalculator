/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentgradecalculator;

/**
 *
 * @author vvtat
 */
public class Student {
    private int marks[];
    private double average;
    private String name;
    private char grade;

    public Student(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
        CalcAverage();
        assignGrade();
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void CalcAverage(){
        int totalScore = 0;
        for(int mark : marks){
            totalScore += mark;
        }
        this.average = (double)totalScore/(marks.length);
    }
    
    public void assignGrade(){
        if(average >= 80){
            grade = 'A';
        } else if(average >= 70){
            grade = 'B';
        } else if(average >= 60){
            grade = 'C';
        } else if(average >= 50){
            grade = 'D';
        } else{
            grade = 'F';
        }
    }

    public double getAverage() {
        return average;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }
    
    
}
