import javax.swing.JOptionPane;
public class Stars {
    int rows;
    int columns;

    // constructor to input number of rows and columns through dialog boxes
    Stars() {
        rows = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows:"));
        columns = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns:"));
    }
}

