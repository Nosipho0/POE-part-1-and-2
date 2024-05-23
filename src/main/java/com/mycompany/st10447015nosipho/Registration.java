/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10447015nosipho;

import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */

/**
 *
 * @author RC_Student_lab
 */
public class Registration {

    public static void register(List<User> users){

        String firstName = JOptionPane.showInputDialog("Enter your firstname:");
        if (firstName == null) return;
        
        String lastName = JOptionPane.showInputDialog("Enter your lastname:");
        if (lastName == null) return;
        
        String username = JOptionPane.showInputDialog("Enter your username");
        if (username == null)return;
        
        if (!username. contains("_") || username.length() > 5){
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore is no more than 5 characters in length.");
        }
        
        String password = JOptionPane.showInputDialog("Enter a password");
        if (password == null)return;
            
        if (!isValidPassword(password)){
            JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
            
        }
        
        String confirmPassword = JOptionPane.showInputDialog("Confirm your password");
        if (confirmPassword == null) return;
        
        if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(null, "Passwords do not match. Try again");
        }
        
        users.add(new User(firstName, lastName, username, password));
        JOptionPane.showMessageDialog(null, "Registration successful!welcome" + firstName + "" + lastName + "it's great to see you again");
    }
    
    private static boolean isValidPassword(String password){
        if (password.length() < 8) return false;
        if (!Pattern.compile("[A-Z]").matcher(password).find())return false;
        if (!Pattern.compile("[0-9]").matcher(password).find())return false;
        return Pattern.compile("[^a-zA-Z0-9]").matcher(password).find();
    }
}

    

