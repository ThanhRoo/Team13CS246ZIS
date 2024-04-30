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
    private Hang hang;

    public HangVe() {
    }
    public HangVe(String maHangVe) {
        this.maHangVe = maHangVe;
    }
    public HangVe(String maHangVe, String tenHangVe, Hang hang) {
        this.maHangVe = maHangVe;
        this.tenHangVe = tenHangVe;
        this.hang = hang;
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

    public Hang getHang() {
        return hang;
    }

    public void setHang(Hang hang) {
        this.hang = hang;
    }
    
    
}
