/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dell
 */
public class ButtonsActions implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "C" -> {
                System.out.println("Create Invoice");
                }
            case "D"->{
                System.out.println("Delete Invoice");
            }
            case "SE"->{
                System.out.println("Save Edited Invoice");
            }
            case "CE"->{
                System.out.println("Cancel Edit");
            }
        }
    }
    
}