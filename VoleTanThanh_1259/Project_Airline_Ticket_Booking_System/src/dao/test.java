/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Model.Hang;
import Model.MayBay;
import Model.SanBay;
import java.util.ArrayList;
/**
 *
 * @author Legion 5 Pro
 */
public class test {
    public static void main(String[] args) {
    
    ArrayList<MayBay> list = new ArrayList<>();
    
    list = MayBayDAO.getIntance().selectAll();
        for (MayBay mayBay : list) {
            System.out.println(mayBay.getMaMayBay());
            System.out.println(mayBay.getLoaiMayBay());
            System.out.println(mayBay.getSoGhe());
            System.out.println(mayBay.getHangMayBay().getTenHangBay());
        }
       
    }
}
