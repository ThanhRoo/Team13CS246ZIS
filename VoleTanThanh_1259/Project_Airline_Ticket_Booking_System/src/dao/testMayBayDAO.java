/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.MayBay;
import java.util.ArrayList;

/**
 *
 * @author Legion 5 Pro
 */
public class testMayBayDAO {
    public static void main(String[] args) {
        ArrayList<MayBay> list = new ArrayList<>();
        list = MayBayDAO.getIntance().selectAll();
        for (MayBay mayBay : list) {
            System.out.println( mayBay.toString());
        }
                
    }
}
