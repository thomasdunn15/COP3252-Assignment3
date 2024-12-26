import javax.swing.JOptionPane;
public class Knight {
    String name;
    int health;
    int age;
    int gold;
    int battles;

    // constructor to input attributes through dialog boxes
    Knight() {
        name = JOptionPane.showInputDialog("Enter the knight's name:");
        health = Integer.parseInt(JOptionPane.showInputDialog("Enter the knight's health:"));
        battles = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of battles the knight has fought:"));
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter the knight's age:"));
        gold = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of gold the knight has procured from pillaging:"));
    }
}