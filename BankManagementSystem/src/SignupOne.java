//JDBC Connectivity

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.*;

public  class SignupOne extends JFrame implements ActionListener{

    long random;
    JTextField nameTextField, fnameTextField, mnameTextField, EmailTextField, AddressTextField, CityTextField, StateTextField, PincodeTextField;
    JButton next;
    JRadioButton male, female, Others, Married, Single;
    JDateChooser DateChooser;
    SignupOne() {

        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel Form = new JLabel("APPLICATION FORM NO. " + random);
        Form.setFont(new Font("Raleway", Font.BOLD, 38));
        Form.setBounds(140, 20, 600, 40);
        add(Form);

        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel F_name = new JLabel("F_name:");
        F_name.setFont(new Font("Raleway", Font.BOLD, 20));
        F_name.setBounds(100, 190, 100, 30);
        add(F_name);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel M_name = new JLabel("M_name:");
        M_name.setFont(new Font("Raleway", Font.BOLD, 20));
        M_name.setBounds(100, 240, 100, 30);
        add(M_name);

        mnameTextField = new JTextField();
        mnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        mnameTextField.setBounds(300, 240, 400, 30);
        add(mnameTextField);

        JLabel DOB = new JLabel("DOB:");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 290, 100, 30);
        add(DOB);

        DateChooser = new JDateChooser();
        DateChooser.setForeground(new Color(105, 105, 105));
        DateChooser.setBounds(300, 290, 400, 30);
        add(DateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 340, 100, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 340, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 340, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel Email = new JLabel("Email:");
        Email.setFont(new Font("Raleway", Font.BOLD, 20));
        Email.setBounds(100, 390, 100, 30);
        add(Email);

        EmailTextField = new JTextField();
        EmailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        EmailTextField.setBounds(300, 390, 400, 30);
        add(EmailTextField);

        JLabel mStat = new JLabel("Marital Status:");
        mStat.setFont(new Font("Raleway", Font.BOLD, 20));
        mStat.setBounds(100, 440, 140, 30);
        add(mStat);

        Married = new JRadioButton("Married");
        Married.setBounds(300, 440, 120, 30);
        Married.setBackground(Color.WHITE);
        add(Married);

        Single = new JRadioButton("Single");
        Single.setBounds(450, 440, 120, 30);
        Single.setBackground(Color.WHITE);
        add(Single);

        Others = new JRadioButton("Others");
        Others.setBounds(600, 440, 120, 30);
        Others.setBackground(Color.WHITE);
        add(Others);

        ButtonGroup MaritalGroup = new ButtonGroup();
        MaritalGroup.add(Married);
        MaritalGroup.add(Single);
        MaritalGroup.add(Others);

        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Raleway", Font.BOLD, 20));
        Address.setBounds(100, 490, 140, 30);
        add(Address);

        AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        AddressTextField.setBounds(300, 490, 400, 30);
        add(AddressTextField);


        JLabel City = new JLabel("City:");
        City.setFont(new Font("Raleway", Font.BOLD, 20));
        City.setBounds(100, 540, 140, 30);
        add(City);

        CityTextField = new JTextField();
        CityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        CityTextField.setBounds(300, 540, 400, 30);
        add(CityTextField);

        JLabel State = new JLabel("State:");
        State.setFont(new Font("Raleway", Font.BOLD, 20));
        State.setBounds(100, 590, 140, 30);
        add(State);

        StateTextField = new JTextField();
        StateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        StateTextField.setBounds(300, 590, 400, 30);
        add(StateTextField);

        JLabel pin = new JLabel("Pincode:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 640, 140, 30);
        add(pin);

        PincodeTextField = new JTextField();
        PincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        PincodeTextField.setBounds(300, 640, 400, 30);
        add(PincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        String Form = "" + random; //long
        String name = nameTextField.getText();
        String F_name = fnameTextField.getText();
        String M_name = mnameTextField.getText();
        String DOB = ((JTextField) DateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String email = EmailTextField.getText();
        String mStat = null;
        if(Married.isSelected()){
            mStat = "Married";
        } else if (Single.isSelected()) {
            mStat = "Single";
        }else if (Others.isSelected()) {
            mStat = "Others";
        }
        String Address = AddressTextField.getText();
        String State = StateTextField.getText();
        String City = CityTextField.getText();
        String pin = PincodeTextField.getText();

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('"+ Form + "', '"+name+"', '"+F_name+"', '"+M_name+"', '"+DOB+"', '"+gender+"', '"+mStat+"', '"+email+"', '"+Address+"', '"+State+"', '"+City+"', '"+pin+"', '";
                c.s.executeUpdate(query);
            }
        }catch (Exception ae){
            System.out.println(ae);
        }

    }
    public static void main(String[] args){
        new SignupOne();
    }
}