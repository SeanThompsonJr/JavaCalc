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
        textfield.setEditable(false); // makes the textfield not editable
        
        //creates buttons for operations
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");
        
        //puts the operation buttons in an array
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        
        //loops through all operation buttons
        for(int i = 0; i < 8 ; i++){
            functionButtons[i].addActionListener(this); //adds an action listener to each button
            functionButtons[i].setFont(myFont); //sets the buttons fonts
            functionButtons[i].setFocusable(false); //removes highlight when hover
        }
        //loops through all number buttons
        for(int i = 0; i < 10 ; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this); //adds an action listener to each button
            numberButtons[i].setFont(myFont); //sets the buttons fonts
            numberButtons[i].setFocusable(false); //removes highlight when hover
        }
        
        //drawing them to a positition and giving them a size
        delButton.setBounds(50,430,145,50);
        clrButton.setBounds(205,430,145,50);
        
        
        // draws them to the actual window
        frame.add(delButton);
        frame.add(clrButton);
        //adds the textfield to the window
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
