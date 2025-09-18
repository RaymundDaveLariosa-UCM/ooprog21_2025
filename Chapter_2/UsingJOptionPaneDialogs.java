import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");

        int option = JOptionPane.showConfirmDialog(null, "Do you want to show your name?", "Confirm", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Your name is: " + name);
        }
          else {
            main(null); 
        }
    }
}
