/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 6298805
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;
    
    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }
    
    @Override
    public char getGrade() {
        if (this.getScore() >= 60) {
            return 'P';
        } else {
            return 'F';
        }
    }
}
