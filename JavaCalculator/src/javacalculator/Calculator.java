/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * 
 */

//interface -whatever that means
public class Calculator implements ActionListener{
    
    // all of this is from the jframe library
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;
    
    //font object
    Font myFont = new Font("Ink Free", Font.BOLD,30);
    //variables
    double num1 = 0,num2=0,result=0;
    char operator;
    
    //class constructor
    Calculator() {
        // re;ates to the frame/ window
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        
        textfield = new JTextField();
        textfield.setBounds(50,25,300,50);
        textfield.setFont(myFont);
        
        
        frame.add(textfield);
        //makes the whole window visible
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        //new object from the constructor
        Calculator calc = new Calculator();
        
        
    }
    //comes with ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
