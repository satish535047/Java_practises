import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atm {

    private JFrame mainFrame;
    private JTextField withdrawAmounField;
    private JTextField DepositAmountField;
    private JLabel balanceLabel;

    private double balance = 500;// default balance

    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.createUI();
    }

    public void createUI(){
        mainFrame = new JFrame("ATM");
        mainFrame.setSize(400,300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,1));
        JLabel welcomelable = new JLabel("Welcome to atm");
        panel.add(welcomelable);

        balanceLabel = new JLabel("balance $ "+balance);
        panel.add(balanceLabel);

        withdrawAmounField = new JTextField();
        panel.add(withdrawAmounField);

        JButton button = new JButton("withdraw");
        button.addActionListener(new ActionListener() {
            public void ActionListener(ActionEvent e){
                String amountString =withdrawAmounField.getText();
                if(amountString.isEmpty()){
                    JOptionPane.showMessageDialog(mainFrame, "please enter an amount", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try{
                    double amount = Double.parseDouble(amountString);
                        if(amount > balance){
                            JOptionPane.showMessageDialog(mainFrame, "inSufficientfunds", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;
                        }else{
                            balance -= amount;
                            balanceLabel.setText("balance $ "+balance);
                            JOptionPane.showInternalMessageDialog(mainFrame, "$"+amount+"has been deducted","Success"+JOptionPane.INFORMATION_MESSAGE, 0);
                        }
                    
                

                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(mainFrame, "invalid input","ERROR",JOptionPane.ERROR_MESSAGE);

                }

            }

        });
        panel.add(button);

        JLabel depositLabel = new JLabel("Enter an amount to deposit");
        panel.add(depositLabel);
        DepositAmountField = new JTextField();
        panel.add(DepositAmountField);

        JButton depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String AmountString = DepositAmountField.getText();
                if(AmountString.isEmpty()){
                    JOptionPane.showMessageDialog(mainFrame, "please enter an amount", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try{
                    double amount = Double.parseDouble(AmountString);
                    balance += amount;
                    balanceLabel.setText("balance: $"+balance);
                    JOptionPane.showMessageDialog(mainFrame, "$"+amount+ "has been deposited","success"+JOptionPane.INFORMATION_MESSAGE, 0);

                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(mainFrame,"error","invalid input", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        panel.add(depositButton);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }
}