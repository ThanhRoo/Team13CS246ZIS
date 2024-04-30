/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Legion 5 Pro
 */
public class MayBay {
    private String maMayBay;
    private String loaiMayBay;
    private int soGhe;
    private Hang hangMayBay;

    public MayBay() {
    }
    public MayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }
    public MayBay(String maMayBay, String loaiMayBay, int soGhe, Hang hangMayBay) {   
        this.maMayBay = maMayBay;
        this.loaiMayBay = loaiMayBay;
        this.soGhe = soGhe;
        this.hangMayBay = hangMayBay;
    }
    
    public String getMaMayBay() {
        return maMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public String getLoaiMayBay() {
        return loaiMayBay;
    }

    public void setLoaiMayBay(String loaiMayBay) {
        this.loaiMayBay = loaiMayBay;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public Hang getHangMayBay() {
        return hangMayBay;
    }

    public void setHangMayBay(Hang hangMayBay) {
        this.hangMayBay = hangMayBay;
    }

    
}
