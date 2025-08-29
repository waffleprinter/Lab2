/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 6298805
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public PassFailExam(int questions, int missed, double minPassing) {
        this.numQuestions = questions;
        this.pointsEach = getPointsEach();
        this.numMissed = missed;
        
        super(minPassing);
    }
    
    public double getPointsEach() {
        return 100 / numQuestions;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
    
}
