/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Hang;
import java.util.ArrayList;

/**
 *
 * @author Legion 5 Pro
 */
public class testHangDAO {
    public static void main(String[] args) {
        Hang hang = new Hang("5");
       // HangDAO.getIntance().delete(hang);
        
        ArrayList<Hang> find = HangDAO.getIntance().selectAll();
        for (Hang hang1 : find) {
            System.out.println(hang1.toString());
        }
       
    }
}
