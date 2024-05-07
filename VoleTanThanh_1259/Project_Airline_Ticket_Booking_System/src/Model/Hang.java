/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Legion 5 Pro
 */
public class Hang {
    private String  maHangBay;
    private String tenHangBay;
    

    public Hang() {
    }
    public Hang(String maHangBay) {
        this.maHangBay = maHangBay;   
    }
    public Hang(String maHangBay, String tenHangBay) {
        this.maHangBay = maHangBay;
        this.tenHangBay = tenHangBay;
    }

    public String getMaHangBay() {
        return maHangBay;
    }

    public void setMaHangBay(String maHangBay) {
        this.maHangBay = maHangBay;
    }

    public String getTenHangBay() {
        return tenHangBay;
    }

    public void setTenHangBay(String tenHangBay) {
        this.tenHangBay = tenHangBay;
    }
    
}
