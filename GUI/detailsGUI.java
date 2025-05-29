
import javax.swing.JOptionPane;

public class detailsGUI {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("enter your name : ");
        String gender = JOptionPane.showInputDialog("enter your gender (enter Male for male and Female for female) : ");
        // for (int i = 0; i < gender.length(); i++) {
        //     if (gender.charAt(i) == ',' || gender.charAt(i) == '.' || gender.charAt(i) == '/' || gender.charAt(i) == ';'
        //             || gender.charAt(i) == '[' || gender.charAt(i) == ']') {
        //         JOptionPane.showMessageDialog(null, "the name contains invalid characters !! ");
        //         return;
        //     }
        //     JOptionPane.showMessageDialog(null, " CHECKING UNDER PROCESS........ ");
        // }
        if (gender.equalsIgnoreCase("Male")) {
            int age = Integer.parseInt(JOptionPane.showInputDialog(" please enter your age Mr " + name));
            if (age > 105) {
                JOptionPane.showMessageDialog(null, "Sorry Mr " + name + " but your age is invalid .. ");
                return;
            }
            if (age < 18) {
                JOptionPane.showMessageDialog(null, "Sorry Mrs " + name + " but you are under age..");
                return;
            }
            JOptionPane.showMessageDialog(null, " hellow Mr " + name + " welcome to this test project by parth dhoot ..(login Successfull) ");
        } else if (gender.equalsIgnoreCase("Female")) {
            int age = Integer.parseInt(JOptionPane.showInputDialog(" please enter your age Mrs " + name));
            if (age > 105) {
                JOptionPane.showMessageDialog(null, "Sorry Mrs " + name + " but your age is invalid .. ");
                return;
            }
            if (age < 18) {
                JOptionPane.showMessageDialog(null, "Sorry Mrs " + name + " but you are under age..");
                return;
            }
            JOptionPane.showMessageDialog(null, " hellow Mrs" + name + " welcome to this test project by parth dhoot ..(login Successfull) ");
        } else {
            JOptionPane.showMessageDialog(null, "gender entered is in valid ...");
        }
    }
}
