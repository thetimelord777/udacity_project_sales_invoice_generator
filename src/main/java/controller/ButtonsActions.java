/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import model.FileOperations;
import view.MainFrame;

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
                int index = MainFrame.viewInvoicesTable.getSelectedRow();
                FileOperations.deleteInvoiceByTableIndex(index);
                System.out.println("Delete Invoice");
            }
            case "SE"->{
                String[] data = MainFrame.getTextFieldsValues();
                FileOperations.updateInvoice(data);
                System.out.println("Save Edited Invoice: ");
            }
            case "CE"->{
                String[] data = FileOperations.getInvoiceData(Integer.parseInt(MainFrame.getTextFieldsValues()[0]));
                MainFrame.updateTextFields(data);
                System.out.println("Cancel Edit");
            }
        }
    }
    
}
