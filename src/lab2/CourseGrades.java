/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Jacques-Conrad
 * https://github.com/waffleprinter/Lab2
 */
public class CourseGrades implements Analyzable {
    private GradedActivity[] grades = new GradedActivity[4];
    private final int NUM_GRADES = 4;
    
    public CourseGrades() {
        
    }
    
    public void setLab(GradedActivity lab) {
        grades[0] = lab;
    }
    
    public void setPassFailExam(PassFailExam passFailExam) {
        grades[1] = passFailExam;
    }
    
    public void setEssay(Essay essay) {
        grades[2] = essay;
    }
    
    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }
    
    public String toString() {
        return "Lab score " + grades[0].getScore() + " Grade: " + grades[0].getGrade() +
                "\nPass/fail exam score: " + grades[1].getScore() + " Grade: " + grades[1].getGrade() + 
                "\nEssay score " + grades[2].getScore() + " Grade: " + grades[2].getGrade() +
                "\nFinal exam score " + grades[3].getScore() + " Grade: " + grades[3].getGrade() +
                "\nAverage score " + getAverage() +
                "\nHighest score " + getHighest() +
                "\nLowest score " + getLowest();


    }

    @Override
    public double getAverage() {
        double sum = 0;
        
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i].getScore();
        }
        
        return sum / 4;
    }

    @Override
    public double getHighest() {
        double highest = 0;
        
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getScore() > highest) {
                highest = grades[i].getScore();
            }
        }
        
        return highest;
    }

    @Override
    public double getLowest() {
        double lowest = 100;
        
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getScore() < lowest) {
                lowest = grades[i].getScore();
            }
        }
        
        return lowest;
    }
    
    
}
