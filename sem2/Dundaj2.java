package sem2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Dundaj2 {
       
    public static void main(String args[])
    {
        int total;
        int gradeCounter;
        int grade;
        
        double average;
        String gradeString;
        
        total = 0;
        gradeCounter = 0;
        
        gradeString = JOptionPane.showInputDialog("Enter Integer Grade or - 1 to Quit:");
        
        grade = Integer.parseInt(gradeString);
        
        while(grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            
            gradeString = JOptionPane.showInputDialog("Enter Integer Grade or -1 to Quit: ");
            
            grade = Integer.parseInt(gradeString);
        }
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        
        if(gradeCounter != 0){
            average = (double) total / gradeCounter;
            JOptionPane.showMessageDialog(null, "Class average is " + twoDigits.format(average),"Class Average", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog( null, "No grades were entered", "Class Average", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
