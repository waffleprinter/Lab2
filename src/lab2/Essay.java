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
public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    public Essay() {
        this.setScore(grammar + spelling + correctLength + content);
    }
    
    public void setScore(double grade, double spelling, double len, double content) {
        this.setScore(grade + spelling + len + content);
    }

    public double getGrammar() {
        return grammar;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Total points: " + this.getScore() +
                "\nGrade: " + this.getGrade();
    }
}
