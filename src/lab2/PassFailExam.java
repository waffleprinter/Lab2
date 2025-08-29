/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Jacques-Conrad
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);
        
        this.numQuestions = questions;
        this.pointsEach = getPointsEach();
        this.numMissed = missed;
        
        this.setScore((numQuestions - numMissed) * pointsEach);
    }
    
    public double getPointsEach() {
        return 100 / numQuestions;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
    
    @Override
    public String toString() {
        return "Each question counts " + getPointsEach() + " points" +
                "\nThe exam score is " + getScore() + 
                "\nThe exam grade is " + getGrade();
    }
}
