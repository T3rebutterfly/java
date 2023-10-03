package sem2;

import javax.swing.JOptionPane;

public class Dundaj1 {
    
    public static void main(String args[])
    {
        int total;
        int gradeCounter;
        int grade;
        int average;
        
        String gradeString;
        
        total = 0;
        gradeCounter = 1;
        
        while(gradeCounter <= 10) {
            gradeString = JOptionPane.showInputDialog("Enter integer grade: ");
            grade = Integer.parseInt(gradeString);
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        average = total / 10;
        JOptionPane.showMessageDialog(null, "Class average is " + average,"Class Average", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
        
}
