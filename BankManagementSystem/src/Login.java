import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, clear;
    JTextField cardTextField, pinTextField;

    Login(){

        setTitle("AUTOMATIC TELLER MACHINE");

        setLayout(null);

        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200, 40, 400, 40);
        text.setFont(new Font("Osward", Font.BOLD, 38));
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setBounds(120, 150, 200, 40);
        cardno.setFont(new Font("Osward", Font.BOLD, 30));
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 155, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);


        JLabel pin = new JLabel("PIN:");
        pin.setBounds(120, 220, 150, 40);
        pin.setFont(new Font("Osward", Font.BOLD, 30));
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 225, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds( 300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds( 430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds( 300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);


        getContentPane().setBackground(Color.WHITE);

        setSize(1000, 500);
        setVisible(true);
        setLocation(350, 200);
    }

    //@Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login) {

        } else if (ae.getSource() == login) {

        }

        }

    public static void main(String[] args) {

        new Login();
    }


}