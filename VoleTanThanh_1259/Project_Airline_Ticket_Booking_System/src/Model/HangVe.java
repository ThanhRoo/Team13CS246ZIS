/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Legion 5 Pro
 */
public class HangVe {
    private String  maHangVe;
    private String tenHangVe;

    public HangVe() {
    }
     public HangVe(String maHangVe) {
        this.maHangVe = maHangVe;
    }
    public HangVe(String maHangVe, String tenHangVe) {
        this.maHangVe = maHangVe;
        this.tenHangVe = tenHangVe;
    }
   
    public String getMaHangVe() {
        return maHangVe;
    }

    public void setMaHangVe(String maHangVe) {
        this.maHangVe = maHangVe;
    }

    public String getTenHangVe() {
        return tenHangVe;
    }

    public void setTenHangVe(String tenHangVe) {
        this.tenHangVe = tenHangVe;
    }

    @Override
    public String toString() {
        return "HangVe{" + "maHangVe=" + maHangVe + ", tenHangVe=" + tenHangVe + '}';
    }
    
    
}
