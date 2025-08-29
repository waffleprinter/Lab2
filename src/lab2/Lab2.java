/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

/**
 *
 * @author 6298805
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FinalExam finalExam = new FinalExam(100, 25);
        
        System.out.println("How many questions are on the final exam? 100");
        System.out.println("How many questions are on the final exam? 25");
        System.out.printf("Each question counts %.1f points%n", finalExam.getPointsEach());
        System.out.printf("The exam score is %.1f%n", finalExam.getScore());
        System.out.printf("The exam grade is %s%n", finalExam.getGrade());
    }
    
}
