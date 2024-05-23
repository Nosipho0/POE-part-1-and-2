/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10447015nosipho;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RC_Student_lab
 */
    public class User {
         public static void main (String[] args) {
             
         }
    private String firstName;
    private String lastName;
    final private String username;
    final private String password;
    final private List<Task> tasks;
    
    public User( String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.firstName = lastName;
        this.username = username;
        this.password = password;
        this.tasks = new ArrayList<>();
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getUsername(){
        return username;
    }
            
    public String getPassword(){
        return password;
    }

     public List<Task> getTasks(){
        return tasks;
    }
    
    public void addTasks(Task task){
        this.tasks.add(task);
    }
    }

    

