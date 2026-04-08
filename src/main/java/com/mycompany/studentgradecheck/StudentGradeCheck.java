/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentgradecheck;

/**
 *
 * @author mdewlok
 */
import java.util.Scanner;
public class StudentGradeCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for exam score
        System.out.print("Enter your exam score: ");
        int score = input.nextInt();

        // Determine grade using if-else
        if (score >= 75 && score <= 100) {
            System.out.println("Grade: Distinction");
        } 
        else if (score >= 50 && score <= 74) {
            System.out.println("Grade: Passed");
        } 
        else if (score >= 40 && score <= 49) {
            System.out.println("Grade: Supplementary");
        } 
        else if (score >= 0 && score <= 39) {
            System.out.println("Grade: Failed");
        } 
        else {
            System.out.println("Invalid score entered.");
        }

        input.close();
    }
}
