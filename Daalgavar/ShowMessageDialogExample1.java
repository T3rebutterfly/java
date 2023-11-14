/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daalgavar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowMessageDialogExample1 {
    public static void main(String[] args)
    {
        String backupDir = "/Users/al/backups";
        
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        
        JOptionPane.showMessageDialog(frame,
            "Problem writing to backup directory: " + backupDir + ".",
            "Backup problem",
            JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
