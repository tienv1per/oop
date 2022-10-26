import javax.swing.JOptionPane;

public class CalculateTwoNumbers{
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
                                                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
                                            "Please input the second number: ",
                                            "Input the second number",
                                            JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // String strNotification = "Answer is ";
        JOptionPane.showMessageDialog(null, "Sum: " + Double.toString(num1+num2) + "\n" + 
                                            "Difference: " + Double.toString(num1-num2) + "\n" +
                                            "Product: " + Double.toString(num1*num2) + "\n" + 
                                            "Quotient: " + Double.toString(num1/num2), "Print Answer", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);                                    
    }
}
