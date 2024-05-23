/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10447015nosipho;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */


/**
 *
 * @author RC_Student_lab
 */
public class Login {
   final private static List<User> users = new ArrayList<>();
    
    public static void main (String[] args) {
       OUTER:
       while (true) {
           String [] options = {"Login", "Register"};
           int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Login System",
                   JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
           
           switch (choice) {
               case 0 -> login();
               case 1 -> Registration.register(users);
               default -> {
                   break OUTER;
               }
           }
       }
    }
    
    private static void login(){
        String username = JOptionPane.showInputDialog("Enter username:");
        if (username == null)return;
        
        String password = JOptionPane.showInputDialog("Enter password:");
        if (password == null)return;
        
        boolean loggedIn = false;
        for (User user : users){
            if (user.getUsername().equals(username)&& user.getPassword().equals(password)){
                JOptionPane.showMessageDialog(null,"Login successful!" + user.getFirstName() + "" + user.getLastName() + "it is nice to see you again");
                loggedIn = true;
                break;
            }
        }
        
        if (!loggedIn){
            JOptionPane.showMessageDialog(null, "Invalid username or password");
        }
    }
    }
            
    

