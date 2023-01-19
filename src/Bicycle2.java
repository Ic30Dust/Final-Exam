/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopexercise1;

public class Bicycle2 {
    // Data Members or Attributes
    private String ownerName;
    private int id;
    private int counter = 0; // this is a class variable
    
    //Constructor: Initializes the data member/attributes
    public Bicycle2(int id) {
        ownerName = "Unknown";
        this.id = id;
        counter++; // counter = 
    }

    public int getCounter() {
        return counter;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public void setOwnerName(String name) {
        ownerName = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
