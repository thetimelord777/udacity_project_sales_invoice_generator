/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dell
 */
public class InvoiceLine {
    private int invoiceNum;
    private String itemName;
    private double itemPrice;
    private int itemCount;
    
    public InvoiceLine(){
        
    }
    
    public InvoiceLine(int i,String n,double p,int c){
        setInvoiceNum(i);
        setItemName(n);
        setItemPrice(p);
        setItemCount(c);
    }
    
    public int getInvoiceNum(){
        return invoiceNum;
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public double getItemPrice(){
        return itemPrice;
    }
    
    public int getItemCount(){
        return itemCount;
    }
    
    public void setInvoiceNum(int i){
        invoiceNum = i;
    }
    
    public void setItemName(String n){
        itemName = n;
    }
    
    public void setItemPrice(double p){
        itemPrice = p;
    }
    
    public void setItemCount(int c){
        itemCount = c;
    }
    
    public String[] getTableFormat(){
        String[] data = new String[FileOperations.getInvoicesItemsTableHeaders().length];
        data[0] = String.valueOf(getInvoiceNum());
        data[1] = getItemName();
        data[2] = String.valueOf(getItemPrice());
        data[3] = String.valueOf(getItemCount());
        data[4] = String.valueOf((Double)getItemPrice()*getItemCount());
        return data;
    }
}
